package ua.com.kisit.courseonlineshop3713732025.service;


import org.springframework.stereotype.Service;
import ua.com.kisit.courseonlineshop3713732025.entity.Orders;
import ua.com.kisit.courseonlineshop3713732025.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Orders saveNewOrder(Orders order) {  //
        return orderRepository.save(order);
    }

}
