/*
 * File: PigLatin2.java
 * --------------------
 * This program translates a line into Pig Latin
 */

import acm.program.*;

public class PigLatin2 extends ConsoleProgram{
	
	private static final String DELIMITERS = " !@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\";
	
	public void run() {
		println("This program translates a line into Pig Latin.");
		String line = readLine("Enter a line: ");
		println(translateLine(line));
		
	}
	
	private String translateLine(String line) {
		String result = "";
		String word = "";
		for (int i = 0; i < line.length(); i ++) {
			word += line.charAt(i);
			if (isDelimiters(line.charAt(i))) {
				result = result + translateWord(word.substring(0, word.length() - 1)) + line.charAt(i);
				word = "";
			}
		}
		return result;
	}
	
	private String translateWord(String word) {
		String result = "";
		int vp = findFirstVowel(word);
		if (vp == -1) {
			return word;
		} else if (vp == 0){
			return word + "way";
		} else {
			String head = word.substring(0, vp);
			String tail = word.substring(vp);
			return tail + head + "ay";
		}
	}
	
	private int findFirstVowel(String word) {
		for (int i = 0; i < word.length(); i ++) {
			if (isEnglishVowel(word.charAt(i))) return i;
		}
		return -1;
	}
	
	private boolean isEnglishVowel (char ch) {
		switch (Character.toLowerCase(ch)) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
			return true;
		default:
			return false;
		}
	}
	
	private boolean isDelimiters(char ch) {
		return DELIMITERS.indexOf(ch) != -1;
	}

}
