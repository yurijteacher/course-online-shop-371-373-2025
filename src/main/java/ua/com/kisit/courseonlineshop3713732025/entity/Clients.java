package ua.com.kisit.courseonlineshop3713732025.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
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

    @Size(min = 2, max = 50, message = "значення username має бути в діапазоні від 2 до 50")
    private String username;
    @Size(min = 2, message = "значення password має бути більшим 2")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Roles> rolesset;

}
