package com.example.blog.controler;

import com.example.blog.model.ImageUrl;
import com.example.blog.service.serviceimpl.ImageUploadServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
@WebServlet("/upload_profile")
public class ProfillePicsUploadController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = userDetails.getUsername();
        ImageUploadServiceImpl uploadProfileService = new ImageUploadServiceImpl();
        String url  ="";
        BufferedReader bufferedReader  = req.getReader();
        ObjectMapper mapper = new ObjectMapper();
        if (bufferedReader !=null){
            url=bufferedReader.readLine();
        }
        System.out.println(url);
      ImageUrl imageUrl =  mapper.readValue(url, ImageUrl.class);
        uploadProfileService.uploadProfile(email, imageUrl.getProfileImageUrl());
        mapper.writeValue(resp.getOutputStream(), "upload successfull");

    }
}
