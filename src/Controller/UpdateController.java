/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.UpdateForm;
import javax.swing.JOptionPane;

/**
 *
 * @author Bashini_Rashmila
 */
public class UpdateController {
     public static void updateMember(String memID, String memName , String cNumber , String address , String gender){
        
        new UpdateForm().updateForm(memID, memName, cNumber, address, gender);
        
        if(memID.equals("")){
            
          
        }
        else{
            
            JOptionPane.showMessageDialog(null, "record has Updated Successfully ","Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    
        public static void updateBook(String bookID, String bname , String bcategory , String bauthor , String year){
        
        new UpdateForm().updateForm1(bookID, bname, bcategory, bauthor, year);
        
        if(bookID.equals("")){
            
          
        }
        else{
            
            JOptionPane.showMessageDialog(null, "record has Updated Successfully ","Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
        
        public static void updateStaff(String staffID, String name, String cno,String addr, String gender){
        
        new UpdateForm().updateForm2(staffID, name, cno, addr, gender);
        
        if(staffID.equals("")){
            
          
        }
        else{
            
            JOptionPane.showMessageDialog(null, "record has Updated Successfully ","Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    
}
