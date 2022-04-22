package com.example.blog.repos;

import com.example.blog.connection.Connection;
import com.example.blog.model.dto.UserDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepo {
    private  String Select_user ="";
    public UserDto fetchUser(String email){
        UserDto user = new UserDto();
        Select_user = "SELECT * FROM user  WHERE email=?" ;
        Connection connection = Connection.getInstance();
        try {
            PreparedStatement preparedStatement = connection.getStatement(Select_user);
            preparedStatement.setString(1,email);
         ResultSet resultSet= preparedStatement.executeQuery();
       while (resultSet.next()){
           user.setAge(resultSet.getNString("age"));
           user.setEmail(resultSet.getString("email"));
           user.setLastName(resultSet.getString("last_name"));
           user.setFirstName(resultSet.getString("first_name"));
           user.setCover_pics(resultSet.getString("cover_pics"));
           user.setProfile_pics(resultSet.getString("profile_pics"));

       }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

}
