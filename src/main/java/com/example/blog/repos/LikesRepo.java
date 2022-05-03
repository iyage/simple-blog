package com.example.blog.repos;

import com.example.blog.connection.Connection;
import com.example.blog.model.Likes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LikesRepo {
    public boolean validateLike(Likes likes) throws SQLException {
        boolean status = false;
        String query = "SELECT * FROM post_like WHERE post_id = ? AND user_id=?";
        PreparedStatement preparedStatement = Connection.getInstance().getStatement(query);
        preparedStatement.setInt(1,likes.getPostId());
        preparedStatement.setInt(2,likes.getUserId());
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            status =  true;
        }
        preparedStatement.close();
        return status;
    }
    public void deleteLikes(Likes likes) throws SQLException {
        String query ="DELETE  FROM post_like WHERE user_id=? AND post_id=?";
        PreparedStatement statement = Connection.getInstance().getStatement(query);
        statement.setInt(2,likes.getPostId());
        statement.setInt(1,likes.getUserId());
        statement.executeUpdate();
        statement.close();
    }
    public void insertLikes(Likes likes) throws SQLException {
        String query ="INSERT INTO post_like (post_id, user_id) VALUES (?,?)";
        PreparedStatement statement = Connection.getInstance().getStatement(query);
        statement.setInt(1,likes.getPostId());
        statement.setInt(2,likes.getUserId());
        statement.executeUpdate();
        statement.close();
    }
    public  int fetchPostLilesCounts(int id){
        int count = 0;
        String query = "SELECT  count(*) FROM post_like where post_id=?";
        try {
            PreparedStatement preparedStatement = Connection.getInstance().getStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            count = resultSet.getInt("count(*)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
   return count;
    }
}
