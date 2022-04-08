package com.example.spring.jpa.app.repository;

import com.example.spring.jpa.app.controller.CustomerResponse;
import com.example.spring.jpa.app.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.example.spring.jpa.app.controller.CustomerResponse(c.name, p.prodName) FROM Customer c JOIN c.products p")
    public List<CustomerResponse> getJoinInformation();
}
