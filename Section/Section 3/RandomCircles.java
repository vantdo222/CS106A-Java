/*
 * File: RandomCircles.java
 * ------------------------
 * This program should draw a set of 10 circles with different sizes,
 * positions, and colors.  Each circle has a randomly chosen
 * color, a randomly chosen radius between MIN_RADIUS and MAX_RADIUS pixels,
 * and a randomly chosen position on the canvas, subject to
 * the condition that the entire circle must fit inside the
 * canvas without extending past the edge.
 */

import java.awt.event.MouseEvent;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {

	/** Number of circles */
	private static final int NCIRCLES = 10;

	/** Minimum radius */
	private static final double MIN_RADIUS = 5;

	/** Maximum radius */
	private static final double MAX_RADIUS = 50;

	public void run() {
		for (int i = 1; i <= NCIRCLES; i++) {
			drawCircle();
		}
	}
	
	private void drawCircle() {
		double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		double x = rgen.nextDouble(0, getWidth() - r * 2);
		double y = rgen.nextDouble(0, getHeight() - r * 2);
		GOval circle = new GOval(x, y, r * 2, r * 2);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle);
	}
			
	/* Private instance variable */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	
}
