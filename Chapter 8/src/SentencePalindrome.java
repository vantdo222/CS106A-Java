/*
 * File: SentencePalindrome.java
 * -----------------------------
 * This program checks for sentence palindromes.
 */

import acm.program.*;
import java.util.*;

public class SentencePalindrome extends ConsoleProgram {
	
	private static final String DELIMITERS = " !@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\"; 
	
	public void run() {
		println("This program checks for sentence palindromes.");
		println("Indicate the end of the input with a blank line.");
		String line = readLine("Enter a sentence: ");
		while (!line.isEmpty()) {
			if (isSentencePalindrome(line)) {
				println("That sentence is a palindrome.");
			} else {
				println("That sentence is not a palindrome.");
			}
			line = readLine("Enter a sentence: ");
		}
		
	}
	
	private boolean isSentencePalindrome(String str) {
		String line = "";
		String reverse = "";
		StringTokenizer tokenizer = new StringTokenizer(str, DELIMITERS);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			line += token.toLowerCase();
		}
		for (int i = line.length() - 1; i >= 0; i --) {
			reverse += line.charAt(i);
		}
		return line.equals(reverse);
	}

}
