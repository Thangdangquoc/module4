package com.example.stringboot2class.repository;

import com.example.stringboot2class.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
