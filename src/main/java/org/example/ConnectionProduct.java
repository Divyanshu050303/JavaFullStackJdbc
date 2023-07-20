package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionProduct {
    private static Connection connection = null;
    public static Connection getConnection(){
        if(connection==null){
            ResourceBundle resourceBundle = ResourceBundle.getBundle("dbConfig");
            String url = resourceBundle.getString("url");
            String username = resourceBundle.getString("user");
            String password = resourceBundle.getString("pass");
            try {
                connection = DriverManager.getConnection(url,username,password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
