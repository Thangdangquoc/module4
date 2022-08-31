package com.example.stringboot2class.repository;

import com.example.stringboot2class.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
