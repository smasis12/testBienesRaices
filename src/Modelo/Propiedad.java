package Modelo;

import java.util.*;

public abstract class Propiedad implements IPropiedad {

   
    protected int numFinca;
    protected int areaTerreno;
    protected int valorMetro2;
    protected int valorFiscal;
    protected String ubicacion;
    protected String direccion;
    protected String modalidad;

    /**
     * Default constructor
     */
    public Propiedad() {
    } 
    

    /**
     * @param pFinca 
     * @param pTerreno 
     * @param pMetro 
     * @param pFiscal 
     * @param pUbicacion 
     * @param pDireccion 
     * @param pModalidad
     */
    public Propiedad(int pFinca, int pTerreno, int pValorMetro, int pValorFiscal, String pUbicacion, String pDireccion, String pModalidad) {
        this.numFinca= pFinca;
        this.areaTerreno= pTerreno;
        this.valorMetro2= pValorMetro;
        this.valorFiscal= pValorFiscal;
        this.ubicacion= pUbicacion;
        this.direccion= pDireccion;
        this.modalidad=pModalidad;
    }
    
     protected void AdjuntarFotos() {
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

    

    /**
     * 
     */
    public abstract void propiedadesVenta();

    /**
     * 
     */
    public abstract void propiedadesAlquiler();

    /**
     * 
     */
    public abstract void propiedadesPrecio();

    /**
     * 
     */
    public abstract void propiedadesProvincia();

}