/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edubit;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ThinkPad
 */
public class Main {
         
    Connection conn = db.java_db();
    ;
    ResultSet rs = null;
   
    PreparedStatement pst = null;
   
    
    String status,temp;
    public String Startup() {
        
        String queryStart = "SELECT * FROM SCHOOL_INFO";
        String queryInit = "SELECT * FROM SYSUSERS";
        try {
            pst = conn.prepareStatement(queryStart);
            rs = pst.executeQuery();
            if(rs.next()){
             temp="schoolIn";
            }
            pst = conn.prepareStatement(queryInit);
            rs = pst.executeQuery();
            if(rs.next()){
              temp="allIn";
            }
            if("allIn".equals(temp)){
            status ="on";
            }else if("schoolIn".equals(temp)){
            status ="middle";
            }else{
            status="off";
            }
            
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return status;


    }
    
}
