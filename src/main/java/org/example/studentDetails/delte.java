package org.example.studentDetails;

import org.example.connectionConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delte {
    public  void delete(int id) throws SQLException {
        connectionConfig connectionconfig=new connectionConfig();
        try(Connection connection=connectionconfig.setConnection()){
            String delete="delete from student where id=id";
            PreparedStatement deletes=connection.prepareStatement(delete);
            deletes.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
