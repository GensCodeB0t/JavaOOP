//******************************************************************************************
// Programming Projects 12.2 
// RecursiveExponent.java
// Ryan Gens
// Write a recursive algorithm that performs an exponential equation.  
//******************************************************************************************
import java.util.Scanner;

public class RecursiveExponent{

	public static void main(String[] args) {
		boolean tryAgain;
		int base, exponent;
		Scanner scan = new Scanner(System.in);
		
		do{
			tryAgain = false;
			// Prompt the user for the base number
			System.out.println("Please enter the base number.");
			base = scan.nextInt();
			
			// Prompt the user for the exponent value
			System.out.println("Please enter the exponent number.");
			exponent = scan.nextInt();
			
			// Test for usable exponent, perform the exponential equation, and print the results
				if (exponent <= 0){
					System.out.println("The exponent you have entered is out of range.\n"
							+ "Please try again.");
					tryAgain = true;
				}
				else {
					System.out.println("The result of " + base + " to the " + exponent + " power = ");
					System.out.println(RecursiveMath.toThePowerOf(base, exponent));
				}
		}while (tryAgain == true);
	}
}
