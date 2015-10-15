//******************************************************************************************
// Programming Projects 11.1 
// ExceptionDriver.java
// Ryan Gens
// Create an exception class the is thrown when a user input string exceeds a maximum 
// length. Allow the program to terminate when the exception is thrown.
//******************************************************************************************
import java.util.Scanner;

public class exceptionDriver {

	public static void main(String[] args) throws StringTooLongException {
		final int maxStringLen = 20;
		String inputString;
		Scanner scan = new Scanner(System.in);
		StringTooLongException stringExecpt = 
				new StringTooLongException("The number you have entered exceeds "
						+ "the maxium length.");
		
		do{
			// Prompt the user for a sting input
			System.out.println("Please enter a string.\n");
			inputString= scan.next();
			
			// Test the input and throw an exception if it is greater than
			// the maximu size allowed
			if(inputString.length()> maxStringLen)
				throw stringExecpt;
		}while (!inputString.toUpperCase().equals("DONE"));
		
		System.out.println("The program is finished.");
	}
}
