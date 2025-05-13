/*
 * File: RandomColorLabel.java
 * ---------------------------
 * This program displays 7 colored labels including red,
 * orange, yellow, green, cyan, blue, magenta in random
 * positions. The color for each label is randomly chosen
 * from the other colors in this list.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;
import java.awt.*;
import java.awt.event.*;

public class RandomColorLabel extends GraphicsProgram {
	
	public void init() {
		for (COLOR color : COLOR.values()) {
			GLabel label = new GLabel(color.toString());
			label.setFont("SansSerif-bold-36");
			int i = getInt();
			while (i == color.ordinal()) {
				i = getInt();
			}
			label.setColor(getColor(i));
			
			double x = getXCord();
			double y = getYCord();
			if (x + label.getWidth() > getWidth()) {
				x -= label.getWidth();
			}
			if (y - label.getHeight() < 0) {
				y += label.getHeight();
			}
			add(label, x, y);
		}
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		label = (GLabel) getElementAt(e.getX(), e.getY());
		if (label != null) {
			COLOR c = COLOR.valueOf(label.getLabel());
			label.setColor(getColor(c.ordinal()));
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		int i = getInt();
		COLOR c = COLOR.valueOf(label.getLabel());
		while (i == c.ordinal()) {
			i = getInt();
		}
		label.setColor(getColor(i));
	}

	
	 private Color getColor(int i) {
		switch (i) {
		default:
			return Color.red;
		case 1:
			return Color.orange;
		case 2:
			return Color.yellow;
		case 3:
			return Color.green;
		case 4:
			return Color.cyan;
		case 5:
			return Color.blue;
		case 6:
			return Color.magenta;
		}
	}
	
	private int getInt() {
		return rgen.nextInt(0, 6);
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private double getXCord() {
		return rgen.nextDouble(0, getWidth());
	}
	
	private double getYCord() {
		return rgen.nextDouble(0, getWidth());
	}
	
	private enum COLOR {
		RED, ORANGE, YELLOW, GREEN, CYAN, BLUE, MAGENTA
	}
	
	private GLabel label;
}
