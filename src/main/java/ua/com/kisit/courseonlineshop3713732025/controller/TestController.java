package ua.com.kisit.courseonlineshop3713732025.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.kisit.courseonlineshop3713732025.service.CategoryService;

@Controller
public class TestController {

    private final CategoryService categoryService;

    public TestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String getHomePage(Model model) {

        model.addAttribute("hello", "Hello World!");
        model.addAttribute("categories", categoryService.findAll());

        return "index";
    }


}
