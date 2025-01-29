package ua.com.kisit.courseonlineshop3713732025.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "rating")
public class Ratings {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI NN
    private Long id;

    private double rating;
    private String review;

    @ManyToOne
    @JoinColumn(name = "productrat_id")
    private Products productRating;

    @ManyToOne
    @JoinColumn(name = "customerrat_id")
    private Customers customerRating;

}
