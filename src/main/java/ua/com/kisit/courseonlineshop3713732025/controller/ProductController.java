package ua.com.kisit.courseonlineshop3713732025.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.com.kisit.courseonlineshop3713732025.entity.Categories;
import ua.com.kisit.courseonlineshop3713732025.service.CategoryService;
import ua.com.kisit.courseonlineshop3713732025.service.ProductService;

@Controller
public class ProductController {

    private final ProductService productService;
    private final CategoryService categoryService;

    public ProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @GetMapping("/category/{id}")
    public String category(@PathVariable(name = "id") Categories category,
                           Model model) {

        model.addAttribute("products", productService.getProductsByCategory(category));

        model.addAttribute("hello", "Hello World!");
        model.addAttribute("categories", categoryService.findAll());

        return "productsByCategory";
    }

}
