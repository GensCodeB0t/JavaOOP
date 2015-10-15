//******************************************************************************************
// Programming Projects 9.1 
// coinDriver.java
// Ryan Gens
// Creates coin objects, assigns the coins a monetary value based off of a user input,
// and flips the coins using the Coin class flip() method.
//******************************************************************************************
import java.util.ArrayList;
import java.util.Scanner;

public class CoinDriver {

	public static void main(String[] args) {
		int userIn = 0, totValue = 0;
		ArrayList<MonetaryCoin> coins = new ArrayList<MonetaryCoin>();
		Scanner scan = new Scanner(System.in);
		
		// Create, collect the monetary value, and flip the coins.
		do{
			System.out.println("Please enter a value for the coin, or 0 to calculate the total value and flip the coin.\n");
			userIn = scan.nextInt();
			if (userIn != 0){
				MonetaryCoin monCoin = new MonetaryCoin(userIn);
				monCoin.flip();
				coins.add(monCoin);
			}	
		}while(userIn != 0);
		scan.close();
		
		// Add the monetary values and print out the face and monetary value of the coins.
		for (MonetaryCoin monCoins : coins){
			totValue += monCoins.getCoinValue();
			System.out.println("The face value = " + monCoins.toString());
		}
		System.out.println("The total monetary value of the coins = " + totValue + "\n");	
	}

}
