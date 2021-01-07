package Modelo;

import java.util.*;

/**
 * 
 */
public class Apartamento extends Propiedad {

    private String areaConstruccion;
    private String estiloConstruccion;
    private int altura;
    private boolean piscina;
    private int espaciosParqueo;
    
    /**
     * Default constructor
     */
    public Apartamento() {
    }  


    /** constructor
     * @param pFinca 
     * @param pAreaTerreno 
     * @param pValorMetro 
     * @param pFiscal 
     * @param pUbicacion 
     * @param pDireccion 
     * @param pModalidad 
     * @param pArea 
     * @param pEstilo 
     * @param pAltura 
     * @param pPiscina 
     * @param pParqueo
     */
    public Apartamento(int pFinca, int pAreaTerreno, int pValorMetro, int pFiscal, String pUbicacion, String pDireccion, String pModalidad, String pArea, String pEstilo, int pAltura, boolean pPiscina, int pParqueo) {
        super(pFinca, pAreaTerreno, pValorMetro, pFiscal, pUbicacion, pDireccion, pModalidad);
        this.areaConstruccion= pArea;
        this.estiloConstruccion=pEstilo;
        this.altura=pAltura;
        this.piscina=pPiscina;
        this.espaciosParqueo=pParqueo;
    }  

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public int getEspaciosParqueo() {
        return espaciosParqueo;
    }

    public void setEspaciosParqueo(int espaciosParqueo) {
        this.espaciosParqueo = espaciosParqueo;
    }
    
    //metodos abstractos

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

}