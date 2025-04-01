/*
 * File: CaesarCipher.java
 * -----------------
 * This program encodes a message using a Caesar cipher.
 */

import acm.program.*;
import java.util.*;

public class CaesarCipher extends ConsoleProgram {
	
	public void run() {
		println("This program encodes a message using a Caesar cipher");
		int shift = readInt("Enter the number of character positions to shift: ");
		String message = readLine("Enter a message: ");
		println("Encoded message: " + encodeCaesarCipher(message, shift));
	}
	
	private String encodeCaesarCipher(String str, int key) {
		String result = "";
		for (int i = 0; i < str.length(); i ++) {
			char ch = str.charAt(i);
			result += encryptChar(ch, key);
		}
		return result;
	}
	
	private char encryptChar(char ch, int key) {
		if (Character.isUpperCase(ch)) { 
			return (char) ('A' + ((ch - 'A' + key) % 26));
		} else if (Character.isLowerCase(ch)) {
			return (char) ('a' + ((ch - 'a' + key) % 26));
		}
		return ch;
	}
}
