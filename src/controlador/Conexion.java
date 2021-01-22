/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sun.applet.Main;

/**
 *
 * @author Usuario
 */
public class Conexion {
    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión" + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }

        String url = "jdbc:sqlserver://DESKTOP-N2DB42H\\ADMIN\\SQLEXPRESS:1433;databaseName=propiedades;user=admin;password=123";
        //string
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
}
