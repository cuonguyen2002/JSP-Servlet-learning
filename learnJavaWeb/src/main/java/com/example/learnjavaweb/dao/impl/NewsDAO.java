package com.example.learnjavaweb.dao.impl;

import com.example.learnjavaweb.dao.INewsDAO;
import com.example.learnjavaweb.mapper.NewsMapper;
import com.example.learnjavaweb.model.NewsModel;

import java.util.List;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDAO {
    String sql = "SELECT * FROM jsp_servlet_learning.news WHERE categoryid = ?";
    @Override
    public List<NewsModel> findByCategoryId(long categoryId) {
        return query(sql, new NewsMapper(), categoryId);
    }
}
