package com.example.blog.controler;

import com.example.blog.model.dto.CommentsDto;
import com.example.blog.model.dto.PostDto;
import com.example.blog.model.dto.UserDto;
import com.example.blog.service.serviceimpl.CommentServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
@WebServlet("/test")
public class TestController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CommentServiceImpl commentService = new CommentServiceImpl();
   ArrayList<CommentsDto> commentsDtos = commentService.fetchCommentsByPostId(1);
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getOutputStream(),mapper.writeValueAsString(commentsDtos));

    }
}
