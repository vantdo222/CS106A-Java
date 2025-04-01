/*
 * File: GLen.java
 * ---------------
 */

import acm.graphics.*;
import java.awt.*;

/**
 * Defines a new GPolygon class that appears as a convex lens
 * @author Van Do
 */
public class GLens extends GPolygon {
	
	/**
	 * Creaetes a new GLens centered at the origin with the
	 * specified witdth and height
	 * @param width The width of the lens
	 * @param height The height of the lens
	 */
	public GLens(double width, double height) {
		double r = ((height * height) + (width * width)) / (4 * width);
		addVertex(0, height / 2);
		addArc(r * 2, r * 2, -45, 90);
		addArc(r * 2, r * 2, 135, 90);
		setFilled(true);
		setFillColor(Color.gray);
	}

}
