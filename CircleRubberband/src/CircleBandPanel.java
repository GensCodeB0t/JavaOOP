//******************************************************************************************
// Programming Projects 8.22 
// CircleBandPanel.java
// Ryan Gens
// Draws a circle in a Panel based off of user mouse actions. 
//*****************************************************************************************
import javax.swing.JPanel;
import java.lang.Math;
import java.awt.*;
import java.awt.event.*;

public class CircleBandPanel extends JPanel{
	public Point point1 = null, point2 = null;
	int radius = 0;
	
	public CircleBandPanel (){
	CircleListener listener = new CircleListener();
	addMouseListener(listener);
	addMouseMotionListener(listener);
	
	setBackground(Color.black);
	setPreferredSize(new Dimension(400,200));
}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		
		page.setColor(Color.yellow);
		
		// Draw a circle starting at the center. The circle is created by dragging the 
		// mouse. The mouse position should align with the radius as the circle is 
		// being drug. The following determines the adjustments needed to maintain 
		// the above listed design.
		if (point1 != null && radius > 0)
			if ((point1.x < point2.x)||(point1.y < point2.y))
				page.drawOval(point1.x - (radius), point1.y - radius, radius + (radius), radius + (radius)); 
			else if ((point1.x > point2.x)&& (point1.y < point2.y))
				page.drawOval(point2.x, point1.y - (radius/2), radius + (radius/2), radius + (radius/2));
			else if ((point1.x > point2.x)&& (point1.y > point2.y))
				page.drawOval(point1.x - (radius), point1.y - radius, radius + (radius), radius + (radius));
			else 
				page.drawOval(point1.x - (radius/2), point1.y - (radius/2), radius + (radius/2), radius + (radius/2)); 		
	}
	
	public class CircleListener implements MouseListener, MouseMotionListener{
		
		public void mousePressed (MouseEvent event){
			// If the mouse has been pressed, store the point in point1.
			point1 = event.getPoint();
		}
		public void mouseDragged (MouseEvent event){
			// If the mouse has been dragged, store its resting point in point2, 
			// find the radius value, and repaint the panel.
			point2 = event.getPoint();
			findRadius();
			repaint();
		}
		public void mouseClicked(MouseEvent event){}		
		public void mouseReleased(MouseEvent event){}		
		public void mouseEntered(MouseEvent event){}
		public void mouseExited(MouseEvent event){}
		public void mouseMoved(MouseEvent event){}
		
	}
	
	private void findRadius (){	
		// Find the radius by finding the larger difference between either the 
		// x point data or the y point data of point1 and point2.
		radius = (Math.abs(point1.x-point2.x) > Math.abs(point1.y - point2.y))
			? Math.abs(point1.x-point2.x) : Math.abs(point1.y-point2.y);	
	}

}
