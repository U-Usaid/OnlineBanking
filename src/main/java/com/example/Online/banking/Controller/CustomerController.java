package com.example.Online.banking.Controller;

import com.example.Online.banking.Model.Customer;
import com.example.Online.banking.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping(value = "getAll")
    public List<Customer> getCustomer(){
        return customerService.getAllCustomers();
    }
}
