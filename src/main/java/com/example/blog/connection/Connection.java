package com.example.blog.connection;

import com.example.blog.service.serviceimpl.LoadSecreteService;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class Connection {
    Dotenv dotenv = Dotenv.configure().load();
    LoadSecreteService loadSecreteService = new LoadSecreteService();
    Map<String, String> secret= loadSecreteService.loadSecret();
    private  static  Connection instance = new Connection();
    private  String url = "jdbc:mysql://"+secret.get("DB_HOST")+":3306/"+secret.get("DB_NAME");
    private  String userName = secret.get("DB_USER");
    private String password = secret.get("DB_PASSWORD");

    public Connection() {}
  public  java.sql.Connection getConnection() {
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
    public PreparedStatement  getStatement(String query, int key) throws SQLException {
        PreparedStatement prep = getConnection().prepareStatement(query,key);
        return  prep;
    }
    public static Connection getInstance() {
        return instance;
    }
}
