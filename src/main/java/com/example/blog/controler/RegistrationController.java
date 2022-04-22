package com.example.blog.controler;

import  com.example.blog.model.*;
import  com.example.blog.repos.*;
import com.example.blog.service.serviceimpl.RegistrationServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
@WebServlet("/register")
public class RegistrationController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        RegistrationServiceImpl registrationService= new RegistrationServiceImpl();
        String data = "";
        BufferedReader bufferedReader = req.getReader();
        if (bufferedReader != null) {
            data = bufferedReader.readLine();
        }
        System.out.println(data);
        ObjectMapper objectMapper = new ObjectMapper();
        User user =  objectMapper.readValue(data,User.class);
        registrationService.registerUser(user);
        objectMapper.writeValue(resp.getOutputStream(), "registration succesfull");
    }
}
