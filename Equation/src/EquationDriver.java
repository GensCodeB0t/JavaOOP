//******************************************************************************************
// Programming Projects 10.9 
// Driver.java
// Ryan Gens
// Complete Programming Projects 10.9 using the classes from blackboard.
//******************************************************************************************
import javax.swing.*;
import java.awt.*;

import java.awt.*;

public class EquationDriver{
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Equation");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new EquationViewportPanel());
		frame.getContentPane().add(new EquationGraphPanel());
		
		frame.pack();
		frame.setVisible(true);		
	}

}
