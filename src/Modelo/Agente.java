package Modelo;

import java.util.*;

public class Agente extends Usuario implements IPropiedad {


    private int id;
    private int telefono;
    private String nombre;
    private String apellido;
    private String correo;
    
        /**
     * Default constructor
     */
    public Agente() {
    }    
        
    /**
     * @param pCorreo 
     * @param pTelefono 
     * @param pId 
     * @param pNombre 
     * @param pApellido
     */
    public Agente(String pCorreo, int pTelefono, int pId, String pNombre, String pApellido) {
        super(pCorreo, pTelefono);
        this.id= pId;
        this.nombre=pNombre;
        this.apellido=pApellido;
        
    }
    public Agente(int id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    /**
     * @param pTipo 
     * @return
     */
    public void registrarInmueble(String pTipo) {
        // TODO implement here
        return;
    }

    /**
     * @param pModalidad 
     * @return
     */
    public void modificarInmueble(String pModalidad) {
        // TODO implement here
        return;
    }

    /**
     * @param pCriterio 
     * @return
     */
    public String consultarCatalogo(String pCriterio) {
        // TODO implement here
        return "";
    }

    /**
     * @param pNumFinca 
     * @return
     */
    public void eliminarInmueble(int pNumFinca) {
        // TODO implement here
        return;
    }

    /**
     * @param pPropiedad 
     * @return
     */
    public String consultarClientesInteresados(String pPropiedad) {
        // TODO implement here
        return "";
    }



    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

    @Override
    public void propiedadesVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void propiedadesAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void propiedadesPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void propiedadesProvincia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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