package com.example.spring.jpa.app.controller;

import com.example.spring.jpa.app.entity.Customer;
import com.example.spring.jpa.app.entity.CustomerOrderRequest;
import com.example.spring.jpa.app.repository.CustomerRepo;
import com.example.spring.jpa.app.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingController {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ProductRepo productRepo;

    @PostMapping("/SaveOrder")
    public Customer saveOrder(@RequestBody CustomerOrderRequest customerOrderRequest){
        return customerRepo.save(customerOrderRequest.getCustomer());
    }

    @GetMapping("/FetchAll")
    public List<Customer>fetchAllCustomers(){
        return customerRepo.findAll();
    }

    @GetMapping("/getJoinInformation")
    public List<CustomerResponse> getJoinInformation(){
        return customerRepo.getJoinInformation();
    }

}
