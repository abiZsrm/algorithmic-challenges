package prac08_Recursion.DP.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap08_Recursion.DP.Problem_8_3;

public class Problem_8_3_Test
{
   @Test
   public void testIsMagicIndex()
   {
      int[] input1 = new int[] {-4, -3, -2, 1, 4, 8, 9};
      
      // Validate positive case. 
      assertTrue(Problem_8_3.isMagicIndex(input1));
      
      int[] input2 = new int[] {1, 2, 3, 4, 5}; 
      
      // Validate negative case.
      assertFalse(Problem_8_3.isMagicIndex(input2)); 
   }
   
   
   @Test
   public void testIsMagicIndexOptimized()
   {
      int[] input = new int[] {0, 2, 3, 5, 6, 7}; 
      
      // Validate positive case. 
      assertTrue(Problem_8_3.isMagicIndex(input)); 
      
      int[] input2 = new int[] {1, 2, 3, 4, 5}; 
      
      // Validate negative case. 
      assertFalse(Problem_8_3.isMagicIndex(input2)); 
   }
   
   @Test
   public void testIsMagicOptimizedWithDuplicates()
   {
      //                        0   1  2  3  4  5  6  7
      int[] input = new int[] {-4, -3, 2, 2, 2, 3, 3, 4}; 
      
      // Validate positive case. 
      assertTrue(Problem_8_3.isMagicIndexOptimizedWithDupes(input)); 
   }
}
