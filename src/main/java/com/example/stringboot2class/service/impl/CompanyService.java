package com.example.stringboot2class.service.impl;

import com.example.stringboot2class.model.Company;
import com.example.stringboot2class.repository.CompanyRepository;
import com.example.stringboot2class.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService implements ICompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public void delete(Long id) {
        companyRepository.deleteById(id);
    }

    @Override
    public Optional<Company> findById(Long id) {
        return companyRepository.findById(id);
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }
}
