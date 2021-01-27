/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import controlador.Conexion;
import static controlador.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
        public List listarAgente(){
            Conexion conect = new Conexion();
            List<Agente> listaAgentes =  new ArrayList<>();
            String sql = "SELECT * FROM UsuarioAgente";
            PreparedStatement ps= null;
            ResultSet rs=null; 
            try {
            ps = conect.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Agente agente= new Agente();
                agente.setNombre(rs.getString("nombre"));
                agente.setApellido(rs.getString("apellido"));
                agente.setId(rs.getInt("id"));
                agente.setCorreo(rs.getString("correo"));
                listaAgentes.add(agente);
                System.out.println("hecho");
            }

        }   catch (Exception e) {
                System.out.println("error");

        }
            return listaAgentes;
            
        }
        
        public boolean registrarCliente(Cliente cliente){
        PreparedStatement ps= null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO Usuario(correo,telefono,clave) values(?,?,?) ; INSERT INTO UsuarioAgente(id,nombre,apellido,correo) values(?,?,?,?)";
        
        //aa
        try{
        
                ps= con.prepareStatement(sql);
                ps.setString(1, cliente.getCorreo());
                ps.setInt(2, cliente.getTelefono());
                ps.setString(3, "fasdfa");
                
                ps.setString(5, cliente.getNombre());
                ps.setString(6, cliente.getApellido());
                ps.setString(7, cliente.getCorreo());
                ps.execute();
                
                return true;
        }
        
        catch (SQLException e){
                System.err.println(e);
                return false;
        }
}
        
}
