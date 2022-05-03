package com.example.blog.controler;

import com.example.blog.model.Comment;
import com.example.blog.model.dto.CommentsDto;
import com.example.blog.repos.CommentsRepo;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
@WebServlet("/post_comment")
public class CreateCommentcontroller extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader bufferedReader = req.getReader();
        CommentsRepo commentsRepo = new CommentsRepo();
        String data ="";
        if(bufferedReader!=null){
            data = bufferedReader.readLine();
        }
        ObjectMapper mapper = new ObjectMapper();
     Comment comment =  mapper.readValue(data, Comment.class);
      int id=  commentsRepo.inserNewComment(comment);
      CommentsDto commentsDto = commentsRepo.fetchLastCommentByPostId(id);

        mapper.writeValue(resp.getOutputStream(),commentsDto);


    }
}
