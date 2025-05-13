/*
 * File: LabeledColor.java
 * -----------------------
 * This class extends the standard Color class but also takes
 * a name to use a the result of the toString method.
 */

import java.awt.*;

public class LabeledColor extends Color {

	public LabeledColor(Color color, String colorName) {
		super(color.getRed(), color.getGreen(), color.getBlue());
		label = colorName;
	}
	
	public String toString() {
		return label;
	}
	
	private String label;
}
