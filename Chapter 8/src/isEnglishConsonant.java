/*
 * File: isEnglishConsonant.java
 * -----------------------------
 * This program displays all the uppercase consonants.
 */

import acm.program.*;

public class isEnglishConsonant extends ConsoleProgram {
	
	public void run() {
		String word = readLine("Enter a word: ");
		String result = "";
		for (int i = 0; i < word.length(); i ++) {
			if (isEnglishConsonant(word.charAt(i))) {
				result += word.charAt(i);
			}
		}
		println(result.toUpperCase());
	}
	
	public boolean isEnglishConsonant(char ch) {
		switch (Character.toLowerCase(ch)) {
		case 'a': case 'e': case 'i': case 'u': case 'o':
			return false;
		default:
			return true;
		}
	}

}
