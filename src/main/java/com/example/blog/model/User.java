package com.example.blog.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class User {
  private  String email;
  private String password;
  private String firstName;
  private String lastName;
  private String age;
  private boolean enable;
  private  String role;
  private String bio;

}
