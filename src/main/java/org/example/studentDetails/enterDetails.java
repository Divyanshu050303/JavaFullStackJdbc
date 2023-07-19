package org.example.studentDetails;

import org.example.connectionConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class enterDetails {
    public void enterDetail(String id, String name, String phoneNumber, String Email, String classes) throws SQLException {
        connectionConfig connectionconfig=new connectionConfig();
        try(Connection connection=connectionconfig.setConnection()){
            String s="insert into student(id, name, phoneNumber, Email, classes) values(?,?,?,?,?)";
            PreparedStatement add=connection.prepareStatement(s);
            add.setString(1,id);
            add.setString(2,name);
            add.setString(3,phoneNumber);
            add.setString(4,Email);
            add.setString(5,classes);
            add.addBatch();
            add.executeBatch();
            System.out.println("Data Insert Successfully");
        }
        catch (SQLException e){
            System.out.println(e);
        }


    }
}
