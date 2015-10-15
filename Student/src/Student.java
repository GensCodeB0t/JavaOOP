//******************************************************************************************
// Programming Projects 7.2 
// Student.java
// Ryan Gens
// Creates a Student and Address Object that is driven by a class that demonstrates the use
// of member functions and constructors.
//******************************************************************************************
public class Student {

	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	int testScore1, testScore2, testScore3;
	
	public Student(String first, String last, Address home, Address school,
			int score1, int score2, int score3){
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		testScore1 = score1;
		testScore2 = score2;
		testScore3 = score3;
	}
	
	// Overridden constructor that initializes the values of testScore1, testScore2, 
	// and testScore3 to 0.
	public Student(String first, String last, Address home, Address school){
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		testScore1 = 0;
		testScore2 = 0;
		testScore3 = 0;
	}
	

	// Amended toString method to add the test scores and average test scores to the 
	// Student object.
	public String toString(){
		String result;
		
		result = firstName + " " + lastName + "\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress + "\n";
		result += "Test 1:\t" + testScore1 + "\n";
		result += "Test 2:\t" + testScore2 + "\n";
		result += "Test 3:\t" + testScore3 + "\n";
		result += "Average Test score:\t" + average() + "\n";
		
		return result;
	}

	// Setter for testScore1, testScore2, and testScore3.
	public void setTestScore(int testNum, int score){
		switch(testNum)
		{
		case 1:
			testScore1 = score;
			break;
		case 2:
			testScore2 = score;
			break;
		case 3:
			testScore3 = score;
			break;
		default:
			System.out.println("The number you entered is not a vaild test.\n");
		}
	}
	
	// Getter for testScore1, testScore2, and testScore3.
	public int getTestScore(int testNum){
		int score=0;
		
		switch(testNum)
		{
		case 1:
			score = testScore1;
			break;
		case 2:
			score = testScore2;
			break;
		case 3:
			score = testScore3;
			break;
		default:
			System.out.println("The number you entered is not a vaild test.\n");
		}

		return score;		
	}
	
	// Finds the average of the test scores.
	public int average (){
		return ((testScore1 + testScore2 + testScore3)/3);
	}

}
