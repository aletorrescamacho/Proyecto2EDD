/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Documentos.Documentos;
import EDD.Lista;
import EDD.Nodo;
import javax.swing.JTextArea;

/**
*Clase Operacioneslistausu
*@author: Alessandra Torres
*@version: 05/11/23
 */
public class Operacioneslistausu {
    
    /**
    *Metodo Agregarusu, toma el nombre de usuario dado en el textfield y el tipo seleccionado en el combobox y agrega el elemento de tipo usuario con ese dato a la lista
    *@author: Alessandra Torres
    *@version: 05/11/23
     */
    public static void Agregarusu(Lista<Usuarios> listausu, String nombreusu, String tipo) {
        Usuarios Nuevousu = new Usuarios(nombreusu, tipo);
        listausu.Agregarfinal(Nuevousu);
        Nodo<Usuarios> aux = listausu.getpFirst();
        while (aux != null) {
            System.out.println(aux.getElem().getNombreusu());
            aux = aux.getSig();
            System.out.println(listausu.getTamano());
        }
    }

    /**
    *Método Eliminarsu, elimina al usuario de la lista, el mismo es seleccionado en un combobox
    *@author: Alessandra Torres
    *@version: 05/11/23
    */
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
            listausu.setpFirst(actual.getSig());
        }
        
        if (anterior != null){
            anterior.setSig(actual.getSig());
        }
        
        actual.setSig(null);
        actual = null;
        Nodo <Usuarios> temp = listausu.getpFirst();
        
        listausu.setTamano(listausu.getTamano() -1);
                
        while (temp != null){
            System.out.println(temp.getElem().getNombreusu());
            temp = temp.getSig();
            System.out.println(listausu.getTamano());
        }    

            }
    
        /**
        *Muestra los usuarios y sus documentos en el textArea
        *@author: Alessandra Torres
        *@version: 05/11/23
        */
        public static void Mostrarusu(Lista<Usuarios> listausu, JTextArea tamostrarUsu) {
            Nodo <Usuarios> aux1 = listausu.getpFirst();
            tamostrarUsu.setText("");
            while (aux1 != null){
                tamostrarUsu.append("Usuario: \n");
                tamostrarUsu.append("   "+aux1.getElem().getNombreusu());

                Nodo <Documentos> aux2 = aux1.getElem().getListadocs().getpFirst();
                tamostrarUsu.append("\nDocumentos: \n");
                if (aux2 == null){
                    tamostrarUsu.append("       Ninguno\n");
                }else{
                int contador = 1;
                String enColasino;
                while (aux2 != null){
                    if (aux2.getElem().isEncola() == false){
                        enColasino = "No";
                    }
                    else{
                        enColasino = "Si";
                    }
                    tamostrarUsu.append("   "+contador+". Nombre: "+aux2.getElem().getNombredoc()+"\n");
                    tamostrarUsu.append("       Tipo: "+aux2.getElem().getTipo()+"\n       Tamaño: "+aux2.getElem().getTamano()+" pag/s.\n       En cola de impresión: "+enColasino+"\n");
                    aux2 = aux2.getSig();
                    contador++;
                }
                }
                
                aux1 = aux1.getSig();
            }
        
        }
        }





