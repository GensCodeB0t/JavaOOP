//******************************************************************************************
// Programming Projects 11.1 
// StringTooLongException.java
// Ryan Gens
// Create an exception class the is thrown when a user input string exceeds a maximum 
// length. Allow the program to terminate when the exception is thrown.
//******************************************************************************************
public class StringTooLongException extends Exception {

	StringTooLongException(String message){
		// Print the message passed from the StringTooLongException
		// object created in the main method.
		super(message);
	}
}
