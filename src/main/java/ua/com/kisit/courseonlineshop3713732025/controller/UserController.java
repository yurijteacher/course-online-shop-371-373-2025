package ua.com.kisit.courseonlineshop3713732025.controller;

import ch.qos.logback.core.net.server.Client;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.kisit.courseonlineshop3713732025.bl.Cart;
import ua.com.kisit.courseonlineshop3713732025.entity.Categories;
import ua.com.kisit.courseonlineshop3713732025.entity.Clients;
import ua.com.kisit.courseonlineshop3713732025.entity.Customers;
import ua.com.kisit.courseonlineshop3713732025.service.CategoryService;
import ua.com.kisit.courseonlineshop3713732025.service.ClientService;
import ua.com.kisit.courseonlineshop3713732025.service.CustomerService;

@Controller
public class UserController {

    private final ClientService clientService;
    private final CustomerService customerService;
    private final CategoryService categoryService;


    public UserController(ClientService clientService, CustomerService customerService, CategoryService categoryService) {
        this.clientService = clientService;
        this.customerService = customerService;
        this.categoryService = categoryService;
    }

    @GetMapping("/login")
    public String getPageLogin(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return "login";
    }

    @GetMapping("/registration")
    public String getPageRegistration(Model model) {

        model.addAttribute("customers", new Customers());
        model.addAttribute("clients", new Clients());
        model.addAttribute("categories", categoryService.findAll());

        return "registration";
    }

    @PostMapping("/registration")
    public String registrationNewUser(@Valid Customers customer,
                                      BindingResult bindingResult1,
                                      @Valid Clients client,
                                      BindingResult bindingResult2
                                      ){

        if (bindingResult1.hasErrors()) {
            return "registration";
        }

        if (bindingResult2.hasErrors()) {
            return "registration";
        }

        // Перевірка чи існує login
        if(clientService.getClientByLogin(client.getUsername())){
            return "redirect:/registration";
        }

        Clients clients = clientService.saveNewClient(client);
        customer.setClient(clients);

        customerService.saveNewCustomer(customer);

        return "redirect:/login";
    }


    @PostMapping("/login")
    public String getAuth(
            @RequestParam(name = "username") String username,
            @RequestParam(name = "password") String password,
            HttpServletRequest request

    ){
        HttpSession session = request.getSession();

        if(clientService.getClientByLoginAndPassword(username,password)){

            session.setAttribute("user", clientService.getClientByUsername(username).getId());

            Cart cart = (Cart) session.getAttribute("cart");

            if(cart==null){
                return "redirect:/";
            }

            return "redirect:/order";

        } else {
            return "redirect:/registration";
        }
    }




}
