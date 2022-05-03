package com.example.blog.controler;

import com.example.blog.model.dto.PostDto;
import com.example.blog.repos.PostRepo;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
@WebServlet("/create_post")
public class CreatePost extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader bufferedReader = req.getReader();
        PostRepo postRepo = new PostRepo();
        ObjectMapper mapper = new ObjectMapper();
        String data = "";
        if(bufferedReader!=null){
            data = bufferedReader.readLine();
        }
        PostDto postDto = mapper.readValue(data,PostDto.class);
       int id = postRepo.createPost(postDto);
       PostDto post = new PostDto();
        mapper.writeValue(resp.getOutputStream(),post);

    }
}
