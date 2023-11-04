/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
*Clase nodo, contiene los getters y setters
*@author: Alessandra Torres
*@version: 03/11/23
 */
public class Nodo <T> {
    private T elem;
    private Nodo sig;
    
    public Nodo(T elem){
        this.elem = elem;
        sig = null;
    }

    /**
     * @return the elem
     */
    public T getElem() {
        return elem;
    }

    /**
     * @param elem the elem to set
     */
    public void setElem(T elem) {
        this.elem = elem;
    }

    /**
     * @return the sig
     */
    public Nodo getSig() {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
