package chap01_Arrays.Strings;

/**
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is
 * 0, its entire row and column are set to 0.
 * 
 * (11.18.2019). 
 */
public class Problem_1_8
{
   public static void zeroMatrix(int[][] matrix)
   {
      Integer[] zeroTracker = new Integer[matrix.length]; 
      
      for(int i=0; i<matrix.length; i++)
      {
         for(int j=0; j<matrix.length; j++)
         {
            if(matrix[i][j] == 0)
            {
               zeroTracker[i] = j; 
            }
         }
      }
      
      /*
       * ZERO rows & columns. 
       */
      for(int i=0; i<zeroTracker.length; i++)
      {
         if(zeroTracker[i] != null )
         {
            zeroRow(matrix, i); 
            zeroCol(matrix, zeroTracker[i]); 
         }
      }
   }
   
   private static void zeroRow(int[][] matrix, int row)
   {
      for(int i=0; i<matrix.length; i++)
      {
         matrix[row][i] = 0; 
      }
   }
   
   private static void zeroCol(int[][] matrix, int column)
   {
      for(int i=0; i<matrix.length; i++)
      {
         matrix[i][column] = 0; 
      }
   }
}
