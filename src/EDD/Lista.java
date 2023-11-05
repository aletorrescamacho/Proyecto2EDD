/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

import Usuarios.Usuarios;

/**
*Clase lista, contiene los seters y getters, al igual que el metodo agregarfinal
*@author: Alessandra Torres
*@version: 03/11/23
 */
public class Lista <T> {
    
    private Nodo<T> pFirst;
    private Nodo<T> pLast;
    private int tamano;

    public Lista() {
        pFirst = null;
        pLast = null;
        tamano = 0;
    }

    /**
     * @return the pFirst
     */
    public Nodo<T> getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo<T> pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo<T> getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo<T> pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param aTamano the tamano to set
     */
    public void setTamano(int aTamano) {
        tamano = aTamano;
    }
    
     public void Agregarfinal(T elem) {
        Nodo nodoNuevo = new Nodo(elem);
        Nodo pred = null;
        if (this.getpFirst() == null) {
             this.setpFirst(nodoNuevo);
             this.setpLast(nodoNuevo);
        } else {
            Nodo aux = this.getpFirst();
            while (aux != null) {
                pred = aux;
                aux = aux.getSig();
            }

            pred.setSig(nodoNuevo);
        }
        tamano++;
    }
     
}
