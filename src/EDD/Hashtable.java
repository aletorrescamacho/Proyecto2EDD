/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

import Usuarios.Usuarios;


 /**
*Clase Hashtable, con su constructor se crea un arreglo de tamaño indicado en la variable capacidad y de tipo documentos, es nuestra tabla de dispersión
*@author: Luis Soriano
*@version: 09/11/23
 */
public class Hashtable {
    private Nodo <Usuarios>[] arrHashTable;
    private int capacidad;
    

    public Hashtable() {
        this.capacidad = 150;
        arrHashTable = new Nodo [capacidad];
    }

    public Nodo <Usuarios> [] getArrHashTable() {
        return arrHashTable;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
     /**
    *Algoritmo Hash predeterminado, es el que se usa para ubicar cada usuario en una posición de la tabla, este algoritmo utiliza el valor ASCII de cada caracter del nombre de usuario
    *@author: Alessandra Torres
    *@version: 09/11/23
     */
    

    public int algoritmoHashDefault(String nombreUsu) {

        char[] arrCadaCharUsu = nombreUsu.toCharArray();
        int numAntesMod = 0;
        for (int i = 0; i < arrCadaCharUsu.length; i++) {
            int charAsciiMult = arrCadaCharUsu[i] * (i+1);
            numAntesMod = numAntesMod + charAsciiMult;
        }
        
        return numAntesMod % this.capacidad; 

    }
    
    

}


