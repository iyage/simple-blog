package com.example.blog.controler;

import com.example.blog.model.Likes;
import com.example.blog.service.serviceimpl.LikeServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLException;
@WebServlet("/post_likes_count")
public class PostLikesController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        BufferedReader bufferedReader = req.getReader();
        LikeServiceImpl likeService = new LikeServiceImpl();
        int count = 0;
        String data = "";
        if(bufferedReader!=null){
            data = bufferedReader.readLine();
        }
        Likes likes = objectMapper.readValue(data,Likes.class);
        try {
           count = likeService.likesCount(likes);
        } catch (SQLException e) {
            e.printStackTrace();
        }
       objectMapper.writeValue(resp.getOutputStream(),count);
    }
}
