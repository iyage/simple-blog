package com.example.blog.model;

import lombok.Data;

@Data
public class Comment {
   int postId;
   int userId;
   String comment;
}
