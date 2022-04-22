package com.example.blog.controler;

import com.example.blog.model.dto.UserDto;
import com.example.blog.service.serviceimpl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/load_user_data")
public class LoadUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String response = "";
        UserDto userDto= new  UserDto();
        UserServiceImpl userService = new UserServiceImpl();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email =   authentication.getName();
        ObjectMapper mapper = new ObjectMapper();
        if(email=="anonymousUser"){
            response = "anonymous user";

        }
        else{
            userDto= userService.fetchUserDetails(email);
            response   =    mapper.writeValueAsString(userDto);
        }

       mapper.writeValue(resp.getOutputStream(),response);
    }
}
