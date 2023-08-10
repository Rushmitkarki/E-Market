package com.system.E_Market.service;

import com.system.E_Market.dto.CategoryDto;
import com.system.E_Market.entity.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(CategoryDto categoryDto);

    List<Category> getAllCategories();

    Category getCategoryById(int categoryId);

}
