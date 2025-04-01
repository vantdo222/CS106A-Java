/*
 * File: ILoveJavaBlock.java
 * -------------------------
 * This file defines the I Love Java block class as a subclass of
 * the more general QuiltBlock class.
 */

import acm.graphics.*;
import java.awt.*;

public class ILoveJavaBlock extends QuiltBlock {
	
	/**
	 * Creates a new I Love Java block with the specified color
	 * @param background The color of the block
	 * @param heartColor The color of the heart
	 */
	public ILoveJavaBlock(Color background, Color heartColor) {
		super(background);
		
		double midpoint = Math.sqrt(2 * HEART_SIDE * HEART_SIDE);
		GPolygon heart = new GPolygon();
		heart.addVertex(0, midpoint);
		heart.addPolarEdge(HEART_SIDE, 45);
		heart.addArc(HEART_SIDE, HEART_SIDE, -45, 180);
		heart.addArc(HEART_SIDE, HEART_SIDE, 45, 180);
		heart.setFilled(true);
		heart.setColor(heartColor);
		add(heart, SIDE / 2, 16);
		addText("I", SIDE / 2 - 2, SIDE * 0.35);
		addText("Love", SIDE / 3 - 2, SIDE * 0.5);
		addText("Java", SIDE / 3 - 2, SIDE * 0.65);
		
	}
	
	private void addText(String text, double x, double y) {
		GLabel word = new GLabel(text);
		word.setFont("SansSerif-bold-14");
		word.setColor(Color.white);
		add(word, x, y);
	}
	
	// Dimensions of the heart
	private static final double HEART_SIDE = SIDE * 0.5;

}
