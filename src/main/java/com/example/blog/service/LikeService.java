package com.example.blog.service;

import com.example.blog.model.Likes;

import java.sql.SQLException;

public interface LikeService {
    public int likesCount(Likes likes) throws SQLException;
}
