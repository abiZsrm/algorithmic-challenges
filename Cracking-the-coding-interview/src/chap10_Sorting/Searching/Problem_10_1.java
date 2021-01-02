package chap10_Sorting.Searching;

/**
 * (11.04.2019). 
 * 
 * Sorted Merge: You are given two sorted arrays, A and B, where A has a
 * large enough buffer at the end to hold B. Write a method to merge B into A
 * in sorted order.
 */
public class Problem_10_1
{
   public static Integer[] mergeAB( Integer[] aArr, Integer[] bArr, 
                                    int aSize )
   {
      int i = aSize - 1; 
      int j = bArr.length -1; 
      
      int auxSize = aArr.length - 1; 
      
      while( i >= 0 && j >= 0 )
      {
         if(aArr[i] > bArr[j])
         {
            aArr[auxSize--] = aArr[i--]; 
         }
         else
         {
            aArr[auxSize--] = bArr[j--]; 
         }
      }
      
      // Copy remaining from Array A.  
      while (i >= 0)
      {
         aArr[auxSize--] = aArr[i--]; 
      }
      
      // Copy remaining from Array B. 
      while (j >= 0)
      {
         aArr[auxSize--] = bArr[j--]; 
      }
      
      return aArr; 
   }
}
