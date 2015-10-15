//******************************************************************************************
// Programming Projects 10.4 
// Contact.java
// Ryan Gens
// Modify the Sorting program from chapter 10 so the sorting functions sort in a descending
// order.
//******************************************************************************************
public class Contact implements Comparable{
	private String firstName, lastName, phone;
	
	public Contact(String first, String last, String telephone){
		firstName = first;
		lastName = last;
		phone = telephone;
	}
	public String toString(){
		return lastName + ", " + firstName + ", " + phone;
	}
	public boolean equals(Object other){
		return (lastName.equals(((Contact)other).getLastName()) && 
				firstName.equals(((Contact)other).getFirstName()));
	}
	public int compareTo(Object other){
		int result;
		String otherFirst = ((Contact)other).getFirstName();
		String otherLast = ((Contact)other).getLastName();
		
		if(lastName.equals(otherLast))
			result = firstName.compareTo(otherFirst);
		else
			result = lastName.compareTo(otherLast);
		return result;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
}
