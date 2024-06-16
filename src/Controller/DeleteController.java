/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBDelete;


/**
 *
 * @author Bashini_Rashmila
 */
public class DeleteController {
    public static void deleteMember(String memid){
        
        new DBDelete().deleteMember(memid);
        
     
        
    }
    
    public static void deleteBook(String bookID ){
        
        new DBDelete().deletebooks(bookID);
  
    }
    
      public static void deleteStaff(String staffID ){
        
        new DBDelete().deletebooks(staffID);
  
    }

    
    
    
}
