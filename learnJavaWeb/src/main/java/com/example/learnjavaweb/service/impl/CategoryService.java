package com.example.learnjavaweb.service.impl;

import com.example.learnjavaweb.dao.ICategoryDAO;
import com.example.learnjavaweb.model.CategoryModel;
import com.example.learnjavaweb.service.ICategoryService;

import javax.inject.Inject;
import java.util.List;

public class CategoryService implements ICategoryService {

    @Inject
    private ICategoryDAO categoryDAO;

    @Override
    public List<CategoryModel> findAll() {
        return categoryDAO.findAll();
    }
}
