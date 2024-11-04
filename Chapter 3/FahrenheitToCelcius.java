import acm.program.*;

public class FahrenheitToCelcius extends ConsoleProgram {
	
	public void run() {
		println("This program converts Fahrenheit to Celcius.");
		double Celcius = 5.0/9 * (readDouble("Enter Fahrenheit temperature: ") - 32);
		println("Celcius equivalent = " + Celcius);
	}

}
