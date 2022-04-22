package com.example.blog.service.serviceimpl;

import com.example.blog.model.dto.CommentsDto;
import com.example.blog.repos.CommentsRepo;
import com.example.blog.service.CommentService;

import java.util.ArrayList;

public class CommentServiceImpl implements CommentService {
    @Override
    public ArrayList<CommentsDto> fetchCommentsByPostId(int id) {
        CommentsRepo commentsRepo = new CommentsRepo();
        return commentsRepo.fetchCommentsByPostId(id);
    }
}
