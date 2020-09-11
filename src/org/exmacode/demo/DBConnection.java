/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exmacode.demo;
import java.sql.*;
/**
 *
 * @author Vikas
 */
public class DBConnection {
    static final String DB_URL="jdbc:mysql://localhost/demo";
    static final String USER= "root";
    static final String PASS="";
    public static Connection connectDB(){
        Connection conn = null;
        try{
            //register jdbc drivers,not required for newer versions of jdk
          // Class.forName("com.mysql.jdbc.driver");
           //open a coconnection
           conn = DriverManager.getConnection(DB_URL,USER,PASS);
           return conn;
        }catch(Exception ex){
            System.out.println("There were Errors while connecting DB");
            return null;
        }
    }
}
