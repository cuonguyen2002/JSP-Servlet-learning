package com.example.learnjavaweb.dao.impl;

import com.example.learnjavaweb.dao.INewsDAO;
import com.example.learnjavaweb.mapper.NewsMapper;
import com.example.learnjavaweb.model.NewsModel;

import java.util.List;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDAO {

    @Override
    public List<NewsModel> findByCategoryId(long categoryId) {
        String sql = "SELECT * FROM jsp_servlet_learning.news WHERE categoryid = ?";
        return query(sql, new NewsMapper(), categoryId);
    }

    @Override
    public Long save(NewsModel newsModel) {
        String sql = "INSERT INTO news (title, content, categoryid) VALUES (?, ?, ?)";
        return insert(sql, newsModel.getTitle(), newsModel.getContent(), newsModel.getCategoryId());
    }

    @Override
    public void delete(NewsModel newsModel) { //(long[] ids) mới đúng
        String sql = "DELETE FROM jsp_servlet_learning.news WHERE id = ?";
        this.update(sql, newsModel.getId());
    }


}
