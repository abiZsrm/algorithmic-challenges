package chap01_Arrays.Strings.Test;

import org.junit.Test;

import chap01_Arrays.Strings.Problem_1_8;
import test.utlity.Output;

public class Problem_1_8_Test
{
   @Test
   public void testZeroMatrix()
   {
      int[][] inputArray = new int[][] {
                                          {1, 0, 3, 4}, 
                                          {5, 6, 0, 7}, 
                                          {0, 9, 10, 11}, 
                                          {12, 13, 14, 15}
                                       }; 
      
      Problem_1_8.zeroMatrix(inputArray);
      Output.printArray(inputArray);
   }
}
