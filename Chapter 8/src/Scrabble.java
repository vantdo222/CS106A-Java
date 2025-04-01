/*
 * File: Scrabble.java
 * -------------------
 * This program reads in words and prints out their score in
 * Scrabble, not counting any of the other bonuses that occur in
 * the game. It ignores any characters other than uppercase
 * letters in computing the score. In particular, lowercase
 * letters are assumed to represent blank tiles, which can stand
 * for any letter but which have a score of 0.
 */

import acm.program.*;

public class Scrabble extends ConsoleProgram {
	
	public void run() {
		String word = readLine("Enter a word: " );
		int result = 0;
		for (int i = 0; i < word.length(); i ++) {
			if (Character.isUpperCase(word.charAt(i))) {
				result += toPoints(word.charAt(i));
			}
		}
		println(word + " worths " + result + " points.");
	}
	
	private int toPoints(char ch) {
		switch (ch){
		case 'A': case 'E':  case 'I': case 'L': case 'N': case 'O': case 'R': case 'S': case 'T': case 'U':
			return 1;
		case 'D': case 'G':
			return 2;
		case 'B': case 'C': case 'M': case 'P':
			return 3;
		case 'F': case 'H': case 'V': case 'W': case 'Y':
			return 4;
		case 'K':
			return 5;
		case 'J': case 'X':
			return 8;
		default:
			return 10;
		}
	}

}
