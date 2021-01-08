package Modelo;

import java.util.*;

/**
 * 
 */
public class Lote extends Propiedad {

    /**
     * Default constructor
     */
    public Lote() {
    }

    /**
     * @param pFinca 
     * @param pTerreno 
     * @param pMetro 
     * @param pFiscal 
     * @param pPUbicacion 
     * @param pDireccion 
     * @param pModalidad
     */
    public Lote(int pFinca, int pTerreno, int pMetro, int pFiscal, String pPUbicacion, String pDireccion, String pModalidad) {
        super(pFinca, pTerreno, pMetro, pFiscal, pPUbicacion, pDireccion, pModalidad);
    }

    
    
    
    
    
    //Se implementan estos metodos de la clase padre para que no de error 
    //solucionar *******************

    @Override
    public void propiedadesVenta() {
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

    @Override
    public void propiedadesAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}