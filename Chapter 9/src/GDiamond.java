/*
 * File: GDiamond.java
 * -------------------
 */

import acm.graphics.*;

/**
 * Defines a new GObject class that appears as a diamond
 * @author Van Do
 */
public class GDiamond extends GPolygon {

/**
 * Creates a new GDiamond centered at the origin with the
 * specified width and height
 * @param width The width of the diamond
 * @param height The height of the diamond
 */
	
	public GDiamond(double width, double height){
		double dx = width / 2;
		double dy = height / 2;
		addVertex(-dx, 0);
		addEdge(dx, dy);
		addEdge(dx, -dy);
		addEdge(-dx, -dy);
	}
}
