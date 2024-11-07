/*
 * File: MysteryCalculation.java
 * -----------------------------
 * This program evaluates y for different value of x
 * given a linear equation 
 */

import acm.program.*;

public class MysteryCalculation extends ConsoleProgram {
	
	private static final int SENTINEL = -1;
	
	public void run() {
		int a = readInt("Enter a value for a: ");
		int b = readInt("Enter a value for b: ");
		int x = readInt("Enter a value for x: ");
		while (x != SENTINEL) {
			int y = a * x + b;
			println("Result for x = " + x + " is " + y);
			x = readInt("Enter a value for x: ");
		}
		
	}

}
