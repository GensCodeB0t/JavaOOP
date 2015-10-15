//******************************************************************************************
// Programming Projects 13.1 
// DVDDriver.java
// Ryan Gens
// Write a program consistent with the example in chapter 8 that maintains a DVD collection
// making use of a Linked List to store DVD objects.
//******************************************************************************************
import java.util.Scanner;

public class DVDDriver {

	public static void main(String[] args) {
		Scanner menuScan = new Scanner(System.in);
		String menuInput = null;
		DVDList dvdList = new DVDList();
		
		do{
			// Display A Menu 
			System.out.println("Please select one of the follow options:");
			System.out.println("A to add a DVD to the collection\n"
					+ "D to delete a DVD from the Collection\n"
					+ "P to print the detail of the collection\n"
					+ "Q to quit\n");
			menuInput = menuScan.next().toUpperCase();
			
			// Perform the user selected option
			switch(menuInput){
			case "A":
				createDVD(dvdList);
				break;
			case"D":
				deleteDVD(dvdList);
				break;
			case"P":
				dvdList.print();
				break;
			case"Q":
				break;
			default:
				System.out.println("You have entered and incorrect option.");	
			}
		}while (!menuInput.equals("Q"));

	}


	//********************************************************************
	// createDVD --  Prompt the user for DVD title, director, year the 
	// movie was created, the cost of the movie, and whether it is a blue-
	// ray. Once the information of the DVD have been collected, add it to
	// the dvdList.
	//********************************************************************
	private static void createDVD(DVDList dvdList){
		Scanner createScan = new Scanner(System.in);
		String title, director, BRInput;
		boolean blueray = false;
		double cost;
		int year;
		
		System.out.println("Please enter the name of the DVD you wish to add to the list.");
		title = createScan.nextLine();
		System.out.println("Please enter the director of the movie.");
		director = createScan.nextLine();
		do{
		System.out.println("Please enter the year the movie was made.");
		year = createScan.nextInt();
		}while (year<1900);
		System.out.println("Please enter the cost of this movie.");
		cost = createScan.nextDouble();
		
		do{
			System.out.println("Please enter 'Y' if this DVD is a Blue-ray"
					+"\nPlease enter 'N' if this DVD is a standard DVD.");
			BRInput = createScan.next().toUpperCase();
		}while(!BRInput.equals("Y")&&!BRInput.equals("N"));
		
		if(BRInput.equals("Y"))
			blueray =  true;
		
		DVD newDVD = new DVD(title,director,year,cost, blueray);
		dvdList.add(newDVD);
	}
	
	//********************************************************************
	// deleteDVD --  Prompt the user for DVD title to be deleted form the
	// dvdList.
	//********************************************************************
	private static void deleteDVD(DVDList dvdList){
		Scanner deleteScan = new Scanner(System.in);
			
		System.out.println("Please enter the title you would like to delete from the list.");
		dvdList.removeDVD(deleteScan.nextLine());	
	}
}
