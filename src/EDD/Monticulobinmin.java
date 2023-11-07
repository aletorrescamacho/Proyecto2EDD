/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author Rebeca
 */
public class Monticulobinmin {
    private int[] arrMonticulo;
    private int tamano;

    public Monticulobinmin(int capacidad) {
        arrMonticulo = new int[capacidad];
    }

    public void insert(int valor) {
        if (isFull()) throw new IndexOutOfBoundsException("Heap is full");

        arrMonticulo[tamano] = valor;

        fixHeapAbove(tamano);
        tamano++;
    }

    private void fixHeapAbove(int index) {
        int newValue = arrMonticulo[index];

        while (index > 0 && newValue > arrMonticulo[getParent(index)]) {
            arrMonticulo[index] = arrMonticulo[getParent(index)];
            index = getParent(index);
        }

        arrMonticulo[index] = newValue;
    }

    public boolean isFull() {
        return arrMonticulo.length == tamano;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public int[] getArrMonticulo() {
        return arrMonticulo;
    }

    
    

}
