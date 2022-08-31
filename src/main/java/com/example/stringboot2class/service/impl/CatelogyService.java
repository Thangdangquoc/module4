package com.example.stringboot2class.service.impl;

import com.example.stringboot2class.model.Category;
import com.example.stringboot2class.repository.CategoryRepository;
import com.example.stringboot2class.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatelogyService implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
