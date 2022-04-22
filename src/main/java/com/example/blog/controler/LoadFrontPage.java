package com.example.blog.controler;

import com.example.blog.service.serviceimpl.PostServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/fetch_front_page")
public class LoadFrontPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        PostServiceImpl postService = new PostServiceImpl();
        objectMapper.writeValue(resp.getOutputStream(), postService.fetchAllFrontPages());
    }
}
