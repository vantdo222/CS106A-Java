/*
 * File: QuiltBlock.java
 * ---------------------
 *This file defines that abstract superclass for all quilt blocks.
 */

import acm.graphics.*;
import java.awt.*;

// This abstract class defines what is common to all quilt blocks
public abstract class QuiltBlock extends GCompound {
	
	/**
	 * Creates the frame of the quilt block using specified color
	 * @param color The color of the new quilt block
	 */
	public QuiltBlock (Color color) {
		GRect bound = new GRect(SIDE, SIDE);
		bound.setFilled(true);
		bound.setFillColor(color);
		add(bound);
	}
	
	// Dimensions of the block
	protected static final int SIDE = 90;

}
