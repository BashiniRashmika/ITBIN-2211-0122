/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Bashini_Rashmila
 */
public class DBSearch {
    Statement stmt;
 ResultSet rs;
 
public ResultSet searchLogin(String uName) {
 try {
 stmt = DBConnection.getStatementConnection();
 String name = uName;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login where members='" + name + "'");

 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }



public ResultSet searchMember(String memid){


    try {
        stmt = DBConnection.getStatementConnection();
        
        String memID = memid;
        
        rs = stmt.executeQuery("SELECT * FROM members where Member_ID='" + memID + "'");
        
    } catch (Exception e) {
    }
return rs;
}




    
public ResultSet searchAllMembers(){
    
    try {
        
        stmt = DBConnection.getStatementConnection();
        
        rs = stmt.executeQuery("SELECT * FROM members");
        
    } catch (Exception e) {
    }
    
    return rs;
}






public ResultSet searchBooks(String boookid){
    
    try {
        
        
        stmt = DBConnection.getStatementConnection();
        String bookID = boookid;
        
        rs = stmt.executeQuery("SELECT * FROM books where Book_ID= '" + bookID + "'");
        
    
    } catch (Exception e) {
    }
    
    return rs;
}

public ResultSet searchAllBooks(){
    
    try {
        
        stmt = DBConnection.getStatementConnection();
        
        rs = stmt.executeQuery("SELECT * FROM books");
        
    } catch (Exception e) {
    }
    
    return rs;
}




public ResultSet searchstaff(String stffid){
    
    try {
        
        
        stmt = DBConnection.getStatementConnection();
        String staffID = stffid;
        
        rs = stmt.executeQuery("SELECT * FROM staff where Staff_ID= '" + staffID + "'");
        
    
    } catch (Exception e) {
    }
    
    return rs;
}

public ResultSet searchAllStaff(){
    
    try {
        
        stmt = DBConnection.getStatementConnection();
        
        rs = stmt.executeQuery("SELECT * FROM staff");
        
    } catch (Exception e) {
    }
    
    return rs;
}

    
}
