package com.example.blog.service.serviceimpl;

import com.example.blog.model.dto.UserDto;
import com.example.blog.repos.UserRepo;
import com.example.blog.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public UserDto fetchUserDetails(String email) {
        UserRepo userRepo = new UserRepo();
        UserDto user = userRepo.fetchUser(email);
        return user;
    }
}
