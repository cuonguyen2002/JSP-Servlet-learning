package com.example.learnjavaweb.controller.web;

import com.example.learnjavaweb.model.UserModel;
import com.example.learnjavaweb.service.ICategoryService;
import com.example.learnjavaweb.service.INewsService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {

    @Inject
    private ICategoryService categoryService;

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("categoris", categoryService.findAll());
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
        rd.forward(request,response);
    }

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
