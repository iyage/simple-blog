package com.example.blog.repos;

import com.example.blog.connection.Connection;
import com.example.blog.model.Comment;
import com.example.blog.model.dto.CommentsDto;

import java.sql.*;
import java.util.ArrayList;

public class CommentsRepo {
    String query = "SELECT comments.id,comments.comment,comments.user_id,comments.post_id, user.first_name,user.profile_pics,user.email from comments INNER JOIN user on comments.user_id=user.id WHERE comments.post_id=?;";

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
                       commentsDto.setEmail(resultSet.getString("email"));
                       commentsDto.setUserId(resultSet.getInt("user_id"));
                       comments.add(commentsDto);
                   }
                   preparedStatement.close();
                   Connection.getInstance().getConnection().close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
       }

   return comments;
       }

    public ArrayList<CommentsDto> fetchAllComments(){
           String query = "SELECT comments.id,comments.comment," +
            "comments.user_id,comments.post_id, " +
            "user.first_name,user.profile_pics,user.email from comments INNER JOIN user ON " +
            "comments.user_id=user.id";
        ArrayList<CommentsDto> comments = new ArrayList<>();
        {
            try {
                PreparedStatement  preparedStatement = Connection.getInstance().getStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    CommentsDto commentsDto = new CommentsDto();
                    commentsDto.setComment(resultSet.getString("comment"));
                    commentsDto.setFirstName(resultSet.getString("first_name"));
                    commentsDto.setId(resultSet.getInt("id"));
                    commentsDto.setPostId(resultSet.getInt("post_id"));
                    commentsDto.setProfilePics(resultSet.getString("profile_pics"));
                    commentsDto.setEmail(resultSet.getString("email"));
                    commentsDto.setUserId(resultSet.getInt("user_id"));
                    comments.add(commentsDto);
                }
                preparedStatement.close();
                Connection.getInstance().getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return comments;
    }






       public  CommentsDto  fetchLastCommentByPostId(int id){
           String query = "SELECT comments.id,comments.comment,comments.user_id," +
                   "comments.post_id, user.first_name,user.profile_pics,user.email from comments INNER JOIN " +
                   "user on comments.user_id=user.id WHERE comments.id=?;";
           CommentsDto commentsDto = new CommentsDto();
           try {
               PreparedStatement preparedStatement = Connection.getInstance().getStatement(query);
               preparedStatement.setInt(1,id);
               ResultSet resultSet = preparedStatement.executeQuery();
               while (resultSet.next()){
                   commentsDto.setComment(resultSet.getString("comment"));
                   commentsDto.setFirstName(resultSet.getString("first_name"));
                   commentsDto.setId(resultSet.getInt("id"));
                   commentsDto.setPostId(resultSet.getInt("post_id"));
                   commentsDto.setProfilePics(resultSet.getString("profile_pics"));
                   commentsDto.setEmail(resultSet.getString("email"));
                   commentsDto.setUserId(resultSet.getInt("user_id"));
               }

               preparedStatement.close();
               Connection.getInstance().getConnection().close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
     return  commentsDto;
       }
       public int inserNewComment(Comment comment){
         int id =0;
           String query = "INSERT INTO comments (comment,user_id,post_id) VALUES(?,?,?)";

           try {
               PreparedStatement preparedStatement = Connection.getInstance().getStatement(query,Statement.RETURN_GENERATED_KEYS );
               preparedStatement.setString(1,comment.getComment());
               preparedStatement.setInt(2,comment.getUserId());
               preparedStatement.setInt(3,comment.getPostId());

                preparedStatement.executeUpdate();
           ResultSet resultSet = preparedStatement.getGeneratedKeys();
           if (resultSet.next()){
           id = resultSet.getInt(1);
           }
               preparedStatement.close();
               Connection.getInstance().getConnection().close();
           } catch (SQLException e) {
               e.printStackTrace();
           }

      return id;
       }

}
