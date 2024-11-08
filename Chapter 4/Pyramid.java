/*
 * File: Pyramid.java
 * ------------------
 * This program draws a pyramid consisting of bricks
 * arranged in horizontal rows, so that the number of bricks
 * in each row decreases by one as you move up the pyramid.
 */

import acm.program.*;
import acm.graphics.*;

public class Pyramid extends GraphicsProgram {
	
	private static final double BRICK_WIDTH = 30;
	private static final double BRICK_HEIGHT = 10;
	private static final int BRICKS_IN_BASE = 12;
	
	public void run() {
		double x = getWidth() / 2;
		double y = (getHeight() - BRICK_HEIGHT * BRICKS_IN_BASE) / 2;
		for (int i = 1; i <= BRICKS_IN_BASE; i++) {
			for (int j = i; j > -i; j -= 2) {
				GRect brick = new GRect(x - (BRICK_WIDTH / 2) * j, y + BRICK_HEIGHT * i, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
		}
	}
}
