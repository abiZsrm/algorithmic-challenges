package chap03_Stacks.Queues.Test;

import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

import prac03_Stacks.Queues.Problem_3_5;
import test.utlity.Output;

public class Problem_3_5_Test
{
   @Test
   public void testSortStack()
   {
      Stack<Integer> input = new Stack<Integer>(); 
      input.push(10); 
      input.push(8); 
      input.push(12); 
      input.push(3); 
      
      input = Problem_3_5.sortStack(input); 
      
      // Validate if the stack is sorted. 
      assertTrue(isSorted(input)); 
   }
   
   private static boolean isSorted(Stack<Integer> stack)
   {
      Integer[] array = new Integer[stack.size()]; 
      int index = 0; 
      
      while( !stack.isEmpty() )
      {
    	  array[index++] = stack.pop(); 
      }
      
      return isSorted(array, 0); 
   }
   
   private static boolean isSorted(Integer[] arr, int position)
   {
      if(position == arr.length -1)
      {
         return true; 
      }
      
      return ((arr[position] <= arr[position + 1])?isSorted(arr, position + 1):false);
   }
}
