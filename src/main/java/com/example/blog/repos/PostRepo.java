package com.example.blog.repos;

import com.example.blog.connection.Connection;
import com.example.blog.model.dto.PostDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PostRepo {
    public int createPost(PostDto postDto){
        int key =0;
        String query = "INSERT INTO posts (post,user_id,headline,category)  VALUES(?,?,?,?)";
        try {
            PreparedStatement preparedStatement = Connection.getInstance().getStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,postDto.getPost());
            preparedStatement.setInt(2,postDto.getUserId());
            preparedStatement.setString(3, postDto.getHeadLine());
            preparedStatement.setString(4, postDto.getHeadLine());
            preparedStatement.execute();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();

        while(resultSet.next()){
            key = resultSet.getInt(1);
        }
        preparedStatement.close();
        Connection.getInstance().getConnection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    return  key;
    }
    public ArrayList<PostDto> loadFrontPagePost(){
      ArrayList<PostDto>frontPages= new ArrayList<>();
        String query = "select  posts.id,posts.headline,posts.front_page, user.profile_pics,user.first_name from posts inner join user on posts.user_id=user.id where posts.front_page=true";
        try {
            PreparedStatement preparedStatement = Connection.getInstance().getStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                PostDto postDto = new PostDto();
                postDto.setFrontPage(resultSet.getBoolean("front_page"));
                postDto.setFirstName(resultSet.getString("first_name"));
                postDto.setHeadLine(resultSet.getString("headline"));
                postDto.setProfilePics(resultSet.getString("profile_pics"));
                postDto.setId(resultSet.getInt("id"));
                frontPages.add(postDto);
            }
            preparedStatement.close();
            Connection.getInstance().getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
  return frontPages;
    }


    public PostDto  LoadPostById(int id){
        PostDto postDto = new PostDto();
        String query = "select posts.user_id, posts.id,posts.headline,posts.front_page,user.profile_pics,user.first_name,user.email,posts.post from posts inner join user on posts.user_id=user.id where posts.id=?";
        try {
            PreparedStatement preparedStatement = Connection.getInstance().getStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                postDto.setFrontPage(resultSet.getBoolean("front_page"));
                postDto.setFirstName(resultSet.getString("first_name"));
                postDto.setHeadLine(resultSet.getString("headline"));
                postDto.setProfilePics(resultSet.getString("profile_pics"));
                postDto.setPost(resultSet.getString("post"));
                postDto.setId(resultSet.getInt("id"));
                postDto.setEmail(resultSet.getString("email"));

            }
            preparedStatement.close();
            Connection.getInstance().getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return postDto;
    }
    public  ArrayList<PostDto> loadUserPost(int id){
        ArrayList<PostDto> userPosts = new ArrayList<>();
        String query = "select  posts.id," +
                "user.email,posts.post from posts inner " +
                "join user on posts.user_id=user.id where posts.user_id=?";
        try {
            PreparedStatement preparedStatement = Connection.getInstance().getStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                PostDto postDto = new PostDto();
                postDto.setPost(resultSet.getString("post"));
                postDto.setId(resultSet.getInt("id"));
                postDto.setEmail(resultSet.getString("email"));
                userPosts.add(postDto);
            }
            preparedStatement.close();
            Connection.getInstance().getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

   return  userPosts;
    }

}
