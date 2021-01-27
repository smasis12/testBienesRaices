package Modelo;

import java.util.*;

/**
 * 
 */
public class Cliente extends Usuario {
    
    private String nombre;
    private String apellido;

    /**
     * Default constructor
     */
    public Cliente() {
    }
    
    /**
     * @param pCorreo 
     * @param pTelefono
     */
    public Cliente(String pCorreo, int pTelefono) {
        super(pCorreo, pTelefono);
    }

    /**
     * @param pCriterio 
     * @return
     */
    public String consultarBien(String pCriterio) {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public void solicitarFichaPropiedad() {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public void adjuntarQR() {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public void mostrarInteres() {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }
    
     

    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}