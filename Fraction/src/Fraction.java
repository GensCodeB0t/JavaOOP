//******************************************************************************************
// Programming Projects 2.13 
// Fraction.java
// Ryan Gens
// Converts a Fahrenheit temperature to a Celsius temperature.
//******************************************************************************************
import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		
		int numerator;
		int denominator;
		double decimalVal;
		
		// Prompt the user for the fraction.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the numerator value.\n");
		numerator = scan.nextInt();
		System.out.println("Please enter the denominator value.\n");
		denominator = scan.nextInt();
		
		// Convert the fraction to a decimal value and display it on the screen.
		decimalVal = (double) numerator / denominator;
		System.out.println("The decimal equivalent of the fraction you entered = " + decimalVal);
	}
}
