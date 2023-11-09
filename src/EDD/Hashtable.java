/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

import Documentos.Documentos;

 /**
*Clase Hashtable, con su constructor se crea un arreglo de tamaño indicado en la variable capacidad y de tipo documentos, es nuestra tabla de dispersión
*@author: Alessandra Torres
*@version: 05/11/23
 */
public class Hashtable {
    private Documentos[] arrHashTable;
    private int capacidad;
    

    public Hashtable() {
        this.capacidad = 500;
        arrHashTable = new Documentos[capacidad];
    }

    public Documentos[] getArrHashTable() {
        return arrHashTable;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
     /**
    *Algoritmo Hash predeterminado, es el que se usa para ubicar cada usuario en una posición de la tabla, este algoritmo utiliza el valor ASCII de cada caracter del nombre de usuario
    *@author: Alessandra Torres
    *@version: 05/11/23
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
    
    /**
    *Algoritmo Hash en caso de colisión, en caso de ese problema se realiza este algoritmo en el usuario para conseguirle otro puesto en la tabla
    *@author: Alessandra Torres
    *@version: 05/11/23
     */
        public int algoritmoHashColision(String nombreUsu) {
            char[] arrCadaCharUsu = nombreUsu.toCharArray();
            int numAntesMod = 0;
            for (int i = 0; i < arrCadaCharUsu.length; i++) {
                int charAsciiMult = arrCadaCharUsu[i] * (i+1);
                numAntesMod = numAntesMod + charAsciiMult;
            }
            numAntesMod = numAntesMod*arrCadaCharUsu[0];
            if (arrCadaCharUsu.length > 1){
                numAntesMod = numAntesMod*arrCadaCharUsu.length*arrCadaCharUsu[arrCadaCharUsu.length - 1];
            }
            
        return  numAntesMod % this.capacidad;

    }


  public static void main(String[] args) {
      Hashtable ht1 = new Hashtable();
      System.out.println(ht1.algoritmoHashDefault("ales"));
      System.out.println(ht1.algoritmoHashColision("ales"));
	}

}


