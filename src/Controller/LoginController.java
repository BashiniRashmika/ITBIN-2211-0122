/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import View.Login;
import View.Menu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bashini_Rashmila
 */
public class LoginController {
    public static void login(String usName, String pass) {
 try {
 String username = null; // initial value of the username
 String password = null; // initial value of the password
 ResultSet rs = new DBSearch().searchLogin(usName);
//Process the Query
 while (rs.next()) {
username = rs.getString("username"); //assign database login name to the variable

 password = rs.getString("password"); //assign database password to the variable
 }
 
 
 if (username != null && password != null) {
 if (password.equals(pass)) {
 System.out.println("Login Successfull");
 Login.getFrames()[0].dispose();
 new Menu().setVisible(true);
 } else {
JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 } else {
JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 DBConnection.closeCon();
 } catch (SQLException ex) { 
Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
    
}
