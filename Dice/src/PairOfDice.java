//******************************************************************************************
// Programming Projects 4.9 
// PairOfDice.java
// Ryan Gens
// Generates the results of rolling 2 die.
//******************************************************************************************
public class PairOfDice{
	private Die die1 = new Die();
	private Die die2 = new Die();
	

	public void setDie1Value(int value)
	{
		die1.setFaceValue(value);
	}
	
	public void setDie2Value(int value)
	{
		die2.setFaceValue(value);
	}
	
	public int getDie1Value()
	{
		return die1.getFaceValue();
	}
	
	public int getDie2Value()
	{
		return die2.getFaceValue();
	}
	
	public void rollDice()
	{
		die1.roll();
		die2.roll();
	}
	
	public int getSum()
	{
		return (die1.getFaceValue() + die2.getFaceValue());
	}
}
