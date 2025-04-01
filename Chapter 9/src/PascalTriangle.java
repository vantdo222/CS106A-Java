/*
 * File: PascalTriangle.java
 * -------------------------
 * This program displays the first several rows of Pascal's
 * Triangle. The top circle is centered horizontally a few pixels
 * below the top of the window. This program generates additional
 * rows of the triangle as long as all the circles in the new row
 * will fit on the canvas. As soon as the circles in a row would 
 * extend past the sides or the bottom of the window, this program
 * would stop.
 */

import acm.graphics.*;
import acm.program.*;

public class PascalTriangle extends GraphicsProgram {
	
	public void run() {
		int x = getWidth();
		int y = getHeight();
		int row = y / (RADIUS * 2 + DISTANCE);
		while ((RADIUS * 2 + DISTANCE) * row > x) {
			row -= 1;
		}
		for (int i = 0; i < row; i ++) {
			for (int j = 0; j <= i; j ++) {
				int dx = (getWidth() - (RADIUS * 2 * (i + 1)) - DISTANCE * i) / 2 + (DISTANCE * j + RADIUS * 2 * j);
				createCircle(dx, 5 + (DISTANCE + RADIUS * 2) * i, combinations(i, j));
			}
		}
	}
	
	public void createCircle(double x, double y, int num) {
		GOval circle = new GOval(x, y, RADIUS * 2, RADIUS * 2);
		GLabel number = new GLabel(Integer.toString(num));
		number.setFont("SansSerif-16");
		add(number, x + (RADIUS * 2 - number.getWidth()) / 2, y + (RADIUS * 2 + number.getAscent()) / 2);
		add(circle);
	}
	
	private int combinations(int n, int k) {
		int numerator = 1;
		int denominator = 1;
		if (k == 0 || k == n) {
			return 1;
		} 
		for (int i = 1; i <= n; i ++) {
			numerator *= i;
		}
		for (int i = 1; i <= k; i ++) {
			denominator *= i;
		}
		for (int i = 1; i <= (n - k); i ++) {
			denominator *= i;
		}
		return numerator / denominator;
		
	}
	
	private static final int RADIUS = 25;
	private static final int DISTANCE = 20;
	

}
