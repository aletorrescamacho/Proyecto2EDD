/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;
import Documentos.Documentos;
import Graficos.Operacionesgraficosmx;
import static Interfaz.Ventana3.Monticulo;
import javax.swing.JFrame;
import com.mxgraph.view.mxGraph;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGraphModel;
import com.mxgraph.swing.mxGraphComponent;
import java.util.Arrays;

/**
 *
 * @author luiss
 */
public class Prueba2 extends JFrame {
    
    private static final long serialVersionUID = -2707712944901661771L;

    public Prueba2() {
        super("Vista Árbol");

//        Documentos[] arrTam = new Documentos[Monticulo.getTamMonticulo()];
//        for (int i = 0; i < Monticulo.getTamMonticulo(); i++) {
//            arrTam[i] = Monticulo.getArrMonticulo()[i];
//        }
        Documentos[] arrTam = {new Documentos("a", "a", 1), new Documentos("b", "a", 1), new Documentos("c", "a", 1), new Documentos("d", "a", 1), new Documentos("e", "a", 1), new Documentos("f", "a", 1), new Documentos("g", "a", 1), new Documentos("h", "a", 1),new Documentos("i", "a", 1),new Documentos("j", "a", 1),new Documentos("k", "a", 1),new Documentos("l", "a", 1),new Documentos("m", "a", 1),new Documentos("n", "a", 1),new Documentos("o", "a", 1),new Documentos("p", "a", 1)};
        System.out.println(Arrays.toString(arrTam));

        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();
        
        //arreglo de vertices
        Object[] arrVert =  new Object[arrTam.length];
       
        for (int i = 0; i < arrTam.length; i++) {
            Object v = graph.insertVertex(parent, null, arrTam[i].getNombredoc(), 0, 0, 80, 30);
            arrVert[i] =  v;
            
        }
        for (int i= 0; i <arrTam.length; i++){
            if ((2*i+1)<arrTam.length){
                     graph.insertEdge(parent, null, "", arrVert[i], arrVert[2*i+1]);
                }
                if ((2*i+2)<arrTam.length){
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

    public static void main(String[] args) {
        Prueba2 frame = new Prueba2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 320);
        frame.setVisible(true);
    }
}
