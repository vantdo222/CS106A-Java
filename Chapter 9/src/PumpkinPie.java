/*
 * File: PumpkinPie.java
 * ---------------------
 * This program draws a picture of a pumpking pie divided into
 * equal wedge-shaped pieces where the number of pieces is
 * indicated by a constant. Each wedge is a separate GArc, filled
 * in orange and outlined in black.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class PumpkinPie extends GraphicsProgram {
	
	public void run() {
		double x = getWidth() / 2;
		double y = getHeight() / 2;
		
		for (int i = 0; i < N_PIECES; i ++) {
			add(createPiece(50, i * 360 / N_PIECES, 360 / N_PIECES), x, y);
		}
	}
	
	private GPolygon createPiece(double length, double start, double sweep) {
		GPolygon piece = new GPolygon();
		piece.addVertex(0, 0);
		piece.addPolarEdge(length, start);
		piece.addArc(length * 2, length * 2, start, sweep);
		piece.setFilled(true);
		piece.setFillColor(Color.orange);
		return piece;
	}
	
	private static final int N_PIECES = 6;

}
