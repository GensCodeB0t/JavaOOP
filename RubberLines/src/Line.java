import java.awt.Point;


//******************************************************************************************
//Programming Projects 8.19 
//RubberLines.java
//Ryan Gens
//Draws a line in a Panel based off of user mouse actions. The program stores all
//previously created lines.
//*****************************************************************************************
public class Line {
	private Point point1, point2;
	
	//*************************************************************
	// Constructor: Sets the initial point values to 0.
	//*************************************************************
	public Line(){
		point1 = null;
		point2 = null;
	}
	
	//*************************************************************
	// Overloaded Constructor: Sets the initial point values to
	// passed values.
	//*************************************************************
	public Line (Point pt1, Point pt2){
		setPoint1(pt1);
		setPoint2(pt2);
	}
	
	//*************************************************************
	// Getters and Setters
	//*************************************************************
	public void setPoint1(Point point){
		point1 = point;
	}
	public void setPoint2(Point point){
		point2 = point;
	}
	public Point getPoint1(){
		return point1;
	}
	public Point getPoint2(){
		return point2;
	}
}

