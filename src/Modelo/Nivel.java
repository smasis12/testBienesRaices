package Modelo;

import java.util.*;

/**
 * 
 */
public class Nivel {
    private int numFinca;
    private int cantidadResidencias;
    private String tipoNivel;
    private int areaZonasComunes;
    /**
     * Default constructor
     */
    public Nivel() {
    }
    
    public Nivel(int pResidencias, String pTipoNivel, int pAreasComunes){
        this.cantidadResidencias= pResidencias;
        this.tipoNivel= pTipoNivel;
        this.areaZonasComunes= pAreasComunes;
        
    }

    public int getCantidadResidencias() {
        return cantidadResidencias;
    }

    public void setCantidadResidencias(int cantidadResidencias) {
        this.cantidadResidencias = cantidadResidencias;
    }

    public String getTipoNivel() {
        return tipoNivel;
    }

    public void setTipoNivel(String tipoNivel) {
        this.tipoNivel = tipoNivel;
    }

    public int getAreaZonasComunes() {
        return areaZonasComunes;
    }

    public void setAreaZonasComunes(int areaZonasComunes) {
        this.areaZonasComunes = areaZonasComunes;
    }

    public int getNumFinca() {
        return numFinca;
    }

    public void setNumFinca(int numFinca) {
        this.numFinca = numFinca;
    }

    
    
    

}