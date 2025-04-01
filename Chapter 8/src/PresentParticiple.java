/*
 * File: PresentParticiple.java
 * ----------------------------
 * This program takes an English verb and forms the present
 * participle by applying the following rules:
 * - If the word ends in an e preceded by a consonant, take the e
 * away before adding the ing suffix. If the e is not preceded by
 * a consonant, it should remain in place
 * - If the word ends in a consonant preceded by a vowel, insert
 * an extra copy of the consonant before adding the ing suffix.
 * If, however, there is more than one consonant at the end of the
 * word, no such doubling takes place.
 */

import acm.program.*;

public class PresentParticiple extends ConsoleProgram {
	
	public void run() {
		println("This program takes a verb and forms the present participle.");
		println("Indicate the end of the input with a blank line.");
		String word = readLine("Enter a word: ");
		while (!word.isEmpty()) {
			println(createPresentParticiple(word));
			word = readLine("Enter a word: ");
		}
	}
	
	private String createPresentParticiple(String word) {
		if (word.endsWith("e") && !isEnglishVowel(word.charAt(word.length() - 2))){
			return word.substring(0, word.length() - 1) + "ing";
		} else if (!isEnglishVowel(word.charAt(word.length() - 1)) && isEnglishVowel(word.charAt(word.length() - 2))) {
			return word + word.charAt(word.length() - 1) + "ing";
		} else {
			return word + "ing";
		}
	}
	
	private boolean isEnglishVowel(char ch) {
		switch (ch) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
			return true;
		default:
			return false;
		}
	}
}
