import acm.program.*;

public class CircleArea extends ConsoleProgram {
	
	private static final double PI = 3.14159265358979323846;
	
	public void run() {
		println("This program calculates the area of the circle.");
		double r = readDouble("Enter radius: ");
		println("Circle area = " + PI*r*r);
	}
}
