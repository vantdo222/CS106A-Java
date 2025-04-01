/*
 * File: RandomColorBox.java
 * -------------------------
 * This program displays a filled black square in the center
 * of the canvas. The color of the square changes once a 
 * second to a new color randomly.
 */

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
import java.awt.*;

public class RandomColorBox extends GraphicsProgram {
	
	public void run() {
		int x = (getWidth() - SIDE) / 2;
		int y = (getHeight() - SIDE) / 2;
		GRect square = new GRect(x, y, SIDE, SIDE);
		square.setFilled(true);
		square.setColor(Color.black);
		add(square);
		
		while (true) {
			pause(1000);
			square.setColor(getColor());
		}
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();

	private Color getColor() {
		return rgen.nextColor();
	}
	
	private static final int SIDE = 100;
}
