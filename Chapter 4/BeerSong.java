/*
 * File: BeerSong.java
 * -------------------
 * This programs generates the lyrics to the beer song for
 * a given number of bottles.
 */

import acm.program.*;

public class BeerSong extends ConsoleProgram {
	
	private static final int BOTTLE = 5;
	
	public void run() {
		for (int i = BOTTLE; i > 0; i--) {
			print(i + " bottle" + (i == 1 ? "" : "s") + " of beer on the wall.\n" 
					+ i + " bottle" + (i == 1 ? "" : "s") + " of beer.\n"
					+ "You take one down, pass it around.\n" 
					+ (i - 1) + " bottle" + (i - 1 <= 1 ? "" : "s") + " of beer on the wall.");
		}
	}

}
