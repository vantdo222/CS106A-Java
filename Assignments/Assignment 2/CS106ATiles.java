/*
 * File: CS106ATiles.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class CS106ATiles extends GraphicsProgram {
	
	/** Amount of space (in pixels) between tiles */
	private static final int TILE_SPACE = 20;
	private static final int TILE_WIDTH = 100;
	private static final int TILE_HEIGHT = 60;
	private static final int COLUMN = 2;
	private static final int ROW = 2;

	public void run() {
		double x = (getWidth() - TILE_SPACE - TILE_WIDTH * COLUMN) / 2;
		double y = (getHeight() - TILE_SPACE - TILE_HEIGHT * ROW) / 2;
		
		for (int i = 0; i < COLUMN; i++) {
			for (int j = 0; j < ROW; j++) {
				GRect box = new GRect(x + (TILE_SPACE + TILE_WIDTH) * i, y + (TILE_SPACE + TILE_HEIGHT) * j, TILE_WIDTH, TILE_HEIGHT);
				add(box);
				
				GLabel label = new GLabel ("CS106A");
				double lx = (TILE_WIDTH - label.getWidth()) / 2;
				double ly = (TILE_HEIGHT + label.getAscent()) / 2;
				label.setLocation(box.getX() + lx, box.getY() + ly);
				add(label);
			}
		}
	}
}

