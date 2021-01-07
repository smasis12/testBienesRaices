package Modelo;

import java.util.*;

public abstract class Usuario {
    protected String correoUsuario;
    protected int telefono;
    protected String clave;
    
    /**
     * Default constructor
     */
    public Usuario() {
       }
    
    /**
     * @param pCorreo 
     * @param pTelefono
     */
    public Usuario(String pCorreo, int pTelefono) {
        this.correoUsuario= pCorreo;
        this.telefono=pTelefono;
    }

    /**
     * @return
     */
    public void validarCredenciales(String pCorreo, String pClave) {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public void generarClave() {
        
        return ;
    }
    
    
    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    
}