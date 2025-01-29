package ua.com.kisit.courseonlineshop3713732025.service;

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

    public Categories findById(Long id) {
        return categoriesRepository.findById(id).orElse(null);
    }

    public List<Categories> findAll() {
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
