package org.example.studentDetails;

import org.example.connectionConfig;

import java.sql.*;

public class selectstudent {
    public  void select(int id) throws SQLException {
        connectionConfig connectionconfig=new connectionConfig();
        try(Connection connection=connectionconfig.setConnection()){
            Statement st=connection.createStatement();
            //to fetch the data form the database
            String select="Select * from student";
            ResultSet sm=st.executeQuery(select);
            while(sm.next()){
                System.out.println(sm.getString(2));
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
