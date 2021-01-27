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
    public Lote(int pFinca, int pTerreno, int pMetro, int pFiscal, String pPUbicacion, String pDireccion, int pModalidad, int pProvincia, int pCanton, int pDistrito, int pAgente, int pPropiedad) {
        super(pFinca, pTerreno, pMetro, pFiscal, pPUbicacion, pDireccion, pModalidad, pProvincia, pCanton, pDistrito, pAgente, pPropiedad);
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