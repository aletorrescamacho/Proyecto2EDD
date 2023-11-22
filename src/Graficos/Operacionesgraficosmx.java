/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;


import Documentos.Documentos;
import javax.swing.JFrame;
import com.mxgraph.view.mxGraph;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.swing.mxGraphComponent;


public class Operacionesgraficosmx extends JFrame {

    /**
     *
     */


    public Operacionesgraficosmx(Documentos[] arrMont) {
        super("Vista Árbol");

        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

         //arreglo de vertices
        Object[] arrVert =  new Object[arrMont.length];
       
        for (int i = 0; i < arrMont.length; i++) {
            Object v = graph.insertVertex(parent, null, arrMont[i].getNombredoc(), 0, 0, 80, 30);
            arrVert[i] =  v;
            
        }
        for (int i= 0; i <arrMont.length; i++){
            if ((2*i+1)<arrMont.length){
                     graph.insertEdge(parent, null, "", arrVert[i], arrVert[2*i+1]);
                }
                if ((2*i+2)<arrMont.length){
                     graph.insertEdge(parent, null, "", arrVert[i], arrVert[2*i+2]);
                }
    }
        mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
        layout.setUseBoundingBox(false);

        layout.execute(parent);

        graph.getModel().endUpdate();

        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        getContentPane().add(graphComponent);
    }

}
