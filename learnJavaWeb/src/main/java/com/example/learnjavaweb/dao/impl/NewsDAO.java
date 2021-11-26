package com.example.learnjavaweb.dao.impl;

import com.example.learnjavaweb.dao.INewsDAO;
import com.example.learnjavaweb.mapper.NewsMapper;
import com.example.learnjavaweb.model.NewsModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDAO {
    @Override
    public List<NewsModel> findByCategoryId(long categoryId) {
        String sql = "SELECT * FROM jsp_servlet_learning.news WHERE categoryid = ?";
        return query(sql, new NewsMapper(), categoryId);
    }

    @Override
    public Long save(NewsModel newsModel) {
        String sql = "INSERT INTO news (title, content, categoryid) value(?, ?, ?)";
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        Long id = null;
        try {
            connection = getConnection(); //mở kết nối
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);  //truyền câu lệnh sql cho đối tượng prepareStm
            //tương tự như hàm setParameter() trong AbstractDAO
            //set lần lượt các tham số
            statement.setString(1, newsModel.getTitle());
            statement.setString(2, newsModel.getContent());
            statement.setLong(3, newsModel.getCategoryId());

            statement.executeUpdate();  //thực thi câu lệnh sql
            resultSet = statement.getGeneratedKeys();  //trả về cái gì nhận cái đấy
            if (resultSet.next()) {
                id = resultSet.getLong(1);  //trả về id bài viết (id tự tăng)
            }
            //nếu cả 3 lệnh trên success hết thì nó sẽ commit
            connection.commit();  //sau khi commit thì database mới changed
            return id;
        } catch (SQLException e) {
            if (connection != null) { //nếu 1 trong 3 cái thực thi bên trên mà fail
                try {
                    connection.rollback();  //thì nó sẽ rollback (tức là thu hồi lại request), nó sẽ reset hết những cái đã success về trạng thái ban đầu
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
           return null;
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null ) {
                    statement.close();
                }
            } catch (SQLException e) {
                return null;
            }
        }
    }
}
