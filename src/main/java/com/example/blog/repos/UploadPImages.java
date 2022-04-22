package com.example.blog.repos;

import com.example.blog.connection.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UploadPImages {
    public void  uploadProfile(String email, String url){
        String query = "update user set profile_pics=? where email = ?";
        Connection connection = Connection.getInstance();
        try{
        PreparedStatement preparedStatement = connection.getStatement(query);
        preparedStatement.setString(1,url);
        preparedStatement.setString(2,email);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void  uploadCover(String email, String url){
        String query = "update user set cover_pics=? where email = ?";
        Connection connection = Connection.getInstance();
        try{
            PreparedStatement preparedStatement = connection.getStatement(query);
            preparedStatement.setString(1,url);
            preparedStatement.setString(2,email);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
