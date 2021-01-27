package Modelo;

import java.util.*;

public abstract class Propiedad implements IPropiedad {

   
    protected int numFinca;
    protected int areaTerreno;
    protected int valorMetro2;
    protected int valorFiscal;
    protected String ubicacion;
    protected String direccion;
    protected int modalidad;
    protected int idProvincia;
    protected int idCanton;
    protected int idDistrito;
    protected int idAgente;
    protected int idPropiedad;
    //protected int idModalidad;
    
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
    public Propiedad(int pFinca, int pTerreno, int pValorMetro, int pValorFiscal, String pUbicacion, 
            String pDireccion, int pModalidad, int pProvincia, int pCanton, int pDistrito, int pAgente, int pPropiedad) {
        this.numFinca= pFinca;
        this.areaTerreno= pTerreno;
        this.valorMetro2= pValorMetro;
        this.valorFiscal= pValorFiscal;
        this.ubicacion= pUbicacion;
        this.direccion= pDireccion;
        this.modalidad=pModalidad;
        this.idProvincia=pProvincia;
        this.idCanton=pCanton;
        this.idDistrito=pDistrito;
        this.idAgente=pAgente;
        this.idPropiedad=pPropiedad;
        
    }

    public int getNumFinca() {
        return numFinca;
    }

    public void setNumFinca(int numFinca) {
        this.numFinca = numFinca;
    }

    public int getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(int areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    public int getValorMetro2() {
        return valorMetro2;
    }

    public void setValorMetro2(int valorMetro2) {
        this.valorMetro2 = valorMetro2;
    }

    public int getValorFiscal() {
        return valorFiscal;
    }

    public void setValorFiscal(int valorFiscal) {
        this.valorFiscal = valorFiscal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getModalidad() {
        return modalidad;
    }

    public void setModalidad(int modalidad) {
        this.modalidad = modalidad;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public int getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(int idCanton) {
        this.idCanton = idCanton;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
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