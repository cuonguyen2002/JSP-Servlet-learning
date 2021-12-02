package com.example.learnjavaweb.controller.admin.api;

import com.example.learnjavaweb.service.INewsService;
import com.example.learnjavaweb.utils.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api-admin-news"})
public class NewsAPI extends HttpServlet {

    //thêm bài viết
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");  //set định dạng dữ liệu client trả về server là tiếng việt
        response.setContentType("application/json");  //set định dạng trả lại client cũng là json
        HttpUtil.of(request.getReader());
    }

//    //cập nhật bài viết
//    protected void doPut(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//    }
//
//    //xóa bài viết
//    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//    }
}
