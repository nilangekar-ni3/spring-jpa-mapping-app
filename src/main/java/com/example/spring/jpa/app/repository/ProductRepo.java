package com.example.spring.jpa.app.repository;

import com.example.spring.jpa.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
