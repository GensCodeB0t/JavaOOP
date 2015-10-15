//******************************************************************************************
// Programming Projects 9.9 
// Rebound.java
// Ryan Gens
// Modify the Rebound program from chapter 9 so the animation stops and starts on a mouse
// click action.
//******************************************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rebound {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Rebound");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new ReboundPanel());
		frame.pack();
		frame.setVisible(true);
	}

}
