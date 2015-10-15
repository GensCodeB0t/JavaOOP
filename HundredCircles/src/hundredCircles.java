//******************************************************************************************
// Programming Projects 6.14
// HundredCircles.java
// Ryan Gens
// Create a method the generates 100 random circles, of random colors, in random locations.
//******************************************************************************************
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class hundredCircles extends JApplet {
    public void paint(Graphics page)
    {
    	super.paint(page);
    	
    	int radius, yPos, xPos, radiusLimit;;
    	Random randGen = new Random();
    	
    	for (int i = 0; i < 100; i++)
    	{
    		// Set limits for the radius to create circles that fit in the frame
    		if (this.getContentPane().getHeight() < this.getContentPane().getWidth())
    			radiusLimit = this.getContentPane().getHeight();
    		else
    			radiusLimit = this.getContentPane().getWidth();
    		
    		// Generate the radius and location of the circle
    		radius = randGen.nextInt(radiusLimit/3);	// The divisor is added to create space between the circles
    		yPos = randGen.nextInt(this.getContentPane().getHeight() - radius);
    		xPos = randGen.nextInt(this.getContentPane().getWidth() - radius);
    		
    		// Create the circle
    		page.setColor(new Color(randGen.nextInt(255),randGen.nextInt(255),randGen.nextInt(255)));
    		page.fillOval(xPos, yPos, radius, radius);
    	}
    }
}
