package ua.com.kisit.courseonlineshop3713732025.service;

import org.springframework.stereotype.Service;
import ua.com.kisit.courseonlineshop3713732025.entity.Customers;
import ua.com.kisit.courseonlineshop3713732025.repository.ClientsRepository;
import ua.com.kisit.courseonlineshop3713732025.repository.CustomersRepository;

@Service
public class CustomerService {

    private final CustomersRepository customersRepository;


    public CustomerService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public Customers saveNewCustomer(Customers customer) {
        return customersRepository.save(customer);
    }


}
