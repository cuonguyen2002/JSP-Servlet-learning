package com.example.learnjavaweb.mapper;

import com.example.learnjavaweb.model.CategoryModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<CategoryModel> {
    @Override
    public CategoryModel mapRow(ResultSet resultSet) {
        CategoryModel categoryModel = new CategoryModel();
        try {
            categoryModel.setId(resultSet.getLong("id"));
            categoryModel.setName(resultSet.getString("name"));
            categoryModel.setCode(resultSet.getString("code"));
            return categoryModel;
        } catch (SQLException e) {
            return null;
        }

    }
}
