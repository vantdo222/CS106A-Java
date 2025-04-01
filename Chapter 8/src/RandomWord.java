/*
 * File: RandomWord.java
 * ---------------------
 * This program displays five random words.
 */

import acm.program.*;
import acm.util.*;

public class RandomWord extends ConsoleProgram {
	
	private static final int MIN_LETTERS = 3;
	private static final int MAX_LETTERS = 10;
	
	public void run() {
		println("This is a list of five random words:");
		for (int i = 0; i < 5; i ++) {
			println(randomWord());
		}
	}
	
	private String randomWord() {
		String result = "";
		for (int i = 0; i < randomInt(); i++) {
			result += randomLetter();
		}
		return result;
	}

	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private char randomLetter() {
		return (char) rgen.nextInt((int) 'a', (int) 'z');
	}
	
	private int randomInt() {
		return (int) rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
	}
}
