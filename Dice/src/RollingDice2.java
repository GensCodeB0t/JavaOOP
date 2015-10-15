//******************************************************************************************
// Programming Projects 4.9 
// RollingDice2.java
// Ryan Gens
// Generates the results of rolling 2 die.
//******************************************************************************************
import java.util.Scanner;
public class RollingDice2 {

	public static void main(String[] args) {
		PairOfDice dice = new PairOfDice();
		Scanner scan = new Scanner(System.in);
		int option = 0;
		
		do{
			// Display option menu
			System.out.println("Enter 1 to roll the dice.\n"
					+ "Enter 2 to enter a value for dice 1.\n"
					+ "Enter 3 to enter a value for dice 2.\n"
					+ "Enter 4 to get the value of dice 1.\n"
					+ "Enter 5 to get the value of dice 2.\n"
					+ "Enter 6 to get the sum of the dice.\n"
					+ "Enter 7 to exit.\n");
		
			option = scan.nextInt();
			scan.nextLine();
			switch (option)
			{
			case 1:
				dice.rollDice();
				break;
			case 2:
				System.out.println("Enter the value of die 1.");
				dice.setDie1Value(scan.nextInt());
				break;
			case 3:
				System.out.println("Enter the value of die 2.");
				dice.setDie2Value(scan.nextInt());
				break;
			case 4:
				System.out.println("The value of die 1 = " + dice.getDie1Value()
						+ "\nPlease press enter.\n");
				scan.nextLine();
				break;
			case 5:
				System.out.println("The value of die 1 = " + dice.getDie2Value()
						+ "\nPlease press enter.\n");
				scan.nextLine();
				break;
			case 6:
				System.out.println("The value of die sum = " + dice.getSum()
						+ "\nPlease press enter.\n");
				scan.nextLine();
				break;
			}
		}while (option != 7);
		System.out.println("Done!");
	}

}
