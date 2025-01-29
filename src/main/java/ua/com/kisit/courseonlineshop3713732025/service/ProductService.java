package ua.com.kisit.courseonlineshop3713732025.service;

import org.springframework.stereotype.Service;
import ua.com.kisit.courseonlineshop3713732025.entity.Products;
import ua.com.kisit.courseonlineshop3713732025.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Products saveProduct(Products product) {
        return productRepository.save(product);
    }

    public Products updateProduct(Products product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Products product) {
      productRepository.delete(product);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    public Products getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

}
