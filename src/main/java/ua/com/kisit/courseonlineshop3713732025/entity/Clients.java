package ua.com.kisit.courseonlineshop3713732025.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "clients")
public class Clients {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI NN
    private Long id;

    private String username;
    private String password;


    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Roles> rolesset;

}
