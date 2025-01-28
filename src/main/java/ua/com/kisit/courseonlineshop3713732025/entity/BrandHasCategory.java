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
@Table(name = "brand_has_category")
public class BrandHasCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "brands_id")
    private Brands brand;

    @ManyToOne()
    @JoinColumn(name = "categories_id")
    private Categories category;


}
