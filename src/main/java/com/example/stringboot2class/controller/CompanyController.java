package com.example.stringboot2class.controller;

import com.example.stringboot2class.model.Company;
import com.example.stringboot2class.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("company")
public class CompanyController {
    @Autowired
    private ICompanyService iCompanyService;

    @GetMapping
    private ResponseEntity<List<Company>> display(){
        return new ResponseEntity<>(iCompanyService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<Company> create(@RequestBody Company company ){
        return new ResponseEntity<>(iCompanyService.save(company), HttpStatus.CREATED);
    }
}
