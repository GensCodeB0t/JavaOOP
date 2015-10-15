//******************************************************************************************
// Programming Projects 13.1 
// DVD.java
// Ryan Gens
// Write a program consistent with the example in chapter 8 that maintains a DVD collection
// making use of a Linked List to store DVD objects.
//******************************************************************************************
import java.text.NumberFormat;

public class DVD {
	private String title, director;
	private int year;
	private double cost;
	private boolean blueray;
	
	public DVD(String title, String director, int year,double cost, boolean blueray){
		this.title = title;
		this.director = director;
		this.year = year;
		this.cost = cost;
		this.blueray = blueray;
	}
	public String getTitle(){
		return title;
	}
	
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String description;
		
		description ="Cost- " + fmt.format(cost) + "\t" +"Year- " + year + "\t";
		description += "Title- " + title + "\t" +"Director- " + director;
		if(blueray)
			description += "\t" + "Blue-ray";
		
		return description;
	}

}
