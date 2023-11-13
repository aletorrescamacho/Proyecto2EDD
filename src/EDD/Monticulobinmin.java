/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
*Clase monticulo binario
*@author: Luis Soriano y Alessandra Torres
*@version: 08/11/23
 */
import Documentos.Documentos;
import java.util.Arrays;

public class Monticulobinmin {

    protected Documentos[] arrMonticulo;
    protected int capacidadMax;
    protected int tamMonticulo;

    public Monticulobinmin(int capacidad) {
        this.tamMonticulo = 0;
        this.capacidadMax = capacidad;
        this.arrMonticulo = new Documentos[capacidad];
    }

    public Documentos[] getArrMonticulo() {
        return arrMonticulo;
    }

    public int getTamMonticulo() {
        return tamMonticulo;
    }
    
    
    public boolean esVacio(){
     if (this.tamMonticulo == 0){
         return true;
     }
     else{
        return false;
     }
    }
    
    
    /**
    *Métodos getIndPadre, getIndHijoIzq, getIndHijoDer, devuelven el indice en el del padre, hijo Izq o hijo Derecho respectivamente del arreglo
    *@author: Luis Soriano y Alessandra Torres
    *@version: 08/11/23
     */

    protected static int getIndPadre(int idx) {
        return (idx - 1) / 2;
    }

    protected static int getIndHijoIzq(int idx) {
        return idx * 2 + 1;
    }

    protected static int getIndHijoDer(int idx) {
        return idx * 2 + 2;
    }

    /**
    *Intercambia una posición del arreglo por otra, valida que las posiciones dadas por parametros no sean menor que 0 y que esten dentro del largo del array
    *@author: Luis Soriano y Alessandra Torres
    *@version: 08/11/23
     */
    protected void intercambiar(Documentos[] a, int p1, int p2) {
        if (p1 < 0 || p1 > a.length - 1 || p2 < 0 || p2 > a.length - 1) {
            return;
        }
        Documentos temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }

     /**
    *Con ayuda de la java.util.Arrays convierte el arreglo a String para poderlo imprimir
    *@author: Luis Soriano y Alessandra Torres
    *@version: 08/11/23
     */
    public String toString() {
        
        return Arrays.toString(Arrays.copyOfRange(this.arrMonticulo, 0, this.tamMonticulo));
    }
    
     /**
    *Imprime el arreglo como String mostrando los datos del documento (Nombre y Etiqueta de tiempo)
    *@author: Luis Soriano y Alessandra Torres
    *@version: 08/11/23
     */
    public void imprimirdatos() {
        System.out.print("[ ");
        for (int i = 0; i < this.tamMonticulo; i++) {
            System.out.print("Nombre: "+this.arrMonticulo[i].getNombredoc()+"; Et tiempo: "+this.arrMonticulo[i].getEtTiempo()+", ");
        }
        System.out.println("]");
    }

//	public void insertar(int e) {
//		if (this.tamMonticulo == this.capacidadMax) {
//			System.out.println("\nHeap capacidad reached! No more elements allowed.\n");
//			return;
//		}
//		arrMonticulo[tamMonticulo] = e;
//                tamMonticulo = tamMonticulo + 1;
//		int curPos = tamMonticulo - 1; 
//		int parPos = getIndPadre(curPos);
//		while (arrMonticulo[parPos] > arrMonticulo[curPos] && curPos > 0) {
//			intercambiar(arrMonticulo, curPos, parPos);
//			curPos = parPos;
//			parPos = getIndPadre(curPos);
//		}
//	}
    
    
     /**
    *Inserta en el monticulo un nuevo documento enviado a la cola de impresión, si es el más pequeño en etiqueta de tiempo lo envia a la raíz
    *@author: Luis Soriano y Alessandra Torres
    *@version: 08/11/23
     */
    public void insertar(Documentos docToSend) {
        if (this.tamMonticulo == this.capacidadMax) {
            System.out.println("\nHeap capacidad reached! No more elements allowed.\n");
            return;
        }
        arrMonticulo[tamMonticulo] = docToSend;
        tamMonticulo = tamMonticulo + 1;
        int curPos = tamMonticulo - 1;
        int parPos = getIndPadre(curPos);
        while (arrMonticulo[parPos].getEtTiempo() > arrMonticulo[curPos].getEtTiempo() && curPos > 0) {
            intercambiar(arrMonticulo, curPos, parPos);
            curPos = parPos;
            parPos = getIndPadre(curPos);
        }
    }
    
    /**
    *Devuelve la raíz del monticulo (Documento con menor etiqueta de tiempo)
    *@author: Luis Soriano y Alessandra Torres
    *@version: 08/11/23
     */
    public Documentos getMin() {
        return this.arrMonticulo[0];
    }
    
    
     /**
    *Elimina el elemento con la etiqueta de tiempo más pequeña del moonticulo y con auyuda de MinHeapify lo reordena
    *@author: Luis Soriano y Alessandra Torres
    *@version: 08/11/23
     */
    public Documentos eliminarMin() {
        Documentos min = getMin();
        intercambiar(this.arrMonticulo, 0, tamMonticulo - 1);
        this.tamMonticulo--;
        if (0 < this.tamMonticulo) {
            minHeapify(0);
        }
        return min;
    }

    /**
    *Imprime el árbol nivel por nivel
    *@author: Luis Soriano y Alessandra Torres
    *@version: 08/11/23
     */
    public void imprimirArbol() {
        int levelSize = 1, cover = 0, level = 1;
        int remain = this.tamMonticulo;
        while (remain > 0) {
            System.out.print("Level " + (level++) + ": ");
            int i = cover;
            cover += Math.min(levelSize, remain);
            for (; i < cover; i++) {
                System.out.print(this.arrMonticulo[i] + " ");
            }
            System.out.println();
            remain -= levelSize;
            levelSize <<= 1;
        }
    }
    
    /**
    *Reordena el monticulo para que el Documento con menor etiqueta de tiempo se encuentre en la raíz
    *@author: Luis Soriano y Alessandra Torres
    *@version: 08/11/23
     */
    public void minHeapify(int idx) {
        if (idx >= this.tamMonticulo) {
            System.out.println("\nNo element found or index out of heap capacidad!\n");
            return;
        }
        int curPos = idx;
        int posIzq = getIndHijoIzq(curPos), posDer = getIndHijoDer(curPos);
        while (true) {
            if (posIzq < tamMonticulo && arrMonticulo[curPos].getEtTiempo() > arrMonticulo[posIzq].getEtTiempo() && (posDer >= tamMonticulo || arrMonticulo[posDer].getEtTiempo() >= arrMonticulo[posIzq].getEtTiempo())) {
                intercambiar(this.arrMonticulo, curPos, posIzq);
                curPos = posIzq;
            } else if (posDer < tamMonticulo && arrMonticulo[curPos].getEtTiempo() > arrMonticulo[posDer].getEtTiempo() && arrMonticulo[posIzq].getEtTiempo() > arrMonticulo[posDer].getEtTiempo()) {
                intercambiar(this.arrMonticulo, curPos, posDer);
                curPos = posDer;
            } else {
                break;
            }
            posIzq = getIndHijoIzq(curPos);
            posDer = getIndHijoDer(curPos);
        }
    }

//        
//	public static boolean isMinHeap(int[] a) {
//		for (int i=getIndPadre(a.length-1); i>=0; i--) {
//			int l = getIndHijoIzq(i), r = getIndHijoDer(i);
//			if (l < a.length && a[l] < a[i]) return false;
//			if (r < a.length && a[r] < a[i]) return false;
//		}
//		return true;
//	}
//	

}
