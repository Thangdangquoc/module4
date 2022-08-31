package com.example.stringboot2class.controller;

import com.example.stringboot2class.model.Category;
import com.example.stringboot2class.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping
    private ResponseEntity<List<Category>> display(){
        return new ResponseEntity<>(iCategoryService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    private ResponseEntity<Category> createCatelogy(@RequestBody Category category){
        return new ResponseEntity<>(iCategoryService.save(category), HttpStatus.CREATED);
    }
}
