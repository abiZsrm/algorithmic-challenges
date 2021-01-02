package chap8_Recursion.DP;

/**
 * (10.29.2019) 
 * 
 * Magic Index: A magic index in an array A[0...n-1] is defined to be an
 * index such that A[i] = i. Given a sorted array of distinct integers, write
 * a method to find a magic index, if one exists, in array A.
 * 
 * FOLLOW UP: What if the values are not distinct. 
 */
public class Problem_8_3
{
   /*
    * Naive Solution. 
    */
   public static boolean isMagicIndex(int[] sortedArray)
   {
      boolean isMagicIndex = false; 
      
      for(int i=0; i<sortedArray.length; i++)
      {
         if(sortedArray[i] == i)
         {
            return true; 
         }
      }
      
      return isMagicIndex; 
   }
   
   /*
    * Optimized solution. 
    */
   public static boolean isMagicIndexOptimized(int[] sortedArray)
   {
      int low = 0; 
      int high = sortedArray.length - 1; 
      
      return isMagicIndexOptimized(low, high, sortedArray); 
   }
   
   private static boolean isMagicIndexOptimized(int low, int high, int[] sortedArray)
   {
      if(high < low)
         return false; 
      
      int mid = (low + high)/2; 
      
      if(sortedArray[mid] == mid)
      {
         return true; 
      }
      else if(sortedArray[mid] < mid)
      {
         // Search the right portion of the array. 
         return isMagicIndexOptimized(mid + 1, high, sortedArray); 
      }
      else if(sortedArray[mid] > mid)
      {
         // Search the left portion of the array. 
         return isMagicIndexOptimized(low, mid - 1, sortedArray); 
      }
             
      return false; 
   }
   
   /*
    * FOLLOW UP: What if the values are not distinct. 
    */
   public static boolean isMagicIndexOptimizedWithDupes(int[] sortedArray)
   {
      int low = 0; 
      int high = sortedArray.length - 1; 
      
      return (isMagicIndexOptimizedWithDupes(low, high, sortedArray) > 0);  
   }
   
   private static int isMagicIndexOptimizedWithDupes(int low, int high, int[] sortedArray)
   {
      if(high < low)
      {
         return -1; 
      }
      
      int midIndex = (low + high)/2; 
      int midValue = sortedArray[midIndex]; 
      
      if(midValue == midIndex)
      {
         return midIndex; 
      }
      
     /*
      * Search Left
      */
      int leftIndex = Math.min(midIndex - 1, midValue); 
      int left = isMagicIndexOptimizedWithDupes(leftIndex, low, sortedArray); 
      if(left >= 0)
      {
         return left; 
      }
      
      /*
       * Search Right
       */
      int rightIndex = Math.max(midIndex + 1, midValue); 
      int right = isMagicIndexOptimizedWithDupes(rightIndex, high, sortedArray); 
      
      return right; 
   }

}
