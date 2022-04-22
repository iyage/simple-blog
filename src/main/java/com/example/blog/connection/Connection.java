package com.example.blog.connection;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connection {
    Dotenv dotenv = Dotenv.configure().load();

    private  static  Connection instance = new Connection();
    private  String url = "jdbc:mysql://"+dotenv.get("DB_HOST")+":3306/"+dotenv.get("DB_NAME");
    private  String userName = dotenv.get("DB_USER");
    private String password = dotenv.get("DB_PASSWORD");
    private Connection() {
    }
  private java.sql.Connection getConnection() {
       java.sql.Connection connection = null;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           System.out.println(url);
           System.out.println(userName);
           System.out.println(password);
          connection = DriverManager.getConnection(url,userName,password);
       }
       catch (ClassNotFoundException | SQLException e){
          e.printStackTrace();
       }
     return connection;
   }
   public PreparedStatement  getStatement(String query) throws SQLException {
        PreparedStatement prep = getConnection().prepareStatement(query);
        return  prep;
   }
    public static Connection getInstance() {
        return instance;
    }
}
