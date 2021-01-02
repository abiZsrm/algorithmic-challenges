package prac10_Sorting.Searching.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap10_Sorting.Searching.Problem_10_1;
import test.utlity.Output;

public class Problem_10_1_Test
{
   @Test
   public void testMergeAB()
   {
      Integer[] aArr = new Integer[] {4, 90, 95, null, null, null }; 
      Integer[] bArr = new Integer[] {3, 80, 85}; 
      
      Integer[] resultArr = Problem_10_1.mergeAB(aArr, bArr, 3); 
      
      // Validate if the array is sorted. 
      Output.printArray(resultArr); 
      assertTrue(isSorted(aArr)); 
   }
   
   private static boolean isSorted(Integer[] aArr)
   {
      for(int i=0; i<aArr.length - 1; i++)
      {
         if(!(aArr[i] <= aArr[i + 1]))
         {
            return false; 
         }
      }
      
      return true; 
   }
}
