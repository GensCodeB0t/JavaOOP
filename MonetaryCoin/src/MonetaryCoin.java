//******************************************************************************************
// Programming Projects 9.1 
// MonetaryCoin.java
// Ryan Gens
// Inherits the coin class to allow for flipping the coin, assigns a monetary value, and
// provides a getter and setter for the value of the coin.
//******************************************************************************************
public class MonetaryCoin extends Coin {
	private int value;
	
	//*************************************************************
	// Constructor: Sets the initial face and monetary values of 
	// the coin.
	//*************************************************************
	public MonetaryCoin(int coinValue){
		super();
		setCoinValue(coinValue);
	}
	//*************************************************************
	// Monetary value accessor.
	//*************************************************************
	public int getCoinValue(){
		return value;
	}
	//*************************************************************
	// Monetary value mutator.
	//*************************************************************
	public void setCoinValue(int coinValue){
		value = coinValue;
	}
}
