package chap8_Recursion.DP;

import prac08_Recursion.DP.Test.Tower;

/**
 * (10.29.2019)
 * 
 * Towers of Hanoi: In the classic problem of the Towers of Hanoi, you have 3
 * towers and N disks of different sizes which can slide onto any tower. The
 * puzzle starts with disks sorted in ascending order of size from top to
 * bottom (i.e, each disk sits on top of an even larger one). You have the
 * following constraints:
 * 
 * (1) Only one disk could be moved at a time. 
 * (2) A disk is slid off the top of one tower onto another tower. 
 * (3) A disk cannot be placed on top of a smaller disk.
 * 
 * Write a program to move the disks from the first tower to the last using
 * stacks.
 * 
 * (10.30.2019)
 * a. Textbook solution appears too complex to understand. Need more time to digest. 
 * b. Struggling for way too long.  
 */
public class Problem_8_6_P
{
   private Tower tower1; 
   private Tower tower2; 
   private Tower tower3; 
   
   /*
    * Textbook solution. 
    */
   public static void moveDisks(int n, Tower origin, Tower destination, Tower buffer)
   {
      /*
       * Base Case. 
       */
      if( n <= 0)
      {
         return; 
      }
      
      /*
       * Move top n-1 disks from origin to buffer, using destination as a buffer. 
       */
      moveDisks(n-1, origin, buffer, destination); 
      
      /*
       * Move top from origin to destination. 
       */
      moveTop(origin, destination); 
      
      /*
       * Move top n-1 disks from buffer to destination, using origin as a buffer. 
       */
      moveDisks(n-1, buffer, destination, origin); 
   }
   
   public static void moveTop(Tower origin, Tower destination)
   {
      origin.moveTopTo(destination); 
   }
   
   public static void main(String[] args)
   {
      int n = 3; 
      Tower[] towers = new Tower[n]; 
      
      for(int i=0; i<3; i++)
      {
         towers[i] = new Tower(i); 
      }
      
      for(int i = n - 1; i >= 0; i--)
      {
         towers[0].add(i); 
      }
      
      towers[0].moveDisks(n, towers[2], towers[1]); 
   }
}
