/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

/**
 *
 * @author Rebeca
 */
import Documentos.Documentos;
import static Interfaz.Ventana3.Monticulo;
import javax.swing.JFrame;
import com.mxgraph.view.mxGraph;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGraphModel;
import com.mxgraph.swing.mxGraphComponent;
import java.util.Arrays;

public class Operacionesgraficosmx extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -2707712944901661771L;

    public Operacionesgraficosmx() {
        super("Vista Árbol");

//        Documentos[] arrTam = new Documentos[Monticulo.getTamMonticulo()];
//        for (int i = 0; i < Monticulo.getTamMonticulo(); i++) {
//            arrTam[i] = Monticulo.getArrMonticulo()[i];
//        }
        Documentos[] arrTam = {new Documentos("a", "a", 1), new Documentos("b", "a", 1), new Documentos("c", "a", 1), new Documentos("d", "a", 1), new Documentos("e", "a", 1), new Documentos("f", "a", 1), new Documentos("g", "a", 1), new Documentos("h", "a", 1)};
        System.out.println(Arrays.toString(arrTam));

        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        Object Root = graph.insertVertex(parent, null, arrTam[0].getNombredoc(), 0, 0, 80, 30);
        Object p = Root;
        int cont = 0;
        for (int i = 1; i < arrTam.length; i++) {
            if (arrTam[i] == null) {
                continue;
            } else {
                Object v = graph.insertVertex(parent, null, arrTam[i].getNombredoc(), 0, 0, 80, 30);
                graph.insertEdge(parent, null, "", p, v);
                if (cont == 2) {
                    p = v;
                    cont = 0;
                }
                int hijoder = (i - 1) / 2;
                int hijoizq = i * 2 + 1;
                if ((hijoder > arrTam.length - 1 || hijoizq > arrTam.length - 1) || (arrTam[hijoder] == null || arrTam[hijoizq] == null) ) {
                    continue;
                } else {
                    if (hijoder <= arrTam.length - 1) {
                        Object v1 = graph.insertVertex(parent, null, arrTam[hijoder].getNombredoc(), 0, 0, 80, 30);
                        arrTam[hijoder] = null;
                        graph.insertEdge(parent, null, "", v, v1);
                        cont++;
                    }
                    if (hijoizq <= arrTam.length - 1) {
                        Object v2 = graph.insertVertex(parent, null, arrTam[hijoizq].getNombredoc(), 0, 0, 80, 30);
                        arrTam[hijoizq] = null;
                        graph.insertEdge(parent, null, "", v, v2);
                        cont++;
                    }
                }
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
        Operacionesgraficosmx frame = new Operacionesgraficosmx();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 320);
        frame.setVisible(true);
    }
}
