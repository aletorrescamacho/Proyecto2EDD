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
public class UbicarNodosArreglo2 {

    public static void main(String[] args) {

        // Crear un arreglo de nodos
        int[] treeArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Ubicar los nodos
        int[][] coordenadas = ubicarNodos(treeArray);

        // Imprimir las coordenadas
        for (int i = 0; i < coordenadas.length; i++) {
            System.out.println("Nodo " + i + ": (" + coordenadas[i][0] + ", " + coordenadas[i][1] + ")");
        }
    }

    public static int[][] ubicarNodos(int[] treeArray) {

        int[][] coordenadas = new int[treeArray.length][2];

        // Ubicar la raíz
        coordenadas[0][0] = 500;
        coordenadas[0][1] = 0;

        // Ubicar los demás nodos
        for (int i = 1; i < treeArray.length; i++) {
            int padre = (i - 1) / 2;

            // Calcular la coordenada x del nodo
            int x = (int) (coordenadas[padre][0] + (i % 2) * (1000 / (Math.pow(2, padre + 1))));

            // Calcular la coordenada y del nodo
            int y = coordenadas[padre][1];

            coordenadas[i][0] = x;
            coordenadas[i][1] = y;
        }

        return coordenadas;
    }
}