/*
 * File: AnimatedSquare.java
 * -------------------------
 * This program animates a square that it moves from the
 * upper left corner of the window to the lower right corner.
 */

import acm.graphics.*;
import acm.program.*;

public class AnimatedSquare extends GraphicsProgram {
	
	private static final int N_STEPS = 300;
	private static final double SIZE = 50;
	private static final int PAUSE_TIME = 20;
	
	public void run() {
		GRect square = new GRect(0, 0, SIZE, SIZE);
		square.setFilled(true);
		add(square);
		
		//distance
		double x = (double) (getWidth() - SIZE) / N_STEPS;
		double y = (double) (getHeight() - SIZE) / N_STEPS;
		for (int i = 0; i < N_STEPS; i++) {
			square.move(x, y);
			pause(PAUSE_TIME);
		}
	}

}
