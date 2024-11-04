import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawHouse extends GraphicsProgram {
	
	private static final double WIDTH = 400;
	private static final double HEIGHT = 300;
	
	public void run() {
		double x = (getWidth() - WIDTH)/ 2;
		double y = (getHeight() - HEIGHT)/ 2;
		
		// Roof
		add(new GLine(x + WIDTH / 2, y, x, y + HEIGHT / 3));
		add(new GLine(x + WIDTH / 2, y, x + WIDTH, y + HEIGHT / 3));
		
		// House
		add(new GRect(x, y + HEIGHT / 3, WIDTH, HEIGHT * (2.0/3)));
		
		// Door
		add(new GRect(x + WIDTH *(2.0/5), y + HEIGHT / 2, WIDTH / 5, HEIGHT / 2));
		add(new GOval(x + WIDTH *(14.0/25), y + HEIGHT * (3.0/4), 10, 10));
		
		// Windows
		add(new GRect(x + WIDTH *(1.0/10), y + HEIGHT / 2, WIDTH / 5, HEIGHT / 5));
		add(new GRect(x + WIDTH *(7.0/10), y + HEIGHT / 2, WIDTH / 5, HEIGHT / 5));
		
	}

}
