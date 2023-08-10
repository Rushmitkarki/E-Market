package com.system.E_Market.service.impl;

import com.system.E_Market.dto.CategoryDto;
import com.system.E_Market.entity.Category;
import com.system.E_Market.repo.CategoryRepo;
import com.system.E_Market.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo  categoryRepo;

    @Override
    public void addCategory(CategoryDto categoryDto) {
        Category category = new Category();
        category.setCategoryName(categoryDto.getCategoryName());
        categoryRepo.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public Category getCategoryById(int categoryId) {
        return categoryRepo.findById(categoryId).get();
    }
}
