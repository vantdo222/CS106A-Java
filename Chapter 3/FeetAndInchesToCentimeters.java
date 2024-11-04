import acm.program.*;

public class FeetAndInchesToCentimeters extends ConsoleProgram{
	
	public void run() {
		println("This program converts feet and inches to centimeters.");
		int feet = readInt("Enter number of feet: ");
		int inches = readInt("Enter number of inches: ");
		println(feet + "ft " + inches + "in = " + ((feet * 30.48) + (inches * 2.54)) + "cm");
	}

}
