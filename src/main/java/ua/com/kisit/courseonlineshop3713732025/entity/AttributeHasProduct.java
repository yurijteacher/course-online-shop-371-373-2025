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
@Table(name = "attribute_has_product")
public class AttributeHasProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private Attributes attributes;
    @ManyToOne
    @JoinColumn(name = "productes_id")
    private Products products;


}
