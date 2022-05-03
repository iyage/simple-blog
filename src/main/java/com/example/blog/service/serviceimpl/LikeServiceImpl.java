package com.example.blog.service.serviceimpl;

import com.example.blog.model.Likes;
import com.example.blog.repos.LikesRepo;
import com.example.blog.service.LikeService;

import java.sql.SQLException;

public class LikeServiceImpl implements LikeService {
    @Override
    public int likesCount(Likes likes) throws SQLException {
        LikesRepo likesRepo = new LikesRepo();
        int count = 0;
       if(likesRepo.validateLike(likes)){
           likesRepo.deleteLikes(likes);
           count = likesRepo.fetchPostLilesCounts(likes.getPostId());
       }else{
           likesRepo.insertLikes(likes);
           count = likesRepo.fetchPostLilesCounts(likes.getPostId());
       }

        return count;
    }
}
