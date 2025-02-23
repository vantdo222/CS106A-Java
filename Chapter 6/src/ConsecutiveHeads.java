/*
 * File: ConsecutiveHeads.java
 * ---------------------------
 * This program simulates flipping a coin repeatedly and 
 * continues until three consecutive heads are tossed.
 */

import acm.program.*;
import acm.util.*;

public class ConsecutiveHeads extends ConsoleProgram {
	
	public void run() {
		int times = 0;
		int match = 0;
		while (match != 3) {
			times += 1;
			String coin  = flipCoin();
			println(coin);
			if (coin.equals("Heads")) {
				match += 1;
			} else {
				match = 0;
			}
		}
		println("It took " + times + " flips to get 3 consecutive heads.");
	}
	
	// Create an instance variable for the random number generator
	private RandomGenerator rgen = RandomGenerator.getInstance();

	// Flip a coin and return its result
	private String flipCoin() {
		int coin = rgen.nextInt(1, 2);
		switch (coin) {
			case 1:
				return "Tails";
			case 2:
				return "Heads";
			default:
				return "";
		}
	}
}
