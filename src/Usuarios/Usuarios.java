/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
import Documentos.Documentos;
import EDD.Lista;

/**
*Clase Usuarios, tiene como atributos: nombre de usuario y tipo, contiene los getters y setters
*@author: Alessandra Torres
*@version: 03/11/23
 */
public class Usuarios {

    private String Nombreusu;
    private String Tipo;
    private Lista<Documentos> Listadocs;

    public Usuarios(String Nombreusu, String Tipo) {
        this.Nombreusu = Nombreusu;
        this.Tipo = Tipo;
        this.Listadocs = new Lista ();
    }
    
    
    /**
     * @return the Nombreusu
     */
    public String getNombreusu() {
        return Nombreusu;
    }

    /**
     * @param Nombreusu the Nombreusu to set
     */
    public void setNombreusu(String Nombreusu) {
        this.Nombreusu = Nombreusu;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Lista<Documentos> getListadocs() {
        return Listadocs;
    }

    
    
}
