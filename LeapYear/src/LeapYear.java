//******************************************************************************************
// Programming Projects 5.1 
// LeapYear.java
// Ryan Gens
// Create a program that determines whether a user input year is a leap year.
//******************************************************************************************
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = 0;
		
		// Prompt the user for a year to test and store it 
		// in the year variable
		System.out.println("Please enter a year to test.");
		year = scan.nextInt();
		
		// Test the year entered
		if (year > 1582) 
		{
			if (year%4==0)
				System.out.println("The year you entered is a leap year.");
			else if (year%100 == 0)
				System.out.println("The year you entered is not a leap year.");
			else if (year%400 == 0)
				System.out.println("The year you entered is a leap year.");
			else
				System.out.println("The year you entered is not a leap year.");
		}
		else
			System.out.println("ERROR: The year you entered is not a year "
					+ "\nwithin the Greagorian calendar.");
	}

}
