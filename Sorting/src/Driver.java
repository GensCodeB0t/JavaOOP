//******************************************************************************************
// Programming Projects 10.4 
// Driver.java
// Ryan Gens
// Modify the Sorting program from chapter 10 so the sorting functions sort in a descending
// order.
//******************************************************************************************
public class Driver {

	public static void main(String[] args) {
		
		// Create a list of friends based off of obscure 80's/90's
		// references.
		Contact[] friends = new Contact[8];
		
		friends[0] = new Contact("Mr.", "Miyagi", "555-666-6666");
		friends[1] = new Contact("Peter", "Parker", "555-333-3333");		
		friends[2] = new Contact("Bruce", "Wayne", "555-555-5555");
		friends[3] = new Contact("Johnny", "Lawrence", "555-888-8888");
		friends[4] = new Contact("Johnny", "Five", "555-999-9999");
		friends[5] = new Contact("Ghost", "Buster", "555-222-2222");
		friends[6] = new Contact("Bruce", "Banner", "555-444-4444");
		friends[7] = new Contact("Daniel", "Son", "555-777-7777");
		
		// Create a list of enemies based off of obscure 80's/90's
		// references.
		Contact[] enemies = new Contact[8];
		
		enemies[0] = new Contact("Green", "Goblin", "666-111-1111");
		enemies[1] = new Contact("Stripe", "Mogwai", "666-999-9999");		
		enemies[2] = new Contact("Stay-Puft", "MarshmallowMan", "666-555-5555");
		enemies[3] = new Contact("Fred", "Krueger", "111-111-9999");
		enemies[4] = new Contact("Doctor", "Octopus", "333-111-2222");
		enemies[5] = new Contact("Saki", "Shredder", "666-444-1111");
		enemies[6] = new Contact("The", "Noid", "444-333-2222");
		enemies[7] = new Contact("Cobra", "Commander", "666-777-2222");
		
		// Sort the lists using both sort methods
		Sorting.insertionSort(friends);
		Sorting.selectionSort(enemies);
		
		// Print the results of the insertion sort
		System.out.println("Your friends are:");
		for(Contact friend : friends){
			System.out.println(friend);
		}
		
		// Print the results of the selection sort
		System.out.println("\nYour enemies are:");
		for(Contact enemie : enemies){
			System.out.println(enemie);
		}	
	}
}
