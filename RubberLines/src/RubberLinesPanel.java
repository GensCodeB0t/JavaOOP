//******************************************************************************************
// Programming Projects 8.19 
// RubberLines.java
// Ryan Gens
// Draws a line in a Panel based off of user mouse actions. The program stores all
// previously created lines.
//*****************************************************************************************
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class RubberLinesPanel extends JPanel {
	private Point point1 = null, point2 = null;
	private ArrayList<Line> lineList = new ArrayList<Line>();
	
	public RubberLinesPanel(){
		LineListener listener = new LineListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(400,200));
	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		
		page.setColor(Color.yellow);
		
		// Draw the previously drawn lines.
		for (Line line : lineList )
			if (line.getPoint1() != null && line.getPoint2() != null)
				page.drawLine(line.getPoint1().x, line.getPoint1().y,
					line.getPoint2().x, line.getPoint2().y);
		
		// Draw the current line as a reference.
		if (point1 != null && point2 != null)
			page.drawLine(point1.x,point1.y, point2.x,point2.y);
	}
	
	private class LineListener implements MouseListener, MouseMotionListener {
		// If the mouse has been pressed, store the point in point1.
		public void mousePressed(MouseEvent event){
			point1 = event.getPoint();
		}
		
		// If the mouse has been dragged, store its resting point in point2 and
		// repaint the panel.
		public void mouseDragged(MouseEvent event){
			point2 = event.getPoint();
			repaint();
		}
		public void mouseClicked(MouseEvent event){}
		
		// When the mouse is released, create a line object and store
		// it in the lineList arraylist.
		public void mouseReleased(MouseEvent event){
			Line line = new Line(point1, point2);
			lineList.add(line);
			point1 = null;
			point2 = null;
		}		
		public void mouseEntered(MouseEvent event){}
		public void mouseExited(MouseEvent event){}
		public void mouseMoved(MouseEvent event){}
	}
}
