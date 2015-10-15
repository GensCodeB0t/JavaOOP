//******************************************************************************************
// Programming Projects 3.10 
// NameFrame.java
// Ryan Gens
// Create a frame that contains 2 labels, one to display your first name
// the other to display your last name.
//******************************************************************************************
import javax.swing.*;
import java.awt.Color;

public class NameFrame {

	public static void main(String[] args) {
		// Create Frame
		JFrame nFrame = new JFrame("NameFrame");
		nFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Create Panel
		JPanel nPanel = new JPanel();
		nPanel.setBackground(Color.green);
		// Create Labels
		JLabel fName = new JLabel("Ryan");
		JLabel lName = new JLabel("Gens");
		
		// Add Labels to Panel
		nPanel.add(fName);
		nPanel.add(lName);
		
		// Add Panel to JFrame, 
		nFrame.getContentPane().add(nPanel);
		
		// Pack and set Frame to visible
		nFrame.pack();
		nFrame.setVisible(true);

	}
}
