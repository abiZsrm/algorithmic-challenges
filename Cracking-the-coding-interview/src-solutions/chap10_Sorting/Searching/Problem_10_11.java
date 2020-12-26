package chap10_Sorting.Searching;

/**
 * Peaks and Valleys: In an array of integers, a "peak" is an element which
 * is greater than or equal to the adjacent integers and a "valley" is an
 * element which is less than or equal to the adjacent integers. For example,
 * in the array {5, 8, 6, 2, 3, 4, 6}, {8, 6} are peaks and {5, 2} are
 * valleys. Given an array of integers, sort the array into an alternating
 * sequence of peaks and valleys.
 * 
 * Example 
 * Input: {5, 3, 1, 2, 3} 
 * Output: {5, 1, 3, 2, 3}
 * 
 * (11.22.2019) - Struggled: Whenever you are confused just sort and work with smaller 
 *                input patterns. 
 *                
 * (TODO: Improvisation exists). 
 */
public class Problem_10_11
{
   /**
    * O(nLogn)
    */
   public static void peakAndValleys(int[] input)
   {
      for(int i=1; i<input.length; i+=2)
      {
         swap(input, i-1, i); 
      }
   }
   
   private static void swap(int[] inputArr, int i, int j)
   {
      int temp = inputArr[i]; 
      inputArr[i] = inputArr[j]; 
      inputArr[j] = temp; 
   }
}
