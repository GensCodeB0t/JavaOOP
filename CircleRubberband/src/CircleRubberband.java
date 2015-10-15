//******************************************************************************************
// Programming Projects 8.22 
// CircleRubberBand.java
// Ryan Gens
// Draws a circle in a Panel based off of user mouse actions. 
//*****************************************************************************************
import javax.swing.JFrame;

public class CircleRubberband {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Circle Rubberband");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new CircleBandPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
