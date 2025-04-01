/*
 * File: PatchworkQuilt.java
 * -------------------------
 * This program displays a sampler quilt. This quilt consists of
 * three different block types, as follows:
 * - Log cabin block: The log cabin block is composed of a series
 * of frames, each of which is nested inside the next larger one. 
 * Each frame is in turn composed of four rectangle laid out to
 * form a square.
 * - Nested square block: This block is composed of squares in
 * alternating colors stacked so that each new square is rotated
 * 45 degrees from the preceding one and then resized so that it
 * fits entirely inside its predecessor.
 * - I love java block: This square contains a red heart
 * superimposed on a pink background. Centered on each heart is
 * the message "I Love Java" with one word per line. 
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class PatchworkQuilt extends GraphicsProgram {
	
	public void run() {
		double dx = 0;
		double dy = 0;
		int row = getHeight() / 90;
		int column = getWidth() / 90;
		for (int i  = 0; i < row; i ++) {
			for (int j = 0; j < column; j ++) {
				if ((i + j) % 3 == 0) {
					add(new LogCabinBlock(Color.green), 90 * j, 90 * i);
				} else if ((i + j) % 4 == 0 || i + j == 1) {
					add(new NestedSquareBlock(Color.cyan, Color.magenta), 90 * j, 90 * i);
				} else {
					add(new ILoveJavaBlock(Color.pink, Color.red), 90 * j, 90 * i);
				}
			}
		}
	}
}
