package ua.com.kisit.courseonlineshop3713732025.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.kisit.courseonlineshop3713732025.entity.Categories;
import ua.com.kisit.courseonlineshop3713732025.service.CategoryService;
import ua.com.kisit.courseonlineshop3713732025.service.ProductService;

import java.util.Optional;

@Controller
public class ProductController {

    private final ProductService productService;
    private final CategoryService categoryService;

    public ProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @GetMapping("/category/{id}")
    public String category(@PathVariable(name = "id") Long id,
                           Model model) {

        Categories category = (Categories) categoryService.findById(id);
        if (category == null) {
            return "redirect:/";
        }

        model.addAttribute("products", productService.getProductsByCategory(category));

        model.addAttribute("hello", "Hello World!");
        model.addAttribute("categories", categoryService.findAll());

        return "productsByCategory";
    }

    @GetMapping("/list_card")
    public String getPageCategory(@RequestParam(name = "list1", defaultValue = "false") String list1,
                                  HttpServletRequest request,
                                  Model model) {

        HttpSession session = request.getSession();

        if(list1.equals("true")) {
            session.setAttribute("list1", true);
            model.addAttribute("list1", "true");
        } else {
            session.setAttribute("list1", false);
            model.addAttribute("list1", "false");
        }

        model.addAttribute("categories", categoryService.findAll());

        return "index1";
    }


}
