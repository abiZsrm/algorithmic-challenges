package chap8_Recursion.DP.Test;

import java.util.ArrayList;

import org.junit.Test;

import prac08_Recursion.DP.Test.Box;

public class Problem_8_13_Test
{
   @Test
   public void testComputeMaxHeight()
   {
      Box b1 = new Box(1, 2, 3); 
      Box b2 = new Box(4, 5, 6); 
      Box b3 = new Box(7, 8, 9); 
      
      ArrayList<Box> boxList = new ArrayList<Box>(); 
      boxList.add(b1); 
      boxList.add(b2); 
      boxList.add(b3); 
   }
}
