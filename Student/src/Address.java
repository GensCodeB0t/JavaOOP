//******************************************************************************************
// Programming Projects 7.2 
// Student.java
// Ryan Gens
// Creates a Student and Address Object that is driven by a class that demonstrates the use
// of member functions and constructors.
//******************************************************************************************
public class Address {
	private String streetAddress, city, state;
	private long zipCode;
	
	public Address(String street, String town, String st, long zip){
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}
	
	public String toString(){
		String result;
		
		result = streetAddress + "\n";
		result += city + ", " + state + " " + zipCode;
		
		return result;
	}

}
