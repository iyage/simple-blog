package com.example.blog.model.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class CommentsDto {
            private int id;
            private String comment;
            private int userId;
            private int postId;
            private  String firstName;
            private String profilePics;
}
