/*
 * File: RadioactiveDecay.java
 * ---------------------------
 * This program simulates the decay of a sample that contains
 * 10,000 atoms of radioactive material, where each atom has
 * a 50 percent chance of decaying in a year.
 */

import acm.program.*;
import acm.util.*;

public class RadioactiveDecay extends ConsoleProgram {
	
	public void run() {
		int atoms = 10000;
		int year = 1;
		println("There are " + atoms + " atoms initially");
		
		// Get the number of atoms left after a year
		for (int i = 1; i <= atoms; i++) {
				atoms += getDecay();
			}
		
 		while (atoms > 0) {
			println("There are " + atoms + " atoms at the end of year " + year);
			year += 1;
			for (int i = 1; i <= atoms; i++) {
 				atoms += getDecay();
 			}
		}
 		println("There are 0 atoms at the end of year " + year);
	}
	
	// Create an instance variable for the random number generator
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	// Generate the number of atoms decaying per year
	 private int getDecay() {
		 int decay = rgen.nextInt(-1, 0);
		 return decay;
	 }

}
