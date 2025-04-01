/*
 * File: NumberToWords.java
 * ------------------------
 * This program convers numbers to words.
 */

import acm.program.*;

public class NumberToWords extends ConsoleProgram {
	
	public void run() {
		println("This program convers numbers to words.");
		int num = readInt("Enter a number: ");
		while (num > -1) {
			println(numberToWords(num));
			num = readInt("Enter a number: ");
		}
	}
	
	private String numberToWords(int n) {
		String num = Integer.toString(n);
		String result = "";
		if (num.length() > 3) {
			int first = n / 1000;
			int last = n % 1000;
			return hundredthDigit(first) + "thousand " + hundredthDigit(last);
		}
		return hundredthDigit(n);
	}
	
	private String unitDigit(int n) {
		switch (n) {
		case 0:
			return "zero ";
		case 1:
			return "one ";
		case 2:
			return "two ";
		case 3:
			return "three ";
		case 4:
			return "four ";
		case 5:
			return "five ";
		case 6:
			return "six ";
		case 7:
			return "seven ";
		case 8:
			return "eight ";
		default:
			return "nine ";
		}
	}
	
	private String tenthDigit(int n) {
		if (n < 20) {
			switch(n) {
			default:
				return "eleven ";
			case 10:
				return "ten ";
			case 12:
				return "twelve ";
			case 13:
				return "thirteen ";
			case 14:
				return "fourteen ";
			case 15:
				return "fifteen ";
			case 16:
				return "sixteen ";
			case 17:
				return "seventeen ";
			case 18:
				return "eighteen ";
			case 19:
				return "nineteen ";
			}
		} else if (n == 0) {
			return "";
		}else {
			switch (n / 10) {
			case 2:
				return "twenty" + (n % 10 > 0? "-" + unitDigit(n % 10) : "");
			case 3:
				return "thirty" + (n % 10 > 0? "-" + unitDigit(n % 10) : "");
			case 4:
				return "fourty" + (n % 10 > 0? "-" + unitDigit(n % 10) : "");
			case 5:
				return "fifty" + (n % 10 > 0? "-" + unitDigit(n % 10) : "");
			case 6:
				return "sixty" + (n % 10 > 0? "-" + unitDigit(n % 10) : "");
			case 7:
				return "seventy" + (n % 10 > 0? "-" + unitDigit(n % 10) : "");
			case 8:
				return "eighty" + (n % 10 > 0? "-" + unitDigit(n % 10) : "");
			default:
				return "ninety" + (n % 10 > 0? "-" + unitDigit(n % 10) : "");
			}
		}
		
	}
	
	private String hundredthDigit(int n) {
		if (n == 0) {
			return "";
		} else if (n % 100 == 0) {
			return unitDigit(n / 100) + "hundred ";
		}
		return (n / 100 == 0? "" : unitDigit(n / 100) + "hundred ") + (n % 100 < 10? unitDigit(n % 100) : tenthDigit(n % 100));
	}
}
