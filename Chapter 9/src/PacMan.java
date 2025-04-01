/*
 * File: PacMan.java
 * -----------------
 * This program adds a PacMan figure at the extreme left edge of
 * the canvas. The PacMan figure move rightward until it disappears
 * off the edge of the canvas. As it moves, the program changes the
 * start and sweep angles so that the mouth appears to open and
 * close.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class PacMan extends GraphicsProgram {
	
	public void run() {
		double dx = 3;
		GArc PacMan = new GArc(RADIUS * 2, RADIUS * 2, 45, 270);
		PacMan.setFilled(true);
		PacMan.setFillColor(Color.yellow);
		add(PacMan, 0, 50);
		int start = 35;
		int sweep = 290;
		int dstart = -10;
		int dsweep = 20;
		while (PacMan.getX() + PacMan.getWidth() < getWidth()) {
			PacMan.setStartAngle(start);
			PacMan.setSweepAngle(sweep);
			PacMan.move(dx, 0);
			pause(PAUSE_TIME);
			if (start < 0 || sweep < 270) {
				dstart *= -1;
				dsweep *= -1;
			} 
			start += dstart;
			sweep += dsweep;
		}
	}
	
	// PacMan dimensions
	private static final int RADIUS = 50;
	
	// Pause time
	private static final int PAUSE_TIME = 40;
}
