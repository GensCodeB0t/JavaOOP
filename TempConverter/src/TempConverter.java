//******************************************************************************************
// Programming Projects 2.5 
// TempConverter.java
// Ryan Gens
// Converts a Fahrenheit temperature to a Celsius temperature.
//******************************************************************************************
import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0/5.0;
		
		float fahrenheitTemp = 0;
		double celsiusTemp;
		
		Scanner scan = new Scanner(System.in);
		
		// Prompt the user for a Fahrenheit temperature.
		System.out.println("Please Enter the Fahrenheit tempature you would like to convert to Celsius.\n");
		fahrenheitTemp = scan.nextFloat();
		
		// Convert the Fahrenheit temperature to Celsius and display it on the screen.
		celsiusTemp = (fahrenheitTemp - BASE)/CONVERSION_FACTOR;
		System.out.println("The Fahrenheit tempature you entered = " + fahrenheitTemp);		
		System.out.println("The converted Celsius tempature = " + celsiusTemp);
	}
}
