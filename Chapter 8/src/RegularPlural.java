/*
 * File: RegularPlural.java
 * ------------------------
 * This program creates the plural of a word formed by following 
 * standard English rules:
 * - If the word ends in s, x, z, ch, or sh, add es to the word
 * - If the word ends in y and the y is preceded by a connsonant,
 * change the y to ies.
 * - In all other cases, add just an s.
 */

import acm.program.*;

public class RegularPlural extends ConsoleProgram {
	
	public void run() {
		println("This program creates the plural of a word.");
		println("Indicate the end of the input with a blank line");
		String word = readLine("Enter a word: ");
		while (!word.isEmpty()) {
			println(createRegularPlural(word));
			word = readLine("Enter a word: ");
		}
	}

	private String createRegularPlural(String word) {
		if (word.endsWith("s") || word.endsWith("x") || word.endsWith("z") || word.endsWith("ch") || word.endsWith("sh")) {
			return word + "es";
		} else if (word.endsWith("y") && isEnglishConsonant(word.charAt(word.length() - 2))) {
			return word.substring(0, word.length() - 1) + "ies";
		} else {
			return word + "s";
		}
	}
	
	private boolean isEnglishConsonant(char ch) {
		switch (ch) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
			return false;
		default:
			return true;
		}
	}
}
