package com.example.blog.service.serviceimpl;

import com.example.blog.model.User;
import com.example.blog.repos.RegistrationRepo;
import com.example.blog.service.Registrationservice;

public class RegistrationServiceImpl implements Registrationservice {
    @Override
    public boolean registerUser(User user) {
        user.setEnable(true);
        user.setRole("user");
        RegistrationRepo regRepo = new RegistrationRepo();
         regRepo.registrationRepo(user);
        return false;
    }
}
