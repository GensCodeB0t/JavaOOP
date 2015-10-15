//******************************************************************************************
// Programming Projects 10.9 
// Equation.java
// Ryan Gens
// Complete Programming Projects 10.9 using the classes from blackboard.
//******************************************************************************************
//********************************************************************
//   Equation.java       Authors: Lewis/Loftus
//
//   Solution to Programming Project 10.9 
//********************************************************************

public class Equation
{
   private int a, b, c;
   public final String SQUARED = "\u00B2";

   //------------------------------------------------------------------
   //   Sets up the default coeficients of this equation:
   //   a*x^2 + b*x + c
   //------------------------------------------------------------------
   public Equation()
   {
      a = b = c = 0;
   }

   //------------------------------------------------------------------
   //   Sets up the coeficients of this equation as specified.
   //------------------------------------------------------------------
   public Equation (int aValue, int bValue, int cValue)
   {
      a = aValue;
      b = bValue;
      c = cValue;
   }

   //------------------------------------------------------------------
   //   Computes the current value of this equation.
   //------------------------------------------------------------------
   public double computeValue(double x)
   {
      return a*x*x + b*x + c;
   }

   //------------------------------------------------------------------
   //   Returns a string representation of this equation.
   //------------------------------------------------------------------
   public String toString()
   {
      StringBuffer equation = new StringBuffer();

      if (a==0 && b==0 && c==0)
         equation.append("0");
      else
      {
         if (a != 0)
         {
            if (a==-1)
               equation.append("-");
            else
               if (a!=1)
                  equation.append(a);
            equation.append( "x" + SQUARED);
         }
         if (b != 0)
         {
            if (b < 0)
            {
               if (a==0)
                  equation.append("-");
               else
                  equation.append(" - ");
               b = -b;
            }
            else
               equation.append(" + ");
            if (b!=1 && b!= -1)
               equation.append(b);
            equation.append("x");
         }
         if (c != 0)
         {
            if (c < 0)
            {
               if (a!=0 || b!=0)
                  equation.append(" - ");
               else
                  equation.append("-");
               c = -c;
            }
            else
               equation.append(" + ");
            equation.append(c);
         }
      }

      // erase leading +
      if (equation.length() > 2)
      {
         char ch = equation.charAt(1);
         if (ch=='+')
         {
           equation.deleteCharAt(0);
           equation.deleteCharAt(0);
         }
      }
      return equation.toString();
   }
}