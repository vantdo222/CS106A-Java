/*
 * File: MouseCircles.java
 * ------------------------
 * This program should draw a circle each time the mouse is clicked,
 * centered where the click occurs.  Each circle has a randomly
 * chosen color and a randomly chosen radius between MIN_RADIUS
 * and MAX_RADIUS pixels.
 */

import java.awt.event.MouseEvent;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class MouseCircles extends GraphicsProgram {

	/** Minimum radius */
	private static final double MIN_RADIUS = 5;

	/** Maximum radius */
	private static final double MAX_RADIUS = 50;

	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		gobj = drawCircle(e.getX(), e.getY());
		last = new GPoint(e.getPoint());
		add(gobj);
	}

	public void mouseDragged(MouseEvent e) {
		gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
		last = new GPoint(e.getPoint());
	}
	
	private GOval drawCircle(double x, double y) {
		double radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		GOval circle = new GOval(x - radius, y - radius, radius * 2, radius * 2);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		return circle;
	}
			
	/* Private instance variable */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GObject gobj;
	private GPoint last;
	
}
