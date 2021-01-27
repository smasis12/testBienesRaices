/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Agente;
import Modelo.Cliente;
import Modelo.UsuarioAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sun.management.Agent;

/**
 *
 * @author USUARIO
 */
public class ControladorLogin {
    
    public static Agente ag = new Agente();
    public static UsuarioAdmin admin = new UsuarioAdmin();
    public static Cliente cliente  = new Cliente();
    
    public String buscarAgenteRegistrado(String correo, String clave) {
        String busquedaUsuario = null;
        Connection conexion;
        String sentencia;
        PreparedStatement ps;
        ResultSet resultado;
       
        try {
            conexion = Conexion.getConexion();
            sentencia = "select * from LoginAgente ('" + correo +"')";            
            ps = conexion.prepareStatement(sentencia);
            resultado = ps.executeQuery();
            if (resultado.next()) {
                busquedaUsuario = "Usuario encontrado";
                ag.setCorreo(correo); // Una vez que se encuentra el usuario se le asigna al objeto el usuario que ingresa
                ag.setId(resultado.getInt("id"));
            } else {
                busquedaUsuario = "Usuario no encontrado";
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return busquedaUsuario;
    }
    
    
    public String buscarAdminRegistrado(String correo, String clave) {
        String busquedaUsuario = null;
        Connection conexion;
        String sentencia;
        PreparedStatement ps;
        ResultSet resultado;
       
        try {
            conexion = Conexion.getConexion();
            sentencia = "select * from LoginAdmin ('" + correo +"')";            
            ps = conexion.prepareStatement(sentencia);
            resultado = ps.executeQuery();
            if (resultado.next()) {
                busquedaUsuario = "Usuario encontrado";
                ag.setCorreo(correo); // Una vez que se encuentra el usuario se le asigna al objeto el usuario que ingresa
            } else {
                busquedaUsuario = "Usuario no encontrado";
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return busquedaUsuario;
    }
    
    
    public String buscarClienteRegistrado(String correo, String clave) {
        String busquedaUsuario = null;
        Connection conexion;
        String sentencia;
        PreparedStatement ps;
        ResultSet resultado;
       
        try {
            conexion = Conexion.getConexion();
            sentencia = "select * from LoginCliente ('" + correo +"')";            
            ps = conexion.prepareStatement(sentencia);
            resultado = ps.executeQuery();
            if (resultado.next()) {
                busquedaUsuario = "Usuario encontrado";
                ag.setCorreo(correo); // Una vez que se encuentra el usuario se le asigna al objeto el usuario que ingresa
            } else {
                busquedaUsuario = "Usuario no encontrado";
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return busquedaUsuario;
    }
    
}
