package com.example.learnjavaweb.mapper;

import com.example.learnjavaweb.model.NewsModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsMapper implements RowMapper<NewsModel> {

    @Override
    public NewsModel mapRow(ResultSet resultSet) {
        NewsModel news = new NewsModel();
        try {
            news.setId(resultSet.getLong("id"));
            news.setTitle(resultSet.getString("title"));
            return news;
        } catch (SQLException e) {
            return null;
        }
    }
}
