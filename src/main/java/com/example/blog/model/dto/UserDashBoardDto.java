package com.example.blog.model.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class UserDashBoardDto {
    private   UserDto userDetails ;
    private String authentication;
    private  UserDto logInUser;
    private  String API_KEY;
    private ArrayList<PostDto>userPost;
  private  ArrayList<CommentsDto> allComments;

}

