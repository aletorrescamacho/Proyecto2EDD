/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;



public class Documentos {

    private String nombredoc;
    private String tipo;
    private int tamano;
    private boolean enCola;
    private int etTiempo;
    private int multPrioUsu;
    private int multPrioTam;

    public Documentos(String nombredoc, String tipo, int tamano) {
        this.nombredoc = nombredoc;
        this.tipo = tipo;
        this.tamano = tamano;
        this.enCola = false;
        this.etTiempo = -1;
        this.multPrioTam = 0;
        this.multPrioUsu = 0;
        
    }
    
        /**
     * @return the multPrioUsu
     */
    public int getMultPrioUsu() {
        return multPrioUsu;
    }

    /**
     * @param multPrioUsu the multPrioUsu to set
     */
    public void setMultPrioUsu(int multPrioUsu) {
        this.multPrioUsu = multPrioUsu;
    }

    /**
     * @return the multPrioTam
     */
    public int getMultPrioTam() {
        return multPrioTam;
    }

    /**
     * @param multPrioTam the multPrioTam to set
     */
    public void setMultPrioTam(int multPrioTam) {
        this.multPrioTam = multPrioTam;
    }
    

        /**
     * @return the etTiempo
     */
    public int getEtTiempo() {
        return etTiempo;
    }

    /**
     * @param etTiempo the etTiempo to set
     */
    public void setEtTiempo(int etTiempo1, int multUsu, int multTam) {
        this.etTiempo = etTiempo1*multUsu*multTam;
    }
    
    /**
     * @return the nombredoc
     */
    public String getNombredoc() {
        return nombredoc;
    }

    /**
     * @param nombredoc the nombredoc to set
     */
    public void setNombredoc(String nombredoc) {
        this.nombredoc = nombredoc;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the encola
     */
    public boolean isEncola() {
        return enCola;
    }

    /**
     * @param encola the encola to set
     */
    public void setEncola(boolean encola) {
        this.enCola = encola;
    }

    
    
}
