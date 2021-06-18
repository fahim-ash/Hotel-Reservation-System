/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_user;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Al Shariar
 */
public class JdbcConnect {
     Connection con=null;
    public static Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
            return conn;
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Exception");
        return null;
        }
        
    }
    
}
