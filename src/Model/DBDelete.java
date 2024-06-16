/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bashini_Rashmila
 */
public class DBDelete {
    Statement stmt;
    
    public void deleteMember(String memid){
        
        try {
            
            String memID = memid;
            
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM members WHERE Member_ID='"+memID+"' ");
            
            JOptionPane.showMessageDialog(null,"Record Deleted");
        } catch (Exception e) {
        }
   
    }
    
    
        public void deletebooks(String bookid){
        
        try {
            
            String bookID = bookid;
            
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM books WHERE Book_ID='"+bookID+"' ");
            
            JOptionPane.showMessageDialog(null,"Record Deleted");
        } catch (Exception e) {
        }
  
    }
        
        
        
        public void deleteStaff(String stid){
        
        try {
            
            String staffID = stid;
            
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM staff WHERE Staff_ID='"+staffID+"' ");
            
            JOptionPane.showMessageDialog(null,"Record Deleted");
        } catch (Exception e) {
        }
        
        
        
    }

    
}
