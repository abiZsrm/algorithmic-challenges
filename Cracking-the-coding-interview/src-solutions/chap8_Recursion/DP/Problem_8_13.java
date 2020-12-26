package chap8_Recursion.DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import chap8_Recursion.DP.Test.Box;

/*
 * (11.04.2019)
 * 
 * Stack of Boxes: You have a stack of n boxes, with widths wi, heights hi
 * and depths di. The boxes cannot be rotated and could only be stacked on
 * top of one another if each box in the stack is strictly larger than the
 * box above it in width, height and depth. Implement a method to compute the
 * height of the tallest possible stack. The height of a stack is the sum of
 * the heights of each box.
 * 
 * (Extremely difficult to understand) (Skipped). 
 * 
 * (11.18.2019) - Gained an initial understanding. TODO: (Dependency) -> [Order Statistics]
 */
public class Problem_8_13
{
   public static int computeMaxHeight( ArrayList<Box> boxList )
   {
      /*
       * A minor optimization to begin with. 
       */
      Collections.sort(boxList, new BoxComparator());
      int maxHeight = 0; 
      
      for(int i=0; i<boxList.size(); i++)
      {
         /*
          * We are just propagating the maximum height with different boxes 
          * as a base. 
          */
         int height = computeMaxHeight(boxList, i); 
         maxHeight = Math.max(maxHeight, height); 
      }
      
      return maxHeight; 
   }
   
   public static int computeMaxHeight( ArrayList<Box> boxList, int bottomIndex )
   {
      Box bottom = boxList.get(bottomIndex);
      
      /**
       * At every iteration we span out multiple function calls that 
       * computes the maximum height thus the need for a local stack 
       * variable to propagate the height of across different iterations
       * by the "for" loop. 
       */
      int maxHeight = 0; 
      
      for(int i = bottomIndex + 1; i < boxList.size(); i++ )
      {
         if( boxList.get(i).couldSitOn(bottom) )
         {
            int height = computeMaxHeight(boxList, bottomIndex); 
            maxHeight = Math.max(height, maxHeight); 
         }
      }
      
      /*
       * Analysis: This will get executed just before the last recursion call.  
       */
      maxHeight += bottom.getHeight(); 
      return maxHeight; 
   }
}

class BoxComparator implements Comparator<Box>
{
   @Override
   public int compare(Box o1, Box o2)
   {
      return o2.getHeight() - o1.getHeight(); 
   }
}


