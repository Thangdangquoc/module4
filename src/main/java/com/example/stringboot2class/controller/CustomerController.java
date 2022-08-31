package com.example.stringboot2class.controller;

import com.example.stringboot2class.model.Customer;
import com.example.stringboot2class.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping
    private ResponseEntity<List<Customer>> display(){
        return new ResponseEntity<>(iCustomerService.findAll(), HttpStatus.OK);
    }@PostMapping
    private ResponseEntity<Customer> create(@RequestBody Customer customer){
        return new ResponseEntity<>(iCustomerService.save(customer), HttpStatus.CREATED);
    }
}
