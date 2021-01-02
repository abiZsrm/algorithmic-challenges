package prac08_Recursion.DP.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chap08_Recursion.DP.Problem_8_1;

public class Problem_8_1_Test
{
   /*
    * Test hop-n-steps with memoization. 
    */
   @Test
   public void testhopNStepsWithoutMemoization()
   {
      /*
       * Test hop n steps without memoization. 
       */
      assertEquals(2, Problem_8_1.hopNSteps(2));
      assertEquals(4, Problem_8_1.hopNSteps(3)); 
   }
   
   @Test
   public void testhopNStepsWithMemoization()
   {
      /*
       * Test hop n steps with memoization. 
       */
      int[] memo = new int[3]; 
      assertEquals(2, Problem_8_1.hopNSteps(2, memo));  
      
      memo = new int[4]; 
      assertEquals(4, Problem_8_1.hopNSteps(3, memo)); 
   }
}
