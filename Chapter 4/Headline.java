/*
 * File: Headline.java
 * -------------------
 * This program simulates headlines on large display screens
 * that show a single line of text.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Headline extends GraphicsProgram {
	
	private static final int PAUSE_TIME = 20;
	
	public void run() {
		GLabel headline = new GLabel("DEWEY DEFEATS TRUMAN");
		headline.setFont("Helvetica-200");
		double width = headline.getWidth();
		double height = headline.getAscent();
		double x = getWidth();
		double y = ((getHeight() - height) / 2) + height * (6.0 / 7);
		headline.setLocation(x, y);
		add(headline);
		
		//Animation
		while (true) {
			headline.move(-5, 0);
			pause(PAUSE_TIME);
		}
	}
}
