/*
 * File: MakeBoxes.java
 * --------------------
 * This program draws some boxes. It's your job to predict exactly what
 * the output of this code will look like.
 */

import java.awt.event.MouseEvent;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class MakeBoxes extends GraphicsProgram {

	public void run() {
		for (int i = 0; i < 3; i++) {
			GRect newBox = createBox(i + 1);
			add(newBox, i * 100, i * 100);
		}
	}

	private GRect createBox(int i) {
		GRect box = new GRect(i * 20, i * 20);
		i += 5;
		return box;
	}
}
