package com.mxgraph.examples.swing;

import javax.swing.JFrame;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class HelloWorld extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2707712944901661771L;

	public HelloWorld()
	{
		super("Hello, World!");

		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();

		graph.getModel().beginUpdate();
		try
		{
			Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 80,
					30);
			Object v2 = graph.insertVertex(parent, null, "World!", 240, 150,
					80, 30);
			Object v3 = graph.insertVertex(parent, null, "This", 100, 150,
					80, 30);
			Object v4 = graph.insertVertex(parent, null, "is", 240, 100,
					80, 30);
			Object v5 = graph.insertVertex(parent, null, "SPARTA!", 340, 1500,
					80, 30);
			graph.insertEdge(parent, null, "Edge", v1, v2);
			graph.insertEdge(parent, null  , "wert", v3, v4);
			graph.insertEdge(parent, null, "foo", v2, v3);
			graph.insertEdge(parent, null, "foo", v2, v4);
			graph.insertEdge(parent, null, "super", v4, v5, "");
			mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
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
		frame.setSize(500, 420);
		frame.setVisible(true);
	}

}
