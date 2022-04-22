package com.example.blog.repos;

import com.example.blog.connection.Connection;
import com.example.blog.model.dto.CommentsDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CommentsRepo {
    String query = "SELECT comments.id,comments.comment,comments.user_id,comments.post_id, user.first_name,user.profile_pics from comments INNER JOIN user on comments.user_id=user.id WHERE comments.post_id=?;";

       public ArrayList<CommentsDto> fetchCommentsByPostId(int id){
           ArrayList<CommentsDto> comments = new ArrayList<>();
           {
               try {
                   PreparedStatement  preparedStatement = Connection.getInstance().getStatement(query);
                   preparedStatement.setInt(1,id);
                   ResultSet resultSet = preparedStatement.executeQuery();
                   while (resultSet.next()){
                       CommentsDto commentsDto = new CommentsDto();
                       commentsDto.setComment(resultSet.getString("comment"));
                       commentsDto.setFirstName(resultSet.getString("first_name"));
                       commentsDto.setId(resultSet.getInt("id"));
                       commentsDto.setPostId(resultSet.getInt("post_id"));
                       commentsDto.setProfilePics(resultSet.getString("profile_pics"));
                       commentsDto.setUserId(resultSet.getInt("user_id"));
                       comments.add(commentsDto);

                   }
               } catch (SQLException e) {
                   e.printStackTrace();
               }
       }

   return comments;
       }

}
