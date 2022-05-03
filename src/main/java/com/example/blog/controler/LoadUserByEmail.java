package com.example.blog.controler;

import com.example.blog.model.dto.CommentsDto;
import com.example.blog.model.dto.UserDashBoardDto;
import com.example.blog.model.dto.UserDto;
import com.example.blog.repos.CommentsRepo;
import com.example.blog.repos.PostRepo;
import com.example.blog.repos.UserRepo;
import com.example.blog.service.serviceimpl.LoadSecreteService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
@WebServlet("/load_user_by_email")
public class LoadUserByEmail extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
      String authenticateemail = SecurityContextHolder.getContext().getAuthentication().getName();
        UserRepo userRepo = new UserRepo();
        PostRepo postRepo = new PostRepo();
        ObjectMapper mapper = new ObjectMapper();
      String email = "";
        BufferedReader bufferedReader = req.getReader();
        if(bufferedReader!=null){
            email= bufferedReader.readLine();

        }
        CommentsRepo commentsRepo = new CommentsRepo();
        LoadSecreteService loadSecreteService = new LoadSecreteService();
        Map<String, String> secret= loadSecreteService.loadSecret();
        UserDashBoardDto userDashBoardDto = new UserDashBoardDto();
        userDashBoardDto.setUserPost( postRepo.loadUserPost(userRepo.fetchUser(email).getId()));
        userDashBoardDto.setLogInUser(userRepo.fetchUser(authenticateemail));
        userDashBoardDto.setUserDetails(userRepo.fetchUser(email));
        userDashBoardDto.setAuthentication(authenticateemail);
        userDashBoardDto.setAPI_KEY(secret.get("API_KEY"));
        userDashBoardDto.setAllComments(commentsRepo.fetchAllComments());
        mapper.writeValue(resp.getOutputStream(),userDashBoardDto);
    }
}
