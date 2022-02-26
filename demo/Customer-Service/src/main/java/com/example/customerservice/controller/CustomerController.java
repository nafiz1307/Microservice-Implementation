package com.example.customerservice.controller;

import com.example.customerservice.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customers")

public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/")
    private Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("{/id}")
    public Customer findCustomerById(@PathVariable("id") String customerId){
        return customerService.findCustomerById(customerId);
    }
}
