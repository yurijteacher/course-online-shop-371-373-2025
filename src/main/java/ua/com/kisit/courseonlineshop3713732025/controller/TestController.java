package ua.com.kisit.courseonlineshop3713732025.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.kisit.courseonlineshop3713732025.entity.Categories;
import ua.com.kisit.courseonlineshop3713732025.service.CategoryService;

import java.util.List;

@Controller
public class TestController {

    private final CategoryService categoryService;

    public TestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping({"/", "/categories"})
    public String getHomePage(Model model) {


        List<Categories> categoriesList = categoryService.findAll();

        model.addAttribute("hello", "Hello World!");
        model.addAttribute("categories", categoryService.findAll());

        return "index1";
    }

    @GetMapping("/delivery")
    public String getDeliveryPage(Model model) {

        model.addAttribute("hello", "Hello World!");
        model.addAttribute("categories", categoryService.findAll());

        return "delivery";
    }

    @GetMapping("/payment")
    public String getPaymentPage(Model model) {

        model.addAttribute("hello", "Hello World!");
        model.addAttribute("categories", categoryService.findAll());

        return "payment";
    }

    @GetMapping("/about-us")
    public String getInfoPage(Model model) {

        model.addAttribute("hello", "Hello World!");
        model.addAttribute("categories", categoryService.findAll());

        return "about-us";
    }



}
