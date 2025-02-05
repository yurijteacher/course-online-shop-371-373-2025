package ua.com.kisit.courseonlineshop3713732025.service;

import org.springframework.stereotype.Service;
import ua.com.kisit.courseonlineshop3713732025.entity.Orders;
import ua.com.kisit.courseonlineshop3713732025.entity.ProductHasOrder;
import ua.com.kisit.courseonlineshop3713732025.entity.Products;
import ua.com.kisit.courseonlineshop3713732025.repository.ProductHasOrderRepository;

@Service
public class ProductHasOrderService {

    private final ProductHasOrderRepository productHasOrderRepository;


    public ProductHasOrderService(ProductHasOrderRepository productHasOrderRepository) {
        this.productHasOrderRepository = productHasOrderRepository;
    }


    public void saveNewProductByOrder(Products product, Orders order, int quantity) {
        productHasOrderRepository.save(new ProductHasOrder(product, order, quantity));
    }
}
