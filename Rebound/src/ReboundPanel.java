//******************************************************************************************
// Programming Projects 9.9 
// ReboundPanel.java
// Ryan Gens
// Modify the Rebound program from chapter 9 so the animation stops and starts on a mouse
// click action.
//******************************************************************************************
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ReboundPanel extends JPanel {
	private final int WIDTH = 800, HEIGHT = 500;
	private final int DELAY = 20, IMAGE_SIZE = 220;
	
	private ImageIcon  image;
	private Timer timer;
	private int x, y, moveX, moveY;
	
	public ReboundPanel(){
		addMouseListener(new mouseListener());
		timer = new Timer(DELAY, new ReboundListener());
		image = new ImageIcon("C:\\Users\\Ryan\\Desktop\\happyFace.gif");
		
		x = 0;
		y = 40;
		moveX = moveY = 3;
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
		timer.start();
	}

	public void paintComponent(Graphics page){
		super.paintComponent(page);
		image.paintIcon(this, page, x, y);
	}
	private class ReboundListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			x += moveX;
			y += moveY;
			if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
				moveX = moveX * -1;
			
			if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
				moveY = moveY * -1;
			
			repaint();
		}
	}
	
	//*************************************************************
	// mouseListener: Starts and stops the animation on a mouse
	// click.
	//*************************************************************
	private class mouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent event){
			if (timer.isRunning())
				timer.stop();
			else
				timer.start();
		}
	}
}
