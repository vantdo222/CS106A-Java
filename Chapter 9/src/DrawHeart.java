/*
 * File: DrawHeart.java
 * --------------------
 * This program draw a heart on the screen using the classes
 * GArc and GLine.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawHeart extends GraphicsProgram {
	
	public void run() {
		double midpoint = Math.sqrt(2 * SIDE * SIDE);
		GPolygon heart = new GPolygon();
		heart.addVertex(0, midpoint);
		heart.addPolarEdge(SIDE, 45);
		heart.addArc(SIDE, SIDE, -45, 180);
		heart.addArc(SIDE, SIDE, 45, 180);
		double x = (getWidth() - heart.getWidth()) / 2;
		double y = (getHeight() - heart.getHeight()) / 2;
		heart.setFilled(true);
		heart.setColor(Color.red);
		add(heart, x, y);
	}
	
	private static final int SIDE = 100;
	
}
