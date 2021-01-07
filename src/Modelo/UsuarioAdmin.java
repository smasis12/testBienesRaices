package Modelo;
import java.util.*;

/**
 * 
 */
public class UsuarioAdmin extends Usuario {
    
    protected String correoUsuario;
    protected int telefono;
    protected String clave;
    
     /**
     * Default constructor
     */
    public UsuarioAdmin() {
        //solo lleva constructor default porque no se registra nunca el administrador
        //asignar aqui el rol del admi en la base de datos
    }



    /**
     * @param pId 
     * @param pTelefono 
     * @param pNombre 
     * @param pApellido 
     * @param pCorreo 
     * @return
     */
    private void registrarAgente(String pCorreo, int pTelefono, int pId,  String pNombre, String pApellido ) {
        Agente Agente = new Agente(pCorreo, pTelefono, pId, pNombre, pApellido);
    }

   

    /**
     * @return
     */
    private String consultarAgentes() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    private int consultarPropiedadesAgente() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    private String consultarClientes() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    private void descargarInfoCliente() {
        // TODO implement here
        return ;
    }

   

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }
    

}