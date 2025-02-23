/*
 * File: SlotMachine.java
 * ----------------------
 * This program simulates playing a slot machine. The player
 * started with an initial stake of $50 and then let the user
 * play until either the money runs out or the user decides
 * to quit
 */

import acm.program.*;
import acm.util.RandomGenerator;
import acm.util.*;

public class SlotMachine extends ConsoleProgram {
	
	public void run() {
		
		int stake = 3;
		
		// Ask if play wants instruction
		if (YesNo("Would you like instructions? ")) {
			println("Instructions: ");
			println("1. Put a silver dollar into a slot machine and"
					+ " pull the handle on its side");
			println("2. If you get one of a set of winning patterns"
					+ " printed on the front of the slot machine,"
					+ " you get back an amount of money corresponding"
					+ " to that combination.");
			println("If not, you're out of dollar");
		}
		println("You have " + stake);
		while (YesNo("Would you like to play? ") && stake > 0) {
			stake = stake - 1 + getResult();
			println("You have " + stake);
		}
		if (stake == 0) {
			println("You are out of money!");
		} else {
			println("End game. Thank you for playing!");
		}
	}
	
	// Generate instruction
	private boolean YesNo(String prompt) {
		String answer = readLine(prompt);
		while (!(answer.equals("yes")) && !(answer.equals("no"))) {
			println("Please answer yes or no");
			answer = readLine(prompt);
		}
		return (answer.equals("yes"));
	}

	// Create an instance variable for the random number generator
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	// Spin a wheel and get result
	private String Spin() {
		int n = rgen.nextInt(1, 6);
		switch (n) {
		case 1:
			return "CHERRY";
		case 2: 
			return "LEMON";
		case 3:
			return "ORANGE";
		case 4:
			return "PLUM";
		case 5:
			return "BELL";
		default:
			return "BAR";
		}
	}
	
	// Check result and return amount win
	private int getResult() {
		String s1 = Spin();
		String s2 = Spin();
		String s3 = Spin();
		int result = 0;
		
		if (s1.equals("CHERRY")) {
			if (s2.equals(s1)) {
				if (s3.equals(s1)) {
					result = 7;
				} else {
					result = 5;
				}
			} else {
				result = 2;
			}
		} else if (s1.equals("ORANGE") && s2.equals(s1) && (s3.equals(s1) || s3.equals("BAR"))) {
			result = 10;
		} else if (s1.equals("PLUM") && s2.equals(s1) && (s3.equals(s1) || s3.equals("BAR"))) {
			result = 14;
		} else if (s1.equals("BELL") && s2.equals(s1) && (s3.equals(s1) || s3.equals("BAR"))) {
			result = 20;
		} else if (s1.equals("BELL") && s2.equals(s1) && (s3.equals(s1) || s3.equals("BAR"))) {
			result = 250;
		} 
		
		if (result == 0) {
			println(s1 + "  " + s2 + "  " + s3 + " -- You lose");
		} else {
			println(s1 + "  " + s2 + "  " + s3 + " -- You win $" + result); 
		}
		
		return result;
	}
}
