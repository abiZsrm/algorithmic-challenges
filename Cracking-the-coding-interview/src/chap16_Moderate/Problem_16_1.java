package chap16_Moderate;

import test.utlity.Output;

/**
 * 
 * Number Swapper: Write a function to swap a number in place (that is, without 
 * temporary variables). 
 */
public class Problem_16_1
{
   public static void main(String[] args)
   {
                                    // 0  1  2  3   4  5  6
      Integer[] array = new Integer[] {6, 4, 8, 7, 10, 9, 11}; 
      
      Output.printArray(array);
      swap(6, 3, array); 
      Output.printArray(array); 
      
   }
   
   public static void swap(int i, int j, Integer[] array)
   {
      if(array[i] > array[j])
      {
         mutation(j, i, array);
      }
      else
      {
         mutation(i, j, array);
      }
   }
   
   public static void mutation(int greater, int lower, Integer[] array)
   {
      array[lower] = array[greater] - array[lower]; 
      array[greater] = array[greater] - array[lower]; 
      array[lower] = array[lower]  + array[greater]; 
   }
}
