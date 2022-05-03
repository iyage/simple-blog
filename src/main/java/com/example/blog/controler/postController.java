package com.example.blog.controler;

import com.example.blog.model.dto.CommentsDto;
import com.example.blog.model.dto.PostDto;
import com.example.blog.model.dto.UserDto;
import com.example.blog.repos.LikesRepo;
import com.example.blog.repos.UserRepo;
import com.example.blog.service.serviceimpl.CommentServiceImpl;
import com.example.blog.service.serviceimpl.PostServiceImpl;
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

@WebServlet("/post")
public class postController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        UserRepo userRepo = new UserRepo();
        LikesRepo likesRepo = new LikesRepo();
        UserDto userDto = null;
        String user = SecurityContextHolder.getContext().getAuthentication().getName();
        if(user!="anonymousUser"){
            userDto = userRepo.fetchUser(user);
        }
        PostServiceImpl postService = new PostServiceImpl();
        CommentServiceImpl commentService = new CommentServiceImpl();
        String data = "";
        BufferedReader bufferedReader = req.getReader();
        if (bufferedReader != null) {
            data = bufferedReader.readLine();
        }
        int id = Integer.parseInt(data);
        PostDto postDto = postService.fetchPostById(id);
     ArrayList<CommentsDto> commentsDtos = commentService.fetchCommentsByPostId(id);
        System.out.println(likesRepo.fetchPostLilesCounts(id));
        int postLikesCounts = likesRepo.fetchPostLilesCounts(id);
        Map<String,Object> json = new HashMap<>();
        json.put("post",postDto);
        json.put("comments",commentsDtos);
        json.put("user",user);
        json.put("userDetails",userDto);
        json.put("postLikesCounts",postLikesCounts);
        mapper.writeValue(resp.getOutputStream(),json);
    }
}
