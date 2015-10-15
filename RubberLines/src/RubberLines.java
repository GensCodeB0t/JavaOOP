//******************************************************************************************
// Programming Projects 8.19 
// RubberLines.java
// Ryan Gens
// Draws a line in a Panel based off of user mouse actions. The program stores all
// previously created lines.
//*****************************************************************************************
import javax.swing.JFrame;

public class RubberLines {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Rubber Lines");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new RubberLinesPanel());
		
		frame.pack();
		frame.setVisible(true);
	}

}
