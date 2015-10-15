//******************************************************************************************
// Programming Projects 12.2 
// RecursiveMath.java
// Ryan Gens
// Write a recursive algorithm that performs an exponential equation.  
//******************************************************************************************
public class RecursiveMath {
	
	//****************************************************************
	// toThePowerOf-- a static class the calls the recursive method.
	// This class acts as a buffer to maintain encapsulation, by 
	// isolating the iteration member parameter from the user's 
	// ability to change its value during the toThePowerOf()
	// method call.
	//****************************************************************
	public static int toThePowerOf(int base, int exponent){		
		return expoEquation(base, exponent, 0);
	}

	//****************************************************************
	// expoEquation-- a recursive method that performs an exponential
	// equation from the user input base and exponent values.
	//****************************************************************
	private static int expoEquation(int base, int exponent, int iteration){
		if (exponent > 0 && iteration < exponent - 1){			
			base *= expoEquation(base, exponent, ++iteration);
		}
		else if (exponent <= 0){
			System.out.println();
			base = 0;
		}

		return base;
	}
}
