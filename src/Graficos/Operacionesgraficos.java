/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import Documentos.Documentos;
import static Interfaz.Ventana3.Monticulo;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;
import java.util.Arrays;

/**
 * Operaciones relacionadas con la vista del árbol
 *
 * @author: Alessandra Torres
 * @version: 03/11/23
 */
public class Operacionesgraficos {

    public static void Verarbol() {
        Graph graph = new MultiGraph("embedded");
        graph.setAttribute(
                "ui.stylesheet",
                "node{\n"
                + "    size: 50px, 50px;\n"
                + "    fill-color: #05ffff;\n"
                + "    text-mode: normal; \n"
                + "}");
        System.setProperty("org.graphstream.ui", "swing");
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

//    viewer.disableAutoLayout();
        viewer.enableAutoLayout();
        Documentos[] arrTam = new Documentos[Monticulo.getTamMonticulo()];
        for (int i = 0; i < Monticulo.getTamMonticulo(); i++) {
            arrTam[i] = Monticulo.getArrMonticulo()[i];
        }
        System.out.println(Arrays.toString(arrTam));
        int niveles = 0;
        double dosElev = 0;
        double contPow = 0;
        while (arrTam.length > dosElev) {
            System.out.println(dosElev = dosElev + Math.pow(2, contPow));
            contPow++;
            niveles++;
        }
        System.out.println(niveles);
        try{
        Node a = graph.addNode(String.valueOf(arrTam[0].getNombredoc()));
        a.setAttribute("ui.label", String.valueOf(arrTam[0].getNombredoc()));
        a.setAttribute("xy", 0, 100);
        int contadorEdge = 0;
        if(arrTam.length > 1){
        for (int i = 1; i <= arrTam.length; i++) {

                int parent = (i - 1) / 2;
                Node c = graph.getNode(String.valueOf(arrTam[parent].getNombredoc()));
                Node b = graph.addNode(String.valueOf(arrTam[i].getNombredoc()));
                b.setAttribute("ui.label", String.valueOf(arrTam[i].getNombredoc()));
                graph.addEdge(String.valueOf(contadorEdge), b, c);
                contadorEdge++;

            
        }
        int contTam = 0;
        dosElev = 0;
        int posY = 10;
        while (contTam <= arrTam.length) {
            int curPos = 0;
            dosElev = dosElev + Math.pow(2, contTam);
            for (int z = curPos; (z < dosElev - 1) && (z >= arrTam.length); z++) {
                Node x = graph.getNode(String.valueOf(arrTam[z].getNombredoc()));
                x.setAttribute("y", posY);
                contTam++;
                curPos = z;
            }
            posY = posY - 1;

        }
        }
        
}
        catch(Exception e){
        
        }
    }
}
