/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Statement;
import Model.DBConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Bashini_Rashmila
 */
public class UpdateForm {
    Statement stmt;
    
    public void updateForm(String memID, String memName , String cNumber , String address , String gender){
        
        try {
            
           // Class.forName("com.mysql.cj.jdbc.Driver");
            
            String memid = memID;
            
            String memname = memName;
            String cNo = cNumber;
            String adrs = address;
            String gen = gender;
            
            stmt = DBConnection.getStatementConnection();
            
           // stmt.executeUpdate("UPDATE `members` SET `Member_Name` = '"+memname+"', `Contact_Number` = '"+cNo+"', `Address` = '"+adrs+"', `Gender` = '"+gen+"' WHERE `Member_ID` ='"+memid+"' ");
             
           stmt.executeUpdate("UPDATE members SET Member_Name = '"+memname+"', Contact_Number ='"+cNo+"', Address='"+adrs+"', Gender='"+gen+"' WHERE Member_ID = '"+memid+"' ");
           
           // JOptionPane.showMessageDialog(null, memid);
            
            
        } catch (Exception e) {
        }
    
    }
  
    
    
    
    public void updateForm1(String bookID, String bname,String bcategory, String bauthor, String yr){
    
    try {
            String bokid = bookID;
            String memname = bname;
            String ctgry = bcategory;
            String autor = bauthor;
            String yeer = yr;

        stmt = DBConnection.getStatementConnection();
        
        stmt.executeUpdate("UPDATE books SET Name ='"+bname+"', Author ='"+bauthor+"' , Category='"+bcategory+"', Year='"+yr+"' WHERE Book_ID='"+bokid+"' ");
        
    
    } catch (Exception e) {
    }
}
    
    
        public void updateForm2(String sid, String name, String cno,String addr, String gender){
    
    try {
            String stid = sid;
            String stname = name;
            String stcon = cno;
            String stadd = addr;
            String stgen= gender;

        stmt = DBConnection.getStatementConnection();
        
        stmt.executeUpdate("UPDATE members SET Name ='"+name+"', Contact ='"+cno+"' , Address='"+addr+"', Gender='"+gender+"' WHERE Staff_ID='"+stid+"' ");
        
    
    } catch (Exception e) {
    }
}

    
}
