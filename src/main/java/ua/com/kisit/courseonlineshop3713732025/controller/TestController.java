package ua.com.kisit.courseonlineshop3713732025.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {


    @GetMapping("/")
    public String getHomePage(Model model) {

        model.addAttribute("hello", "Hello World!");

        return "index";
    }


}
