/*
 * File: DartGame.java
 * -------------------
 * This programs simulates throwing 10,000 darts and then uses
 * the simulation technique described in this exercise to
 * generate and display an approximate value of pi.
 */

import acm.program.*;
import acm.util.*;

public class DartGame extends ConsoleProgram {
	
	public void run() {
		int circle = 0;
		for (int i = 1; i <= 10000; i ++) {
			double x = getXcor();
			double y = getYcor();
			if ((x * x + y * y) < 1) {
				circle += 1;
			}
		}
		double pi = (double) circle * 4 / 10000;
		println("Pi equals approximately " + pi);
	}
	
	// Create an instance variable for the random number generator
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	// Throw a dart and return its coordinates in the Cartesian coordinate plane
	private double getXcor() {
		double x = rgen.nextDouble(-1, 1);
		return x;
	}
	
	private double getYcor() {
		double y = rgen.nextDouble(-1, 1);
		return y;
	}

}
