package com.example.blog.service;

import com.example.blog.model.dto.PostDto;

import java.util.ArrayList;
public interface PostService {
    public ArrayList<PostDto> fetchAllFrontPages();
    public PostDto fetchPostById(int id);
    public PostDto fetchPostByUserrId(int id);
    public  int createPost(PostDto postDto);

}
