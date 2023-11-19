
package Documentos;

import EDD.Lista;
import EDD.Nodo;
import Usuarios.Usuarios;

 /**
*operaciones realizables sobre lista de documentos. 
*@author: Luis Soriano
*@version: 05/11/23
 */

//reducir tamano lista
public class Operacioneslistadocs {
     public static void agregarDoc(Lista<Documentos> listaDocs, String docNombre, String tipoDoc, int pags) {
        Documentos nuevoDoc = new Documentos(docNombre, tipoDoc,pags);
        listaDocs.Agregarfinal(nuevoDoc);
        Nodo<Documentos> aux = listaDocs.getpFirst();
        while (aux != null) {
            aux = aux.getSig();
        }
    }

    public static void eliminarDoc(Lista<Documentos> listaDocs, String docNombre, String tipoDoc, int pags) {
        boolean encontrado = false;
        Nodo<Documentos> actual = listaDocs.getpFirst();
        Nodo<Documentos> anterior = null;
        
        while ((actual != null) && (encontrado == false)) {
            if (actual.getElem().getNombredoc().equalsIgnoreCase(docNombre)){
                encontrado = true;
            }
            else{
                anterior = actual;
                actual = actual.getSig();
            }
        }
        if (actual == listaDocs.getpFirst()){
            listaDocs.setpFirst(actual.getSig());
        }
        if (anterior != null){
             anterior.setSig(actual.getSig());
        }
        actual.setSig(null);
        actual = null;
        
        
        Nodo <Documentos> temp = listaDocs.getpFirst();
        while (temp != null){
            temp = temp.getSig();
        }    

            }
}
