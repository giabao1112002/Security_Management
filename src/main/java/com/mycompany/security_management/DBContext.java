/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.security_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DBContext {

    public static Connection connect() {
        try {
// loading mysql driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
// creating connection with database
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bankproject", "root", "root");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
