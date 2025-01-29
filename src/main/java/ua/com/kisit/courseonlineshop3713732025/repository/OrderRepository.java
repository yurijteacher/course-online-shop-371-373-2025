package ua.com.kisit.courseonlineshop3713732025.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.kisit.courseonlineshop3713732025.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
