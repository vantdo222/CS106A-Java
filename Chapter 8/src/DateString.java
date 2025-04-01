/*
 * File: DateString.java
 * ---------------------
 * This program returns a string consisting of the day of the
 * month, a hyphen, the first three letters in the name of the
 * month, another hyphen, and the last two digits of the year.
 */

import acm.program.*;

public class DateString extends ConsoleProgram {
	
	public void run() {
		String day = readLine("Enter date: ");
		int month = readInt("Enter month: ");
		String year = readLine("Enter year: ");
		
		println(createDateString(day, month, year));
	}
	
	private String createDateString(String day, int month, String year) {
		String result = "";
		result += day;
		
		switch (month) {
		case 1:
			result += "-Jan";
			break;
		case 2:
			result += "-Feb";
			break;
		case 3:
			result += "-Mar";
			break;
		case 4:
			result += "-Apr";
			break;
		case 5:
			result += "-May";
			break;
		case 6:
			result += "-Jun";
			break;
		case 7:
			result += "-Jul";
			break;
		case 8:
			result += "-Aug";
			break;
		case 9:
			result += "-Sep";
			break;
		case 10:
			result += "-Oct";
			break;
		case 11:
			result += "-Nov";
			break;
		case 12:
			result += "-Dec";
			break;
		}
		
		result = result + "-" + year.substring(2);
		
		return result;
	}

}
