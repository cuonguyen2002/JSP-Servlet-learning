package com.example.learnjavaweb.dao;

import com.example.learnjavaweb.model.NewsModel;

import java.util.List;

public interface INewsDAO extends GenericDAO<NewsModel> {
    List<NewsModel> findByCategoryId(long categoryId);
    Long save(NewsModel newsModel);
    void delete(NewsModel newsModel);  //(long[] ids) mới đúng
}
