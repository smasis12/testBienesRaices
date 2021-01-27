package Modelo;

import java.util.*;


public class CentroComercial extends Propiedad {

    
    private int areaConstruccion;       
    private int cantidadTiendas;   
    private int cantidadSalasCine;    
    private String cadenaCine;
    private int cantidadHotspot;
    private int cantidadEscaleras;
    private int cantEspaciosEspecial;
    private String estiloConstruccion;

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
    public CentroComercial(int pFinca, int pAreaTerreno, int pValorMetro, int pFiscal, String pUbicacion, String pDireccion, int pModalidad, int pAConstruccion, int pTiendas, int pSalas, String pCadena, String pEstiloConstruccion, int pHotspot, int pEscaleras, int pEspacios, int pProvincia, int pCanton, int pDistrito, int pAgente, int pPropiedad) {
        super(pFinca, pAreaTerreno, pValorMetro, pFiscal, pUbicacion, pDireccion, pModalidad, pProvincia, pCanton, pDistrito, pAgente, pPropiedad);
        this.areaConstruccion= pAConstruccion;
        this.cantidadTiendas=pTiendas;
        this.cantidadSalasCine=pSalas;
        this.cadenaCine=pCadena;
        this.cantidadHotspot=pHotspot;
        this.cantidadEscaleras= pEscaleras;
        this.cantEspaciosEspecial= pEspacios;
        this.estiloConstruccion = pEstiloConstruccion;
        
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

    public String getEstiloConstruccion() {
        return estiloConstruccion;
    }

    public void setEstiloConstruccion(String estiloConstruccion) {
        this.estiloConstruccion = estiloConstruccion;
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

    public int getAreaConstruccion() {
        return areaConstruccion;
    }

    public void setAreaConstruccion(int areaConstruccion) {
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