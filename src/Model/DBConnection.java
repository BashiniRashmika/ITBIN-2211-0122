/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bashini_Rashmila
 */
public class DBConnection {
    static Connection conn;
 static Statement stat = null;
 
 public static Statement getStatementConnection() {
 try {
     
     
     Class.forName("com.mysql.cj.jdbc.Driver");
//Establish the connection
 
 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system", "root", "");
//Create the connection
 stat = conn.createStatement();
 
 } catch (Exception e) {
 e.printStackTrace(); 
 }
 return stat;
 }
 //Close the connection
public static void closeCon() throws SQLException {
 conn.close();
 }

    
}
