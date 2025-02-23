/*
 * File: OctalMathQuiz.java
 * ------------------------
 * This program poses a series of simple arithmetic problems
 * in base 8 for a student to answer.
 */

import acm.program.*;
import acm.util.*;

public class OctalMathQuiz extends ConsoleProgram {
	
	// Private variables
	private static final int QUESTIONS = 5;
	
	public void run() {
		println("Welcome to the octal Math Quiz");
		for (int i = 1; i <= QUESTIONS; i ++) {
			int attempts = 3;
			int x1 = getNumber(0, 21);
			
			if(getType() == 1) {
				int x2 = getNumber(0, 21 - x1);
				int correct = Integer.parseInt(Integer.toString(x1), 8) + Integer.parseInt(Integer.toString(x2), 8);
				int answer = Integer.parseInt(readLine("What is " + x1 + " + " + x2 + "? "), 8);
				while (attempts > 0) {
					if (answer != correct) {
						answer = Integer.parseInt(readLine("That's incorrect - Try a different answer: "), 8);
						attempts -= 1;
					} else {
						println("That's the answer!");
						break;
					}
					if (attempts == 0) {
						println("No, the answer is " + correct);
					}
				}
			} else {
				int x2 = getNumber(0, x1);
				int correct = Integer.parseInt(Integer.toString(x1), 8) - Integer.parseInt(Integer.toString(x2), 8);
				int answer = Integer.parseInt(readLine("What is " + x1 + " - " + x2 + "? "), 8);
				while (attempts > 0) {
					if (answer != correct) {
						answer = Integer.parseInt(readLine("That's incorrect - Try a different answer: "), 8);
						attempts -= 1;
					} else {
						println("That's the answer!");
						break;
					}
					if (attempts == 0) {
						println("No, the answer is " + correct);
					}
				}
			}
		}
	}
	
	// Create an instance variable for the random number generator
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	// Get a random number
	private int getNumber(int min, int max) {
		return (rgen.nextInt(min, max));
	}
	
	// Choose a type of problem
	private int getType() {
		return (rgen.nextInt(1, 2)); // 1: Addition, 2: Subtraction
	}

}
