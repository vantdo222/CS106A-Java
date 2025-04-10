/*
 * File: Craps.java
 * ----------------
 * This program plays the casino game of Craps. At the beginning of the game,
 * the player rolls a pair of dice and computes the total. If the total is 2, 
 * 3, or 12 (called "craps"), the player loses. If the total is 7 or 11
 * (called a "natural"), the play wins. If the total is any other number,
 * that number becomes the "point." From here, the player keeps rolling the
 * dice until (a) the point comes up a gain, in which case the player wins or
 * (b) a 7 appear, in which case the player lose. The numbers 2, 3, 11, 
 * and 12 no longer have special significance after the first roll.
 */

import acm.program.*;
import acm.util.*;

public class Craps extends ConsoleProgram {
	
	public void run() {
		int total = rollTwoDice();
		if (total == 2 || total == 3 || total == 12) {
			println("That's craps. You lose.");
		} else if (total == 7 || total == 11) {
			println("That's a natural. You win.");
		} else {
			println("Your point is " + total);
			int point = total;
			while (true) {
				total = rollTwoDice();
				if (total == point) {
					println("You made your point. You win.");
					break;
				} else if (total == 7) {
					println("That's a 7. You lose.");
					break;
				}
			}
		}
	}
	
	// Roll two dice and returns their sum.
	private int rollTwoDice() {
		int d1 = rgen.nextInt(1, 6);
		int d2 = rgen.nextInt(1, 6);
		println("Rolling dice: " + d1 + " + " + d2 + " = " + (d1 + d2));
		return d1 + d2;
	}
	
	// Create an instance variable for the random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();

}
