package com.example.blog.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {
    private String post;
    private  String profilePics;
    private boolean frontPage;
    private int id;
    private String headLine;
    private  String firstName;
    private  String email;
}
