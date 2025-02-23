/*
 * File: RandomCard.java
 * ---------------------
 * This program displays the name of a card randomly chosen
 * from a complete deck of 52 playing cards.
 */

import acm.program.*;
import acm.util.*;

public class RandomCard extends ConsoleProgram {
	
	public void run() {
		println("This program displays a randomly chosen card.");
		println(getRank() + " of " + getSuit());
	}

	// Create an instance variable for the random number generator
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	// Draw a card and return its rank
	private String getRank() {
		int rank = rgen.nextInt(1, 13);
		switch (rank) {
		case 1:
			return "Ace";
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		default:
			return Integer.toString(rank);
		}
	}
	
	//Draw a card and return its suit
	private String getSuit() {
		int suit = rgen.nextInt(1, 4);
		switch (suit) {
		case 1:
			return "Clubs";
		case 2:
			return "Diamonds";
		case 3:
			return "Hearts";
		case 4:
			return "Spades";
		default:
			return "";
		}
	}
}
