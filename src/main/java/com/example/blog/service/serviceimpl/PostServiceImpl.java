package com.example.blog.service.serviceimpl;

import com.example.blog.model.dto.PostDto;
import com.example.blog.repos.PostRepo;
import com.example.blog.service.PostService;

import java.util.ArrayList;

public class PostServiceImpl implements PostService {
    @Override
    public ArrayList<PostDto> fetchAllFrontPages() {
        PostRepo postRepo = new PostRepo();
        return postRepo.loadFrontPagePost();
    }

    @Override
    public PostDto fetchPostById(int id) {
        PostRepo postRepo = new PostRepo();
        return postRepo.LoadPostById(id);
    }

    @Override
    public PostDto fetchPostByUserrId(int id) {
        return null;
    }

    @Override
    public int createPost(PostDto postDto) {
        PostRepo postRepo = new PostRepo();
        return  postRepo.createPost(postDto);
    }
}
