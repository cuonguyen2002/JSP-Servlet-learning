package com.example.learnjavaweb.service.impl;

import com.example.learnjavaweb.dao.INewsDAO;
import com.example.learnjavaweb.model.NewsModel;
import com.example.learnjavaweb.service.INewsService;

import javax.inject.Inject;
import java.util.List;

public class NewsService implements INewsService {

    @Inject
    private INewsDAO newsDAO;

    @Override
    public List<NewsModel> findByCategoryId(long categoryId) {
        return newsDAO.findByCategoryId(categoryId);
    }

    @Override
    public NewsModel save(NewsModel newsModel) {
        return null;  //tạm thời
    }
}
