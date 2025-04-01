/*
 * File: LogCabinBlock.java
 * ------------------------
 * This file defines the log cabin block class as a subclass of
 * the more general QuiltBlock class.
 */

import acm.graphics.*;
import java.awt.*;

public class LogCabinBlock extends QuiltBlock {
	
	/**
	 * Creates a new log cabin block with the specified color.
	 * @param color The color of the block
	 */
	public LogCabinBlock(Color color) {
		super(color);
		for (int i = 0; i < 4; i ++) {
			add(new GLine(10 * i, 10 * (i + 1), SIDE - 10 * (i + 1), 10 * (i + 1)));
			add(new GLine(10 * (i + 1), SIDE - 10 * (i + 1), SIDE - 10 * i, SIDE - 10 * (i + 1)));
			add(new GLine(10 * (i + 1), 10 * (i + 1), 10 * (i + 1), SIDE - 10 * i));
			add(new GLine(SIDE - 10 * (i + 1), 10 * i, SIDE - 10 * (i + 1), SIDE - 10 * (i + 1)));
		}
		GRect center = new GRect(40, 40, 10, 10);
		center.setFilled(true);
		center.setFillColor(Color.white);
		add(center);
	}
}
