package ua.com.kisit.courseonlineshop3713732025.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ua.com.kisit.courseonlineshop3713732025.entity.Categories;
import ua.com.kisit.courseonlineshop3713732025.repository.CategoriesRepository;

import java.util.List;

@Service
public class CategoryService {

    private final CategoriesRepository categoriesRepository;


    public CategoryService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    public Categories save(Categories category) {
        return categoriesRepository.save(category);
    }

    public Categories update(Categories category) {
        return categoriesRepository.save(category);
    }

    @Cacheable(cacheNames = "categoryById", key = "#id")
    public Categories findById(Long id) {
        return categoriesRepository.findById(id).orElse(null);
    }

    @Cacheable(cacheNames = "categories")
    public List<Categories> findAll() {
        System.out.println("categories from db");
        return categoriesRepository.findAll();
    }

    public void deleteById(Long id) {
        categoriesRepository.deleteById(id);
    }

    public void deleteAll() {
        categoriesRepository.deleteAll();
    }

    public void deleteByCategory(Categories category) {
        categoriesRepository.delete(category);
    }


}
