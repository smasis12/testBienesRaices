/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static controlador.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ConsultaBienesRaices {
    
    public boolean registrarAgente(Agente ag){
        PreparedStatement ps= null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO Usuario(correo,telefono,clave) values(?,?,?) ; INSERT INTO UsuarioAgente(id,nombre,apellido,correo) values(?,?,?,?)";
        
        //aa
        try{
        
                ps= con.prepareStatement(sql);
                ps.setString(1, ag.getCorreo());
                ps.setInt(2, ag.getTelefono());
                ps.setString(3, "fasdfa");
                ps.setInt(4, ag.getId());
                ps.setString(5, ag.getNombre());
                ps.setString(6, ag.getApellido());
                ps.setString(7, ag.getCorreo());
                ps.execute();
                
                return true;
        }
        
        catch (SQLException e){
                System.err.println(e);
                return false;
        }
        
        
    
        
    }
}
