/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author Rebeca
 */
import java.util.Arrays;


public class MinHeap {
	
	protected int[] arrMonticulo; 
	protected int capacidadMax;   
	protected int tamMonticulo;    
	
	public MinHeap(int capacidad) { 
		this.tamMonticulo = 0; 
		this.capacidadMax = capacidad; 
		this.arrMonticulo = new int[capacidad];
	}
	
	
	protected static int getIndPadre(int idx) {
		return (idx-1)/2;
	}
	
	protected static int getIndHijoIzq(int idx) {
		return idx*2 + 1;
	}
	
	protected static int getIndHijoDer(int idx) {
		return idx*2 + 2;
	}
	
	protected void intercambiar(int[] a, int p1, int p2) {
		if (p1<0 || p1>a.length-1 || p2<0 || p2>a.length-1) return;
		int temp = a[p1];
		a[p1] = a[p2];
		a[p2] = temp;
	}
	
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(this.arrMonticulo, 0, this.tamMonticulo));
	}
        

	public void insertar(int e) {
		if (this.tamMonticulo == this.capacidadMax) {
			System.out.println("\nHeap capacidad reached! No more elements allowed.\n");
			return;
		}
		arrMonticulo[tamMonticulo] = e;
                tamMonticulo = tamMonticulo + 1;
		int curPos = tamMonticulo - 1; 
		int parPos = getIndPadre(curPos);
		while (arrMonticulo[parPos] > arrMonticulo[curPos] && curPos > 0) {
			intercambiar(arrMonticulo, curPos, parPos);
			curPos = parPos;
			parPos = getIndPadre(curPos);
		}
	}
	

	public int getMin() {
		return this.arrMonticulo[0];
	}
	

	public int eliminarMin() {
		int min = getMin();
		intercambiar(this.arrMonticulo, 0, tamMonticulo-1);
		this.tamMonticulo--; 
		if (0 < this.tamMonticulo) minHeapify(0);
		return min;
	}
	

	public void eliminarporInd(int idx) {
		if (idx >= this.tamMonticulo) {
			System.out.println("\nNo element found or index out of heap capacidad!\n");
			return;
		}
		intercambiar(this.arrMonticulo, idx, tamMonticulo-1);
		this.tamMonticulo--;
		if (idx < this.tamMonticulo) minHeapify(idx);
	}
	

	public void imprimirArbol() {
		int levelSize = 1, cover = 0, level = 1;
		int remain = this.tamMonticulo;
		while (remain > 0) {
			System.out.print("Level " + (level++) + ": "); 
			int i = cover;
			cover += Math.min(levelSize, remain);
			for (; i<cover; i++) System.out.print(this.arrMonticulo[i] + " ");
			System.out.println();
			remain -= levelSize; 
			levelSize <<= 1;
		}
	}
	

	public void minHeapify(int idx) {
		if (idx >= this.tamMonticulo) {
			System.out.println("\nNo element found or index out of heap capacidad!\n");
			return;
		}
		int curPos = idx;
		int posIzq = getIndHijoIzq(curPos), posDer = getIndHijoDer(curPos);
		while (true) {
			if (posIzq < tamMonticulo && arrMonticulo[curPos] > arrMonticulo[posIzq] && (posDer >= tamMonticulo || arrMonticulo[posDer] >= arrMonticulo[posIzq])) {
				intercambiar(this.arrMonticulo, curPos, posIzq);
				curPos = posIzq;
			} else if (posDer < tamMonticulo && arrMonticulo[curPos] > arrMonticulo[posDer] && arrMonticulo[posIzq] > arrMonticulo[posDer]) {
				intercambiar(this.arrMonticulo, curPos, posDer);
				curPos = posDer;
			} else break;
			posIzq = getIndHijoIzq(curPos);
			posDer = getIndHijoDer(curPos);
		}
	}
	

        
	public static boolean isMinHeap(int[] a) {
		for (int i=getIndPadre(a.length-1); i>=0; i--) {
			int l = getIndHijoIzq(i), r = getIndHijoDer(i);
			if (l < a.length && a[l] < a[i]) return false;
			if (r < a.length && a[r] < a[i]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
            MinHeap heap = new MinHeap(10); 
		heap.insertar(7);
//		heap.insertar(6);
//		heap.insertar(52);
//		heap.insertar(34);

                    

                
            heap.imprimirArbol();
            System.out.println("Printing Min Heap as array: " + heap.toString());
	}

}