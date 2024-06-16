/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JOptionPane;
import Model.AddRecord;

/**
 *
 * @author Bashini_Rashmila
 */
public class InsertController {
    public static void Form(String addmember, String memname, String contacNO, String ADres , String gender) {
  new AddRecord().Form(addmember, memname, contacNO, ADres, gender);
 JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", 
JOptionPane.INFORMATION_MESSAGE);
}
    
    public static void Form1 (String Bookid, String Bookname, String Author,String Category, String year){
        new AddRecord().Form1(Bookid, Bookname, Author, Category, year);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", 
JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public static void Form2(String sid, String name, String cno,String addr, String gender){
        new AddRecord().Form2(sid, name, cno, addr, gender);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", 
JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
