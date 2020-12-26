package chap8_Recursion.DP;

import java.util.ArrayList;

import chap8_Recursion.DP.Test.Point;

/* (10.25.2019). 
 * 
 * Robot in a Grid: Imagine a robot sitting on the upper left corner of grid
 * with r rows and c columns. The robot could only move in two directions,
 * right and down, but certain cells are "off limits" such that the robot
 * cannot step on them. Design an algorithm to find a path for the robot from
 * the top left to the bottom right.
 */
public class Problem_8_2
{
   public static void findPath( int row, int col, String[][] grid, 
                                ArrayList<ArrayList<Point>> paths, ArrayList<Point> path )
   {
      // If Atleast one path is found. 
      if(    row < 0                   // Row lower boundary condition. 
          || row >= grid.length        // Row upper boundary condition. 
          || col < 0                   // Column lower boundary condition. 
          || col >= grid[0].length     // Column upper boundary condition. 
          || grid[row][col].equals("Off Limit") // Cell is "Off Limit". 
          || paths.size() > 0)         // One path is found. 
      {
         return; 
      }
      
      Point point = new Point(row, col); 
      if(grid[row][col].equals("Destination"))
      {
         path.add(point); 
         paths.add((ArrayList<Point>) path.clone()); 
         return; 
      }

      path.add(point); 
      findPath(row, col + 1, grid, paths, path);
      findPath(row + 1, col, grid, paths, path);
   }
   
   /*
    * (10.29.2019)
    * 
    * Text book solution. 
    */
   public static ArrayList<Point> getPath(boolean[][] maze)
   {
      if(maze == null || maze.length == 0)
      {
         return null; 
      }
      
      ArrayList<Point> path = new ArrayList<Point>(); 
      if( getPath(maze, maze.length - 1, maze[0].length - 1, path))
      {
         return path; 
      }
      
      return null; 
   }
   
   public static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path)
   {
      if(col < 0 || row < 0 || !maze[row][col])
      {
         return false; 
      }
      
      boolean isAtOrigin = (row == 0) && (col == 0); 
      
      if(isAtOrigin || getPath(maze, row, col-1, path)
                    || getPath(maze, row-1, col, path))
      {
         Point p = new Point(row, col); 
         path.add(p); 
         return true; 
      }
      
      return false; 
   }
}

