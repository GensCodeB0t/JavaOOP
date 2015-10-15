//******************************************************************************************
// Programming Projects 4.14 
// FahrenheitPanel.java
// Ryan Gens
// Converts the user input fahrenheit temperature into celsius temperature
//******************************************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FahrenheitPanel extends JPanel{
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton convertBtn;

	public FahrenheitPanel() {
		inputLabel = new JLabel("Enter Fahrenheit tempature:");
		outputLabel = new JLabel("Tempature in Celsius: ");
		resultLabel = new JLabel("---");
		
		convertBtn = new JButton("Convert");
		convertBtn.addActionListener(new TempListener());
		
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener (new TempListener());
		
		add(inputLabel);
		add(fahrenheit);
		add(convertBtn);
		add(outputLabel);
		add(resultLabel);
		
		setPreferredSize(new Dimension(350,75));
		setBackground(Color.yellow);
	}
	
	//**********************************************************************
	// Represents an action listener for the temperature input field
	//**********************************************************************
	private class TempListener implements ActionListener{
		//******************************************************************
		// Perform the conversion when the enter key is pressed in the text
		// field or the convert button is clicked.
		//******************************************************************
		public void actionPerformed(ActionEvent event){
			int fahrenheitTemp, celsiusTemp;
			
			String text = fahrenheit.getText();
			
			fahrenheitTemp = Integer.parseInt(text);
			celsiusTemp = (fahrenheitTemp -32) * 5/9;
			
			resultLabel.setText(Integer.toString(celsiusTemp));
		}
	}

}
