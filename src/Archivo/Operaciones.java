/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;
import Interfaz.Ventana2;
import javax.swing.filechooser.FileNameExtensionFilter;
import EDD.Lista;
import EDD.Nodo;
import Interfaz.Ventana1;
import Interfaz.Ventana3;
import Usuarios.Usuarios;
/**
*Operaciones relacionadas con el archivo csv
*@author: Alessandra Torres
*@version: 03/11/23
 */
public class Operaciones {


/**
*Cargar archivo con ayuda de Jfilechooser y crear una lista de tipo usuarios con su información
*@author: Alessandra Torres
*@version: 03/11/23
 */    
    public static Lista<Usuarios> Cargararchivo(Ventana1 v1) {
    Scanner entrada = null;
    Lista<Usuarios> listausu = new Lista();
    
    
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter Filtro = new FileNameExtensionFilter("Archivos .csv", "csv");
        fileChooser.setFileFilter(Filtro);
        int valorret = fileChooser.showOpenDialog(fileChooser);
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();                                        
            File f = new File(ruta);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                String info1 = entrada.nextLine();
                String[] info2 = info1.split(",");
                String nombre = info2[0];     
                String tipo = info2[1];
                Usuarios u = new Usuarios(nombre,tipo);
                //System.out.println(entrada.nextLine());
                if (!nombre.equalsIgnoreCase("usuario") && !tipo.equalsIgnoreCase("tipo")){
                    listausu.Agregarfinal(u);
                }
            }
            v1.dispose();
            Ventana3 v3 = new Ventana3();
        } catch (Exception e) {
            Ventana2 v2 = new Ventana2();
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
        Nodo <Usuarios> aux = listausu.getpFirst();
        while (aux != null){
            System.out.println(aux.getElem().getNombreusu());
            aux = aux.getSig();
            
        }
        return listausu;
    }
    
    
}