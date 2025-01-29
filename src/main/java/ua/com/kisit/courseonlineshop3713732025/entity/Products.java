package ua.com.kisit.courseonlineshop3713732025.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(length = 200)
    private String short_description;
    @Column(length = 1024)
    private String full_description;

    private BigDecimal price; // **.**

    private String linkImage;

    @OneToMany(mappedBy = "productImages")
    private List<Images> imagesProduct;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturers manufacturer;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brands brand;

    @OneToMany(mappedBy = "product")
    private List<ProductHasOrder> productHasOrderList;



}
