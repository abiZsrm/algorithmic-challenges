package chap8_Recursion.DP.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chap8_Recursion.DP.Problem_8_11;

public class Problem_8_11_Test
{
   @Test
   public void testNCents()
   {
      int input = 10; 
      int[] denominations = new int[] {25, 10, 5, 1}; 
      
      assertEquals(4, Problem_8_11.representNCents(input, denominations)); 
      
      int input2 = 5;
      assertEquals(2, Problem_8_11.representNCents(input2, denominations)); 
   }
 
   @Test
   public void testNCentsTextBookSolution()
   {
      int input = 10; 
      
      assertEquals(4, Problem_8_11.makeChange(input)); 
   }
}
