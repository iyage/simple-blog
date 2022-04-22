package com.example.blog.service;

import com.example.blog.model.dto.CommentsDto;

import java.util.ArrayList;

public interface CommentService {
    public ArrayList<CommentsDto> fetchCommentsByPostId(int id);
}
