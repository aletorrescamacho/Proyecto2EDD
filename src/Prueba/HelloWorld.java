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

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingConstants;

import com.mxgraph.layout.mxCompactTreeLayout;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxGraph;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
public class HelloWorld extends JFrame{

    /**
     * 
     */
    private static final long serialVersionUID = -2707712944901661771L;

    public HelloWorld()
    {
        super("Hello, puppies!");

        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try
        {
            //Notice that the parent is the default parent... 
            //The hierarchical structure looks great but I cannot collapse/expand the tree.
            Object vDogsRoot = graph.insertVertex(parent, null, "DOG", 0, 0, 80, 30);
            Object v2 = graph.insertVertex(parent, null, "Shar Pei", 0, 0, 80, 30);
            Object v3 = graph.insertVertex(parent, null, "Pug", 0, 0, 80, 30);
            Object v4 = graph.insertVertex(parent, null, "Cocker Spaniel", 0, 0, 80, 30);
            Object v5 = graph.insertVertex(parent, null, "Pit Bull", 0, 0, 80, 30);
            Object v6 = graph.insertVertex(parent, null, "Chihuahua", 0, 0, 80, 30);

            graph.insertEdge(parent, null, "", vDogsRoot, v2);
            graph.insertEdge(parent, null, "", vDogsRoot, v3);
            graph.insertEdge(parent, null, "", vDogsRoot, v4);
            graph.insertEdge(parent, null, "", vDogsRoot, v5);
            graph.insertEdge(parent, null, "", vDogsRoot, v6);

            mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
            layout.setUseBoundingBox(false);

            layout.execute(parent);
        }
        finally
        {
            graph.getModel().endUpdate();
        }

        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        getContentPane().add(graphComponent);
    }

    public static void main(String[] args)
    {
        HelloWorld frame = new HelloWorld();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 320);
        frame.setVisible(true);
    }
    }
    
