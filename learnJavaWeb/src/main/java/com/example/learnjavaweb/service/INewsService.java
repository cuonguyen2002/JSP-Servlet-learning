package com.example.learnjavaweb.service;

import com.example.learnjavaweb.model.NewsModel;

import java.util.List;

public interface INewsService {
    List<NewsModel> findByCategoryId(long categoryId);
}
