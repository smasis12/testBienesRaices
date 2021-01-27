package Modelo;

import java.util.*;


public class Casa extends Propiedad {
  
    private String areaConstruccion;
    private String estiloConstruccion;
    private int cantidadNiveles;
    private String color;
    private int anioConstruccion;

 /**
     * Default constructor
     */
    public Casa() {
    }
    
    /**
     * @param pFinca 
     * @param pTerreno 
     * @param pMetro 
     * @param pFiscal 
     * @param pPublicacion 
     * @param pDireccion 
     * @param pModalidad 
     * @param pAConstruccion 
     * @param pEstilo 
     * @param pNiveles 
     * @param pColor 
     * @param pAnio
     */
    public Casa(int pFinca, int pAreaTerreno, int pValorMetro, int pFiscal, String pUbicacion, String pDireccion, String pModalidad, String pAConstruccion, String pEstilo, int pNiveles, String pColor, int pAnio) {
        super(pFinca, pAreaTerreno, pValorMetro, pFiscal, pUbicacion, pDireccion, pModalidad);
        this.areaConstruccion= pAConstruccion;
        this.estiloConstruccion=pEstilo;
        this.cantidadNiveles=pNiveles;
        this.color=pColor;
        this.anioConstruccion=pAnio;
    }

    /**
     * Retorna una lista con objetos de tipo casa
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

    public String getEstiloConstruccion() {
        return estiloConstruccion;
    }

    public void setEstiloConstruccion(String estiloConstruccion) {
        this.estiloConstruccion = estiloConstruccion;
    }

    public int getCantidadNiveles() {
        return cantidadNiveles;
    }

    public void setCantidadNiveles(int cantidadNiveles) {
        this.cantidadNiveles = cantidadNiveles;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(int anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

}