package chap03_Stacks.Queues.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap03.Problem_3_2;

public class Problem_3_2_Test
{
   @Test
   public void testStackMin()
   {
      int[] numbersToPushOntoStack = new int[] {5, 4, 1, 2, 3}; 
      
      for(int i=0; i<numbersToPushOntoStack.length; i++)
      {
         Problem_3_2.push(numbersToPushOntoStack[i]);
      }
      
      assertTrue(Problem_3_2.getMin() == 1); 
   }
}
