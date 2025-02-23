/*
 * File: MathQuiz2.java
 * -------------------
 * This program poses a series of simple arithmetic problems for
 * a student to answer. When the student responds correctly, it
 * randomly chooses among four or five different messages when.
 */

import acm.program.*;
import acm.util.*;

public class MathQuiz2 extends ConsoleProgram {
	
	// Private variables
	private static final int QUESTIONS = 5;
	
	public void run() {
		println("Welcome to Math Quiz");
		for (int i = 1; i <= QUESTIONS; i ++) {
			int attempts = 3;
			int x1 = getNumber(0, 20);
			
			if (getType() == 1) {
				int x2 = getNumber(0, 20 - x1);
				int answer = readInt("What is " + x1 + " + " + x2 + "? ");
				while (attempts > 0) {
					if (answer != x1 + x2) {
						answer = readInt("That's incorrect - Try a different answer: ");
						attempts -= 1;
					} else {
						Encourage();
						break;
					}
					if (attempts == 0) {
						println("No, the answer is " + (x1 + x2) + ".");
					}
				}
			} else {
				int x2 = getNumber(0, x1);
				int answer = readInt("What is " + x1 + " - " + x2 + "? ");
				while (attempts > 0) {
					if (answer != x1 - x2) {
						answer = readInt("That's incorrect - Try a different answer: ");
						attempts -= 1;
					} else {
						Encourage();
						break;
					}
					if (attempts == 0) {
						println("No, the answer is " + (x1 - x2) + ".");
					}
				}
			}
		}
	}
	
	// Create an instance variable for the random number generator
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	// Get a random number
	private int getNumber(int min, int max) {
		return(rgen.nextInt(min, max));
	}
	
	// Choose a type of problem
	private int getType() {
		return (rgen.nextInt(1, 2));    // 1: Addition, 2: Subtraction
	}
	
	// Choose an encouragement
	private void Encourage() {
		switch (rgen.nextInt(1, 5)) {
		case 1:
			println("Correct!");
			break;
		case 2:
			println("You got it!");
			break;
		case 3:
			println("That's the answer!");
			break;
		case 4:
			println("Good job!");
			break;
		default:
			println("Amazing!");
			break;
		}
	}
}
