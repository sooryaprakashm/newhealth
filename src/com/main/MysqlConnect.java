/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author soory
 */
public class MysqlConnect {
  static  Connection con = null;
    public static Connection ConnectDB(){
         try
           {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
           return con;
           
            }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
             return null;
         }
        
}
}
     

