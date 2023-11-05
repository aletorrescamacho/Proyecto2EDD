/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import EDD.Lista;
import EDD.Nodo;

/**
 *
 * @author Rebeca
 */
public class Operacioneslistausu {

    public static void Agregarusu(Lista<Usuarios> listausu, String nombreusu, String tipo) {
        Usuarios Nuevousu = new Usuarios(nombreusu, tipo);
        listausu.Agregarfinal(Nuevousu);
        Nodo<Usuarios> aux = listausu.getpFirst();
        while (aux != null) {
            System.out.println(aux.getElem().getNombreusu());
            aux = aux.getSig();
        }
    }

    public static void Eliminarusu(Lista<Usuarios> listausu, String nombreusu) {
        boolean encontrado = false;
        Nodo<Usuarios> actual = listausu.getpFirst();
        Nodo<Usuarios> anterior = null;
        
        while ((actual != null) && (encontrado == false)) {
            if (actual.getElem().getNombreusu().equalsIgnoreCase(nombreusu)){
                encontrado = true;
            }
            else{
                anterior = actual;
                actual = actual.getSig();
            }
        }
        if (actual == listausu.getpFirst()){
            listausu.setpFirst(actual);
        }
        anterior.setSig(actual.getSig());
        actual.setSig(null);
        actual = null;
        Nodo <Usuarios> temp = listausu.getpFirst();

        while (temp != null){
            System.out.println(temp.getElem().getNombreusu());
            temp = temp.getSig();
        }    

            }

        }



