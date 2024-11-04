import acm.program.*;

public class KilogramToPoundsAndOunces extends ConsoleProgram {
	
	public void run() {
		println("This program converts Kilograms to Pounds and Ounces");
		double kilogram = readDouble("Enter Kilogram weight: ");
		double pounds = kilogram * 2.2;
		double ounces = pounds * 16;
		println(kilogram + " kilogram = " + pounds + " pounds");
		println(kilogram + " kilogram = " + ounces + " ounces");
	}

}
