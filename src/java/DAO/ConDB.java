/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bernardo
 */
public class ConDB {
        private String url="jdbc:oracle:thin:@localhost:1521:XE";
    private String user="root";
    private String pass="123456";
    
    public Connection getConexion() {
        Connection con=null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection(url,user,pass); 
            
        } catch (ClassNotFoundException ex){
            System.out.println("No se pudo registrar el Driver. " 
                    + ex.toString());
        } catch (SQLException ex) {
            System.out.println("No se pudo establecer la Conexión. " 
                    + ex.toString());
        }
        return con;
    }//fin método
}
