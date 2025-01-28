package ua.com.kisit.courseonlineshop3713732025.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateCreated;

    @ManyToOne()
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    @ManyToOne()
    @JoinColumn(name = "payment_id")
    private Payment payment;
    private String status;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private Customers customer;

    @OneToMany(mappedBy = "order")
    private List<ProductHasOrder> productHasOrders;

}
