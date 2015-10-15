//******************************************************************************************
// Programming Projects 10.9 
// EquationGraphPanel.java
// Ryan Gens
// Complete Programming Projects 10.9 using the classes from blackboard.
//******************************************************************************************
//********************************************************************
//  EquationGraphPanel.java       Authors: Lewis/Loftus
//
//  Solution to Programming Project 10.9 
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.LineBorder;

public class EquationGraphPanel extends JPanel
{
   private JSlider aSlider;
   private JSlider bSlider;
   private JSlider cSlider;
   private EquationViewportPanel display;
   private JLabel equationLabel;

   private final String EQUATION_SUBSTRING = "Graph of equation y = ";

   private final int MIN_VALUE = -5;
   private final int MAX_VALUE = 5;
   private final int INIT_VALUE = 0;
   private final int TICK_SPACING = 5;
   private final int MINOR_TICK_SPACING = 1;

   //-----------------------------------------------------------------
   //  Sets up the panel.
   //-----------------------------------------------------------------
   public EquationGraphPanel()
   {
      setLayout(new BorderLayout());

      add(getSliderPanel(), BorderLayout.WEST);

      display = new EquationViewportPanel();
      add(display, BorderLayout.CENTER);

      equationLabel = new JLabel(EQUATION_SUBSTRING + 0);
      equationLabel.setHorizontalAlignment(SwingConstants.CENTER);
      equationLabel.setFont(new Font("Dialog", Font.BOLD, 16));
      add(equationLabel, BorderLayout.NORTH);
   }

   //-----------------------------------------------------------------
   //  Creates the sliders and slider panel.
   //-------------------------------------------------------------
   private JPanel getSliderPanel()
   {
      SliderMouseListener changed = new SliderMouseListener();

      aSlider = new JSlider(JSlider.HORIZONTAL, MIN_VALUE, MAX_VALUE, INIT_VALUE);
      aSlider.setPaintTicks(true);
      aSlider.setPaintLabels(true);
      aSlider.setMajorTickSpacing(TICK_SPACING);
      aSlider.setMinorTickSpacing(MINOR_TICK_SPACING);
      aSlider.setSnapToTicks(true);
      aSlider.addMouseListener(changed);

      bSlider = new JSlider(JSlider.HORIZONTAL, MIN_VALUE, MAX_VALUE, INIT_VALUE);
      bSlider.setPaintTicks(true);
      bSlider.setPaintLabels(true);
      bSlider.setMajorTickSpacing(TICK_SPACING);
      bSlider.setMinorTickSpacing(MINOR_TICK_SPACING);
      bSlider.setSnapToTicks(true);
      bSlider.addMouseListener(changed);

      cSlider = new JSlider(JSlider.HORIZONTAL, MIN_VALUE, MAX_VALUE, INIT_VALUE);
      cSlider.setPaintTicks(true);
      cSlider.setPaintLabels(true);
      cSlider.setMajorTickSpacing(TICK_SPACING);
      cSlider.setMinorTickSpacing(MINOR_TICK_SPACING);
      cSlider.setSnapToTicks(true);
      cSlider.addMouseListener(changed);

      JPanel aPanel = new JPanel();
      aPanel.setLayout(new BoxLayout(aPanel, BoxLayout.Y_AXIS));
      aPanel.setBorder(new LineBorder(Color.black));
      aPanel.add(new JLabel("value of 'a'"));
      aPanel.add(aSlider);

      JPanel bPanel = new JPanel();
      bPanel.setLayout(new BoxLayout(bPanel, BoxLayout.Y_AXIS));
      bPanel.setBorder(new LineBorder(Color.black));
      bPanel.add(new JLabel("value of 'b'"));
      bPanel.add(bSlider);

      JPanel cPanel = new JPanel();
      cPanel.setLayout(new BoxLayout(cPanel, BoxLayout.Y_AXIS));
      cPanel.setBorder(new LineBorder(Color.black));
      cPanel.add(new JLabel("value of 'c'"));
      cPanel.add(cSlider);

      JPanel sliderPanel = new JPanel();
      sliderPanel.setLayout(new BoxLayout(sliderPanel, BoxLayout.Y_AXIS));
      JLabel title = new JLabel("ax\u00B2 + bx + c");
      title.setFont(new Font("Dialog", Font.BOLD, 16));
      title.setHorizontalAlignment(SwingConstants.CENTER);
      sliderPanel.add(title);
      sliderPanel.add(new JLabel("Select values for each coefficient:"));
      sliderPanel.add(Box.createVerticalGlue());
      sliderPanel.add(aPanel);
      sliderPanel.add(Box.createVerticalGlue());
      sliderPanel.add(bPanel);
      sliderPanel.add(Box.createVerticalGlue());
      sliderPanel.add(cPanel);

      return sliderPanel;
   }

   //-----------------------------------------------------------------
   //  Update and equation label.
   //-------------------------------------------------------------
   private void updateEquationLabel (Equation equation)
   {
      equationLabel.setText (EQUATION_SUBSTRING + equation.toString());
   }

   //********************************************************************
   //  Represents the mouse listener class for the sliders.
   //********************************************************************
   private class SliderMouseListener extends MouseAdapter
   {
      //-----------------------------------------------------------------
      //  Redraws the graph.
      //-----------------------------------------------------------------
      public void mouseReleased(MouseEvent event)
      {
         Equation equation = new Equation(aSlider.getValue(), bSlider.getValue(), cSlider.getValue());
         display.setEquation(equation);
         updateEquationLabel(equation);
         repaint();
      }
   }
}

