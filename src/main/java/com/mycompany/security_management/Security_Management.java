/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.security_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Security_Management {

    public static void main(String[] args) {
        Connection con = DBContext.connect();
        PreparedStatement st; // Declare the PreparedStatement variable.
        ResultSet rs; // Declare the ResultSet variable.
       // new LoginManager().setVisible(true);
      
        try { new LoginManager().setVisible(true);
            st = con.prepareStatement("SELECT * FROM security");
            rs = st.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("prefix") + rs.getString("idSecurity"));
                System.out.println(rs.getString("DateOfBirth"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Security_Management.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
