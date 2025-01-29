package ua.com.kisit.courseonlineshop3713732025.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.kisit.courseonlineshop3713732025.entity.Brands;
import ua.com.kisit.courseonlineshop3713732025.entity.Categories;
import ua.com.kisit.courseonlineshop3713732025.entity.Manufacturers;
import ua.com.kisit.courseonlineshop3713732025.entity.Products;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products, Long> {

    Products findByName(String name);

    List<Products> findAllByCategory(Categories category);
    List<Products> findAllByBrand(Brands brand);
    List<Products> findAllByBrandAndCategory(Brands brand, Categories category);
    List<Manufacturers> findAllByManufacturer(Manufacturers manufacturer);

}
