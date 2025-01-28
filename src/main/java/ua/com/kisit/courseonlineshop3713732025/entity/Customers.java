package ua.com.kisit.courseonlineshop3713732025.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 60, name = "first_name")
    private String firstName;
    @Column(nullable = false, length = 60, name = "last_name")
    private String lastName;

    private String email;
    private String phone;

    @OneToMany(mappedBy = "customerAddress")
    private List<Address> addressList;

    @OneToOne
    @MapKey
    @MapsId
    @JoinColumn(name = "id")
    private Clients client;

    @OneToMany(mappedBy = "customer")
    private List<Orders> ordersList;

}
