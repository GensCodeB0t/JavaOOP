//******************************************************************************************
// Programming Projects 7.2 
// Student.java
// Ryan Gens
// Creates a Student and Address Object that is driven by a class that demonstrates the use
// of member functions and constructors.
//******************************************************************************************
public class StudentBody {

	public static void main(String[] args) {
		Address school = new Address ("800 Landcaster Ave.", "Villanova", "PA", 19085);
		
		// Create the Student Object For John.
		Address jHome = new Address ("21 Jump Street", "Blacksburg", "VA", 24551);
		Student john = new Student ("John", "Smith", jHome, school);
		
		// Create the Student Object For Marsha.
		Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
		Student marsha = new Student("Marsha", "Jones", mHome, school);
		
		// Create the Student Object For David.
		Address dHome = new Address ("456 Division Street", "Sheboygan", "WI", 53081);
		Student david = new Student("David", "Jackso", dHome, school, 92, 100, 82);
		
		// Print the results of the constructors.
		System.out.println(john);
		System.out.println();
		System.out.println(marsha);
		System.out.println();
		System.out.println(david);
		System.out.println();

		// Change John's scores and print the results.
		john.setTestScore(1, 99);
		john.setTestScore(2, 80);
		john.setTestScore(3, 75);
		System.out.println("The score of John's 1st test = " + john.getTestScore(1));
		System.out.println("The score of John's 2nd test = " + john.getTestScore(2));
		System.out.println("The score of John's 3rd test = " + john.getTestScore(3));
		System.out.println("The Average of John's test scores = " + john.average() + "\n");
		
		// Change Marsha's scores and print the results.
		marsha.setTestScore(1, 92);
		marsha.setTestScore(2, 86);
		marsha.setTestScore(3, 71);
		System.out.println("The score of Marsha's 1st test = " + marsha.getTestScore(1));
		System.out.println("The score of Marsha's 2nd test = " + marsha.getTestScore(2));
		System.out.println("The score of Marsha's 3rd test = " + marsha.getTestScore(3));
		System.out.println("The Average of Marsha's test scores = " + marsha.average() + "\n");
		
		// Change David's scores and print the results.
		david.setTestScore(1, 100);
		david.setTestScore(2, 100);
		david.setTestScore(3, 100);
		System.out.println("The score of David's 1st test = " + david.getTestScore(1));
		System.out.println("The score of David's 2nd test = " + david.getTestScore(2));
		System.out.println("The score of David's 3rd test = " + david.getTestScore(3));
		System.out.println("The Average of David's test scores = " + david.average() + "\n");
	}

}
