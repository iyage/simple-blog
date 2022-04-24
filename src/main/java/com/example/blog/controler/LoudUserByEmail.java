package com.example.blog.controler;

import com.example.blog.model.dto.UserDto;
import com.example.blog.repos.UserRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@WebServlet("/load_user_by_email")
public class LoudUserByEmail extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String authenticateemail = SecurityContextHolder.getContext().getAuthentication().getName();
        UserRepo userRepo = new UserRepo();
        ObjectMapper mapper = new ObjectMapper();
      String email = "";
        BufferedReader bufferedReader = req.getReader();
        if(bufferedReader!=null){
            email= bufferedReader.readLine();

        }
        UserDto logedInUser = userRepo.fetchUser(authenticateemail);
        UserDto userDto = userRepo.fetchUser(email);
        Map<String,Object> json = new HashMap<>();
        json.put("userDetails",userDto);
        json.put("authentication",authenticateemail);
        json.put("logInUser",logedInUser);
        mapper.writeValue(resp.getOutputStream(),json);



    }
}
