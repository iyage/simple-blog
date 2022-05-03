package com.example.blog.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private int id;
    private  String email;
    private String firstName;
    private String lastName;
    private String age;
    private String bio;
    private String cover_pics;
    private  String profile_pics;
}
