/*
 * File: OldStandby.java
 * ---------------------
 * This program dipslays all 10 verse of the old standby
 * "This Old Man".
 */

import acm.program.*;
import java.util.ArrayList;

public class OldStandby extends ConsoleProgram {
	
	public void run() {
		String word = "thumb";
		for (int i = 1; i <= 10; i++) {
			switch (i) {
			case 1:
				word = "thumb";
				break;
			case 2:
				word = "shoe";
				break;
			case 3:
				word = "knee";
				break;
			case 4:
				word = "door";
				break;
			case 5:
				word = "hive";
				break;
			case 6:
				word = "sticks";
				break;
			case 7:
				word = "heaven";
				break;
			case 8:
				word = "pate";
				break;
			case 9:
				word = "spine";
				break;
			case 10:
				word = "shin";
				break;
			}
			print("This old man, he played " + i + ".\n"
					+ "He played knick-knack on my " + word + ".\n"
					+ "With a knick-knack, paddy-whack,\n"
					+ "Give your dog a bone.\n"
					+ "This old man came rolling home.\n");
		}
	}

}
