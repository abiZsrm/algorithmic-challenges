package prac08_Recursion.DP.Test;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

import chap08_Recursion.DP.Problem_8_2;
import test.utlity.Output;

public class Problem_8_2_Test
{
   @Test
   public void testFindPathInGrid()
   {
      // Grid. 
      String[][] grid = { 
                           {"",       ""    , "", "Off Limit"  }, 
                           {"" , "Off Limit", "", ""           }, 
                           {"",       ""    , "", "Destination"}, 
                        }; 
      // Start position. 
      int row = 0; 
      int col = 0; 
      
      // Expected Path. 
      ArrayList<Point> expectedPath = new ArrayList<Point>(); 
      expectedPath.add(new Point(0, 0)); 
      expectedPath.add(new Point(0, 1)); 
      expectedPath.add(new Point(0, 2)); 
      expectedPath.add(new Point(1, 2)); 
      expectedPath.add(new Point(1, 3)); 
      expectedPath.add(new Point(2, 3)); 
      
      // For storing path.  
      ArrayList<ArrayList<Point>> paths = new ArrayList<ArrayList<Point>>(); 
      ArrayList<Point> path = new ArrayList<Point>(); 
      Problem_8_2.findPath(row, col, grid, paths, path);
      
      System.out.println("\nPrinting path for TestFindPathInGrid-test"); 
      printPath(path);
      
      // Validate Path. 
      assertTrue(Output.compareList(expectedPath, path)); 
   }
   
   /*
    * Method to print the paths. 
    */
   private static void printPath( ArrayList<Point> path )
   {
      for(Point point : path)
      {
         System.out.println("(" + point.getRow() + " , " + point.getCol() + ")"); 
      }
   }
}
