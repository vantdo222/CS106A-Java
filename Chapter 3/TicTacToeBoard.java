import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class TicTacToeBoard extends GraphicsProgram {
	
	private static final double BOARD_SIZE = 300;
	
	public void run() {
		double width = (getWidth() - BOARD_SIZE) / 2;
		double height = (getHeight() - BOARD_SIZE) / 2;
		add(new GLine(width, height + BOARD_SIZE / 3, width + BOARD_SIZE, height + BOARD_SIZE / 3));
		add(new GLine(width, height + BOARD_SIZE * (2.0/3), width + BOARD_SIZE, height + BOARD_SIZE * (2.0/3)));
		add(new GLine(width + BOARD_SIZE/3, height, width + BOARD_SIZE/3, height + BOARD_SIZE));
		add(new GLine(width + BOARD_SIZE * (2.0/3), height, width + BOARD_SIZE * (2.0/3), height + BOARD_SIZE));
	}

}
