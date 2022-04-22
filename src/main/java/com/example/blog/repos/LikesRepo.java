package com.example.blog.repos;

import com.example.blog.connection.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LikesRepo {
    public  void fetchPostLiles(int id){
        String query = "SELECT * FROM likes where post_id=?";
        try {
            PreparedStatement preparedStatement = Connection.getInstance().getStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()){
//
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
