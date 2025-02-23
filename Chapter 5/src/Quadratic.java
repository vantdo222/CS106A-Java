/*
 * File: Quadratic.java
 * --------------------
 * This program accepts values for a, b, and c, and then
 * calculates the two solutions.
 */

import acm.program.*;

public class Quadratic extends ConsoleProgram {
	
	public void run() {
		println("Enter coefficients for the quadratic equation:");
		int a = readInt("a: ");
		int b = readInt("b: ");
		int c = readInt("c: ");
		
		//Calculation
		int delta = b*b - 4*a*c;
		if (delta < 0) {
			println("The equation has no real solutions.");
		} else if (delta == 0) {
			println("The equation has one real solution: " + (double) (-b/(2*a)));
		} else {
			println("The first solution is: " + (double)(-b + Math.sqrt(delta)) / (2*a));
			println("The first solution is: " + (double)(-b - Math.sqrt(delta)) / (2*a));
		}
	}

}
