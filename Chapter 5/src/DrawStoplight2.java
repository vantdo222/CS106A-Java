/*
 * File: DrawStoplight2.java
 * -------------------------
 * This program draws a traditional stoplight with a red, yellow, 
 * and green light in a gray rectangular frame.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawStoplight2 extends GraphicsProgram {
	
	private static final double FRAME_WIDTH = 50;
	private static final double FRAME_HEIGHT = 100;
	private static final double LAMP_RADIUS = 20;
	
	public void run() {
		double x = (getWidth() - FRAME_WIDTH) / 2;
		double y = (getHeight() - FRAME_HEIGHT) / 2;
		
		add(createFilledRect(x, y, FRAME_WIDTH, FRAME_HEIGHT, Color.gray));
		
		add(createFilledCircle(x + (FRAME_WIDTH - LAMP_RADIUS) / 2, y + FRAME_HEIGHT / 10, LAMP_RADIUS, Color.red));
		add(createFilledCircle(x + (FRAME_WIDTH - LAMP_RADIUS) / 2, y + FRAME_HEIGHT * (4.0 / 10), LAMP_RADIUS, Color.yellow));
		add(createFilledCircle(x + (FRAME_WIDTH - LAMP_RADIUS) / 2, y + FRAME_HEIGHT * (7.0 / 10), LAMP_RADIUS, Color.green));
	}

	private GOval createFilledCircle(double x, double y, double r,Color color) {
		GOval circle = new GOval(x, y, r, r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
	private GRect createFilledRect(double x, double y, double width, double height, Color color) {
		GRect rect = new GRect(x, y, width, height);
		rect.setFilled(true);
		rect.setColor(color);
		return rect;
	}
}
