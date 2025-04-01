/*
 * File: NestedSquareBlock.java
 * ----------------------------
 * This file defines the nested square block class as a subclass of
 * the more general QuiltBlock class.
 */

import acm.graphics.*;
import java.awt.*;

public class NestedSquareBlock extends QuiltBlock {
	
	public NestedSquareBlock(Color background, Color diamond) {
		super(background);
		GDiamond dia = new GDiamond(SIDE, SIDE);
		dia.setFilled(true);
		dia.setFillColor(diamond);
		add(dia, SIDE / 2, SIDE / 2);
		
		GRect square = new GRect(SIDE / 4, SIDE / 4, SIDE / 2, SIDE / 2);
		square.setFilled(true);
		square.setFillColor(background);
		add(square);
		
		GDiamond dia2 = new GDiamond(SIDE / 2, SIDE / 2);
		dia2.setFilled(true);
		dia2.setFillColor(diamond);
		add(dia2, SIDE / 2, SIDE / 2);
	}
}
