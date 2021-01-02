package chap8_Recursion.DP.Test;

import org.junit.Test;

import chap08_Recursion.DP.Problem_8_10;
import prac08_Recursion.DP.Test.Point;
import test.utlity.Output;

public class Problem_8_10_Test
{
   @Test
   public void testPaintFill()
   {
      String[][] colors = new String[][] { //  0        1          2        3 
                                             {"Green", "Green", "Green", "Green"}, 
                                             {"Ready", "Ready", "Ready", "Green"}, 
                                             {"Ready", "Ready", "Ready", "Green"},  // (2,1).  
                                             {"Ready", "Ready", "Ready", "Green"}, 
                                             {"Green", "Green", "Green", "Green"}
                                       };
                                       
       String newColor = "Green"; 
       System.out.println("\n----Before Fill----");
       Output.print2DArray(colors);
       
       Point point = new Point(2, 1); 
       Problem_8_10.paintFill(colors, point, newColor);
       
       System.out.println("\n---- After Fill ----");
       Output.print2DArray(colors);
   }
}
