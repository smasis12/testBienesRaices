package Modelo;

import java.util.*;

/**
 * 
 */
public class Nivel {
    private int cantidadResidencias;
    private boolean tipoNivel;
    private int areaZonasComunes;
    /**
     * Default constructor
     */
    public Nivel() {
    }
    
    public Nivel(int pResidencias, boolean pTipoNivel, int pAreasComunes){
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

    public boolean getTipoNivel() {
        return tipoNivel;
    }

    public void setTipoNivel(boolean tipoNivel) {
        this.tipoNivel = tipoNivel;
    }

    public int getAreaZonasComunes() {
        return areaZonasComunes;
    }

    public void setAreaZonasComunes(int areaZonasComunes) {
        this.areaZonasComunes = areaZonasComunes;
    }

 
    
    

}