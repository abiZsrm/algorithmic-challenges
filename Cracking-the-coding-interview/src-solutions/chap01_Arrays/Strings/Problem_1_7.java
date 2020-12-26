package chap01_Arrays.Strings;

/**
 * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel
 * in the image is 4 bytes, write a method to rotate the image by 90 degrees.
 * Could you do this in place ?
 * 
 * (11.18.2019). 
 */
public class Problem_1_7
{
   public static void rotateMatrix(int[][] matrix)
   {
      for(int i=0; i<matrix.length; i++)
      {
         for(int j=i; j>=0; j--)
         {
            int temp = matrix[i][j]; 
            matrix[i][j] = matrix[j][i]; 
            matrix[j][i] = temp; 
         }
      }
      
      for(int i=0; i<matrix.length; i++)
      {
         reverse1DArray(matrix[i]);
      }
   }
   
   /**
    * Method to reverse the elements in the given 
    * 1-D array. 
    * 
    * @param arr - 1-D input array. 
    */
   private static void reverse1DArray(int[] arr)
   {
      for(int i=0, j=arr.length - 1; i<j; i++, j--)
      {
         int temp = arr[i]; 
         arr[i] = arr[j]; 
         arr[j] = temp; 
      }
   }
}
