/*
 * File: Obengloblish.java
 * -----------------------
 * This file takes a line of text and converts each word into
 * Obenglobish.
 * The rules for forming Pig Latin words are as follows:
 * - Add "ob" before every vowel in the English word except:
 * + Vowels that follow other vowels
 * + An "e" that occurs at the end of the word
 */

import acm.program.*;

public class Obengloblish extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String word = readLine("Enter a word: ");
			if (word.equals("")) break;
			println(word + " -> " + obenglobish(word));
		}
	}
	
	private String obenglobish(String word) {
		String result = "";
		for (int i = 1; i < word.length() - 1; i ++) {
			if (!isEnglishVowel(word.charAt(i)) || isEnglishVowel(word.charAt(i - 1))) {
				result += word.charAt(i);
			} else {
				result += "ob" + word.charAt(i);
			}
		}
		if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
			result = "ob" + word.charAt(0) + result;
		} else {
			result = word.charAt(0) + result;
		}
		return result + word.charAt(word.length() - 1);
	}
	
	private boolean isEnglishVowel (char ch) {
		switch (Character.toLowerCase(ch)) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
			return true;
		default:
			return false;
		}
	}

}
