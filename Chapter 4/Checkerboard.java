/*
 * File: Checkerboard.java
 * -----------------------
 * This program draws a checker board. The dimensions of the
 * checker board are specified by the constants N_ROWS and
 * N_COLUMNS, and the size of the squares is chosen so
 * that the checker board fills the available vertical space.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Checkerboard extends GraphicsProgram {
	
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
	
	public void run() {
		double size = getHeight() / N_COLUMNS;
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLUMNS; j++) {
				double x = size * j;
				double y = size * i;                       
				GRect square = new GRect(x, y, size, size);
				square.setFilled((i + j) % 2 != 0);
				add(square);
			}
		}
	}

}
