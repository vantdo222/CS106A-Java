/*
 * File: Target.java
 * -----------------
 * This program displays a target logo at the center in the
 * window.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	
	//Constants
	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	
	public void run() {
		for (int i = N_CIRCLES; i > 0; i--) {
			double x = (getWidth() - OUTER_RADIUS * ((double) i / N_CIRCLES)) / 2;
			double y = (getHeight() - OUTER_RADIUS * ((double) i / N_CIRCLES)) / 2;
			
			if (i % 2 == 0) {
				add(createFilledCircle(x, y, OUTER_RADIUS * ((double) i / N_CIRCLES), Color.white));
			} else {
				add(createFilledCircle(x, y, OUTER_RADIUS * ((double) i / N_CIRCLES), Color.red));
			}
		}
	}
	
	//create filled circles
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x, y, r, r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}

}
