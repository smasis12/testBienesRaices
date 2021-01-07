package Modelo;

import java.util.*;

/**
 * 
 */
public class Cliente extends Usuario {

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

}