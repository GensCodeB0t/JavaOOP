//******************************************************************************************
// Programming Projects 4.9 
// rndm.java
// Ryan Gens
// Create a method the generates a random color object.
//******************************************************************************************
import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class rndmColor {

	public static void main(String[] args) {
		int colorArray[]={0,0,0};
		
		// Create the frame, panel, and label
		JFrame colorFrame = new JFrame("Color Frame");
		colorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel colorPanel = new JPanel();
		JLabel colorLabel = new JLabel();
		
		// Call the randomColor method
		randomColor(colorArray);
		
		// Add text to the label
		colorLabel.setText("<html>The red color generated = " + colorArray[0] + 
				"<br>The green color generated = "+ colorArray[1] + 
				"<br>The blue color generated = "+ colorArray[2] + "</html>");
		
		// Apply the random color to the background of the panel and
		// add the label to the panel, and the panel to the frame. 
		colorPanel.setBackground(new Color(colorArray[0], colorArray[1], colorArray[2]));
		colorPanel.add(colorLabel);
		colorFrame.add(colorPanel);
		colorFrame.pack();
		colorFrame.setVisible(true);
	}

	public static void randomColor(int[] colorArray) {
		Random randomNum = new Random();
		// Generate the red color.
		colorArray[0] = randomNum.nextInt(255);
		// Generate the green color.
		colorArray[1] = randomNum.nextInt(255);
		// Generate the blue color.
		colorArray[2] = randomNum.nextInt(255);
	}

}

