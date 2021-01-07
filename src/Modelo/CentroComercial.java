package Modelo;

import java.util.*;


public class CentroComercial extends Propiedad {

    
    private String areaConstruccion;       
    private int cantidadTiendas;   
    private int cantidadSalasCine;    
    private String cadenaCine;
    private int cantidadHotspot;
    private int cantidadEscaleras;
    private int cantEspaciosEspecial;

    /**
     * Default constructor
     */
    public CentroComercial() {
        
    }
    

    /**
     * @param pFinca
     * @param pAreaTerreno
     * @param pValorMetro
     * @param pFiscal
     * @param pUbicacion
     * @param pDireccion
     * @param pModalidad
     * @param pAConstruccion 
     * @param pTiendas 
     * @param pSalas 
     * @param pHotspot 
     * @param pEscaleras 
     * @param pEspacios
     */
    public CentroComercial(int pFinca, int pAreaTerreno, int pValorMetro, int pFiscal, String pUbicacion, String pDireccion, String pModalidad, String pAConstruccion, int pTiendas, int pSalas, String pCadena, int pHotspot, int pEscaleras, int pEspacios) {
        super(pFinca, pAreaTerreno, pValorMetro, pFiscal, pUbicacion, pDireccion, pModalidad);
        this.areaConstruccion= pAConstruccion;
        this.cantidadTiendas=pTiendas;
        this.cantidadSalasCine=pSalas;
        this.cadenaCine=pCadena;
        this.cantidadHotspot=pHotspot;
        this.cantidadEscaleras= pEscaleras;
        this.cantEspaciosEspecial= pEspacios;
        
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

    public String getAreaConstruccion() {
        return areaConstruccion;
    }

    public void setAreaConstruccion(String areaConstruccion) {
        this.areaConstruccion = areaConstruccion;
    }

    public int getCantidadTiendas() {
        return cantidadTiendas;
    }

    public void setCantidadTiendas(int cantidadTiendas) {
        this.cantidadTiendas = cantidadTiendas;
    }

    public int getCantidadSalasCine() {
        return cantidadSalasCine;
    }

    public void setCantidadSalasCine(int cantidadSalasCine) {
        this.cantidadSalasCine = cantidadSalasCine;
    }

    public String getCadenaCine() {
        return cadenaCine;
    }

    public void setCadenaCine(String cadenaCine) {
        this.cadenaCine = cadenaCine;
    }

    public int getCantidadHotspot() {
        return cantidadHotspot;
    }

    public void setCantidadHotspot(int cantidadHotspot) {
        this.cantidadHotspot = cantidadHotspot;
    }

    public int getCantidadEscaleras() {
        return cantidadEscaleras;
    }

    public void setCantidadEscaleras(int cantidadEscaleras) {
        this.cantidadEscaleras = cantidadEscaleras;
    }

    public int getCantEspaciosEspecial() {
        return cantEspaciosEspecial;
    }

    public void setCantEspaciosEspecial(int cantEspaciosEspecial) {
        this.cantEspaciosEspecial = cantEspaciosEspecial;
    }
    
    
    


}