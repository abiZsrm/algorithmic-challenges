package chap01_Arrays.Strings.Test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import chap01.Problem_1_7;

public class Problem_1_7_Test
{
   @Test
   public void testRotateMatrix()
   {
      int[][] inputMatrix = new int[][] {
                                           {1, 2, 3}, 
                                           {4, 5, 6}, 
                                           {7, 8, 9}
                                        };
                                        
      int[][] expectedMatrix = new int[][] { 
                                            {7, 4, 1}, 
                                            {8, 5, 2}, 
                                            {9, 6, 3}
                                          };
      // Rotate matrix by 90 degrees. 
      Problem_1_7.rotateMatrix(inputMatrix);
                      
      // Validate if the matrix has been rotated. 
      for(int i=0; i<inputMatrix.length; i++)
      {
         assertArrayEquals(inputMatrix[i], expectedMatrix[i]);
      }
   }
}
