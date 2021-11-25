package com.example.learnjavaweb.dao;

import com.example.learnjavaweb.model.CategoryModel;

import java.util.List;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
    List<CategoryModel> findAll();
}
