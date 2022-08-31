package com.example.stringboot2class.repository;

import com.example.stringboot2class.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
