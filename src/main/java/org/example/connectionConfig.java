package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionConfig {
    public Connection connection;
    String url="jdbc:mysql://localhost:3306/gla";
    String pass="Divya@2003";
    String user="root";
        public Connection setConnection() throws SQLException {
            connection= DriverManager.getConnection(url, user, pass);
            return connection;
        }
}


// Bal->
// DAL ->Data Access Logic
// Dao ->