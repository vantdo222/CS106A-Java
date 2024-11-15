/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	
	private static final int RADIUS = 72;
	private static final int NUM_CIRCLE = 3;
	
	public void run() {
		for (int i = NUM_CIRCLE; i > 0; i --) {
			double r = RADIUS * (double) i / NUM_CIRCLE;
			double x = (getWidth() - r) / 2;
			double y = (getHeight() - r) / 2;
			
			if (i % 2 == 0) {
				add(drawCircle(x, y, r, Color.white));
			} else {
				add(drawCircle(x, y, r, Color.red));
			}
		}
}
	
	private GOval drawCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x, y, r, r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
}
