package com.example.blog.connection;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connection {
    Dotenv dotenv = Dotenv.configure().load();
//    //dev
//    private  static  Connection instance = new Connection();
//    private  String url = "jdbc:mysql://"+dotenv.get("DB_HOST")+":3306/"+dotenv.get("DB_NAME");
//    private  String userName = dotenv.get("DB_USER");
//    private String password = dotenv.get("DB_PASSWORD");

    //////////////////////////////////////////////////////////
    //prod
    private  static  Connection instance = new Connection();
    private  String url = "jdbc:mysql://"+System.getenv("DB_HOST")+":3306/"+System.getenv("DB_NAME");
    private  String userName = System.getenv("DB_USER");
    private String password = System.getenv("DB_PASSWORD");
    private Connection() {}
  private java.sql.Connection getConnection() {
       java.sql.Connection connection = null;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");;
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
