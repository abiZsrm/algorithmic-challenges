package chap8_Recursion.DP;

import chap8_Recursion.DP.Test.Point;

/**
 * (10.31.2019)
 * 
 * Paint Fill: Implement the "Paint fill" function that one might see on many
 * image editing programs. That is, given a screen (represented by a
 * two-dimensional array of colors), a point and a new color, fill in the
 * surrounding area until the color changes from the original color.
 */
public class Problem_8_10
{
   public static void paintFill( String[][] screen, Point point, String color )
   {
      if(    point.getCol() > (screen[0].length - 1) // Column boundary.  
          || point.getRow() > (screen.length -1) // Row boundary. 
          || point.getCol() < 0  // Column boundary. 
          || point.getRow() < 0  // Row boundary.
          || screen[point.getRow()][point.getCol()].equals(color) // Already the expected color.
         )
      {
         return; 
      }
      
      // Paint the point with color. 
      screen[point.getRow()][point.getCol()] = color; 
      
      int row = point.getRow(); 
      int col = point.getCol(); 
      
      paintFill(screen, new Point(row - 1, col), color); // Up.
      paintFill(screen, new Point(row - 1, col - 1), color); // Up-Left. 
      paintFill(screen, new Point(row - 1, col + 1), color); // Up-Right. 
      paintFill(screen, new Point(row, col - 1), color); // Left. 
      paintFill(screen, new Point(row, col + 1), color); // Right. 
      paintFill(screen, new Point(row + 1, col), color); // Down. 
      paintFill(screen, new Point(row + 1, col - 1), color); // Down-Left. 
      paintFill(screen, new Point(row + 1, col + 1), color); // Down-Right.
   }
   
}
