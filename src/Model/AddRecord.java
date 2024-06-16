/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author Bashini_Rashmila
 */
public class AddRecord {
           Statement stmt;
 
public void Form(String addmember, String memname, String contacNO, String ADres , String gender) {
    
    String adM = addmember;
    String memName = memname;
    String cNo =  contacNO;
    String address = ADres;
    String gend = gender;
    
    
 try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate("INSERT INTO members VALUES('"+adM+"', '"+memName+"', '"+cNo+"', '"+address+"','"+gend+"')");
 } catch (Exception e) {
 e.printStackTrace();
 }
}

public void Form1(String bid, String bname, String bauthor,String bcategory, String yr){
    
    try {
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate("INSERT INTO books VALUES('"+bid+"', '"+bname+"', '"+bauthor+"', '"+bcategory+"','"+yr+"')");
    } catch (Exception e) {
    }
}


public void Form2(String sid, String name, String cno,String addr, String gender){
    
    try {
        stmt = DBConnection.getStatementConnection();
        stmt.executeUpdate("INSERT INTO staff VALUES('"+sid+"', '"+name+"', '"+cno+"', '"+addr+"','"+gender+"')");
    } catch (Exception e) {
    }
}
    
}
