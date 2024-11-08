/*
 * File: Checkers.java
 * -------------------
 * This program draws a checker board and the set of red and
 * black checkers corresponding to the initial state of the 
 * game.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Checkers extends GraphicsProgram {
	
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
	
	public void run() {
		double squ_size = getHeight() / N_COLUMNS;
		double ck_size = squ_size * (8.0 / 10);
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLUMNS; j++) {
				double x = squ_size * j + (getWidth() - N_COLUMNS * squ_size) / 2;
				double y = squ_size * i;                       
				GRect square = new GRect(x, y, squ_size, squ_size);
				square.setFilled((i + j) % 2 != 0);
				square.setColor(Color.gray);
				add(square);
				
				//Add checkers in the first 3 rows and last 3 rows
				if ((i+j) % 2 != 0) {
					if (i < 3) {
						addChecker(x + squ_size / 10, y + squ_size / 10, ck_size, ck_size, Color.red);
					} else if (i > 4) {
						addChecker(x + squ_size / 10, y + squ_size / 10, ck_size, ck_size, Color.black);
					} 
				}
			}
		}
	}
	public void addChecker(double x, double y, double width, double height, Color color) {
		GOval checker = new GOval(x, y, width, height);
		checker.setFilled(true);
		checker.setFillColor(color);
		add(checker);
	}

}
