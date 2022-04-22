package com.example.blog.repos;

import com.example.blog.connection.Connection;
import com.example.blog.model.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationRepo {
   private  String INSERT_USE ="";
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
     public boolean registrationRepo(User user){
         boolean status = false;
         INSERT_USE = "INSERT INTO user (email,password,first_name,last_name,age,enabled,role) VALUES (?,?,?,?,?,?,?)" ;
      Connection connection = Connection.getInstance();
         try {
          PreparedStatement preparedStatement = connection.getStatement(INSERT_USE);
            preparedStatement.setString(1,user.getEmail());
            preparedStatement.setString(2,passwordEncoder.encode(user.getPassword()));
             preparedStatement.setString(3,user.getFirstName());
             preparedStatement.setString(4,user.getLastName());
             preparedStatement.setString(5,user.getAge());
            preparedStatement.setBoolean(6,user.isEnable());
            preparedStatement.setString(7, user.getRole());
         status    =   preparedStatement.execute();
            preparedStatement.close();
         } catch (SQLException e) {
             e.printStackTrace();
         }

   return status;
     }

}
