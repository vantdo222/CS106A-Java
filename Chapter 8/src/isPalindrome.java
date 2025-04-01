/*
 * File: isPalindrome.java
 * -----------------------
 * This program determines whether a word is a palindrome, that
 * is, a word that reads identically backward and forward. 
 */

import acm.program.*;

public class isPalindrome extends ConsoleProgram {
	
	public void run() {
		println("This program returns whether a word is a palindrome.");
		String word = readLine("Enter a word: ");
		if (isPalindrome(word)) {
			println(word + " is a palindrome.");
		} else {
			println(word + " is not a palindrome.");
		}
	}
	
	private boolean isPalindrome(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i --) {
			reverse += str.charAt(i);
		}
		return str.equals(reverse);
	}

}
