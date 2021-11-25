package com.example.learnjavaweb.service;

import com.example.learnjavaweb.model.CategoryModel;

import java.util.List;

public interface ICategoryService {
    List<CategoryModel> findAll();
}
