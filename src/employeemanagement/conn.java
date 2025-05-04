/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagement;

/**
 *
 * @author cotad
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement statement;

    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/twoo?zeroDateTimeBehavior=CONVERT_TO_NULL ","root","");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}


