package org.example.studentDetails;

import org.example.connectionConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateField {
    org.example.connectionConfig connectionConfig=new connectionConfig();
     void update() throws SQLException {

        try(Connection connection =connectionConfig.setConnection()){
        String updateq="update student set name ='Aryan Singh' where id=9";
        PreparedStatement update=connectionConfig.connection.prepareStatement(updateq);
        update.executeUpdate();
    }
        catch (SQLException e){
            System.out.println(e);
        }
     }
}
