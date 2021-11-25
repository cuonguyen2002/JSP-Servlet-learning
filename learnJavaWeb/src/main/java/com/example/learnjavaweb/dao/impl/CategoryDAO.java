package com.example.learnjavaweb.dao.impl;

import com.example.learnjavaweb.dao.ICategoryDAO;
import com.example.learnjavaweb.mapper.CategoryMapper;
import com.example.learnjavaweb.model.CategoryModel;
import java.util.List;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

    @Override
    public List<CategoryModel> findAll() {
        String sql = "SELECT * FROM jsp_servlet_learning.category";
        return query(sql, new CategoryMapper());
    }
}
