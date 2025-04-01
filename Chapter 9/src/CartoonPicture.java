/*
 * File: CartoonPicture.java
 * -------------------------
 * This program displays my favorite cartoons on the screen
 * along with a citation indicating the source.
 */

import acm.graphics.*;
import acm.program.*;

public class CartoonPicture extends GraphicsProgram {
	
	public void run() {
		GImage image = new GImage("Cat.jpg");
		add(image);
		addCitation("Facebook");
	}
	
	private void addCitation(String text) {
		GLabel citation = new GLabel(text);
		citation.setFont(CITATION_FONT);
		double x = getWidth() - citation.getWidth();
		double y = getHeight() - citation.getAscent() / 2;
		add(citation, x, y);
	}
	
	private static final String CITATION_FONT = "SansSerif-10";
	private static final int CITATION_MARGIN = 13;
	
	public static final int APPLICATION_WIDTH = 720;
	public static final int APPLICATION_HEIGHT = 787 + CITATION_MARGIN;

}
