//******************************************************************************************
// Programming Projects 4.14 
// Fahrenheit.java
// Ryan Gens
// Converts the user input fahrenheit temperature into celsius temperature
//******************************************************************************************
import javax.swing.JFrame;

public class Fahrenheit {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Farhenheit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FahrenheitPanel panel = new FahrenheitPanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
