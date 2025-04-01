/*
 * File: GTshape.java
 * ------------------
 */

import acm.graphics.*;

/**
 * Defines a new GObject class that appears as a T-shape
 * @author Van Do
 */

public class GTShape extends GPolygon {

/**
 * Creates a new GTShape centered at the left corner with the
 * specified width and length
 * @param width The width of the T-shape 
 * @param length The length of the T-shape
 */
	public GTShape(double width, double length) {
		addVertex(width, 0);
		addEdge(-width, 0);
		addEdge(0, length / 4);
		addEdge(width / 3, 0);
		addEdge(0, length * (double) (3.0 / 4.0));
		addEdge(width / 3, 0);
		addEdge(0, -length * (double) (3.0 / 4.0));
		addEdge(width / 3, 0);
		addEdge(0, -length / 4);
	}

}
