package com.example.blog.service;

import com.example.blog.model.dto.UserDto;

public interface UserService {
    public UserDto fetchUserDetails(String email);
}
