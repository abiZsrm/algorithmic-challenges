package chap8_Recursion.DP;

import java.util.ArrayList;

/**
 * (11.01.2019)
 * 
 * Eight Queens: Write an algorithm to print all ways of arranging eight
 * queens on an 8x8 chess board so that none of them share the same row,
 * column, or diagonal. In this case, "diagonal" means all diagonals, not
 * just the two that bisect the board.
 * 
 * Problem Log. 
 * 
 * (10.31.2019) - Attempted with a logical solution - [Failed].
 *   
 * (11.01.2019) - Attempted to come up with a working logical Solution - [Failed].
 *                Decided to re-do after 2 weeks.
 *                  
 * (11.11.2019) - Came up with a tedious brute force approach - Works [ok]
 *                but not quite elegant.
 *                 
 * (11.11.2019) - Referred text book solution - Decided to dedicate one complete day for this
 *                was left blank to comprehend - [Failed in Understanding].
 *                 
 * (11.12.2019) - Learned how to leverage 2 dimensional efficiently. 
 *                Read; Re-read the solution logic line by line and made an attempt
 *                to comprehend deeply. 
 * 
 * (11.13.2019) - Came to a realization that ***Pythagoras*** theorem was essential in
 *                comprehending the solution. 
 *                
 * (11.14.2019) - Was able to comprehend and recode the solution without the 
 *                need for reference. [Solidified Understanding]
 */
public class Problem_8_12
{
   /**
    * @param row - Row on which the queen would be placed. 
    * @param columns - Observe that each row could only have one queen, we do 
    *                  not need to store our board as a full 8x8 matrix. We only 
    *                  need a single array where
    *                  
    *                  " column[r] = c "
    *                  
    *                  which indicates that row "r" has a queen at column "c".
    *                   
    * @param results - stores all the possible results encountered for the 8
    *                  queens solution. 
    */
   public static void placeQueens( int row, Integer[] columns, ArrayList<Integer[]> results )
   {
      final int GRID_SIZE = 8; 
      
      if (row == GRID_SIZE)
      {
         results.add(columns.clone());
      }
      else
      {
         for (int col = 0; col < GRID_SIZE; col++)
         {
            if (checkValid(columns, row, col))
            {
               columns[row] = col; // Place queen.
               placeQueens(row + 1, columns, results);
            }
         }
      }
   }
   
  /***
   * Method to check if the queen that is being placed does 
   * not invalidate the constraints. 
   * 
   * @param columns - Retains the information about previous queens 
   *                  placed. 
   * @param row1 - The new row on which the queen will be placed. 
   * @param column1 - The new column on which the queen will be placed. 
   * @return - true if the queen could be placed without violating any constraint, false otherwise. 
   */
   static boolean checkValid(Integer[] columns, int row1, int column1)
   {
      for (int row2 = 0; row2 < row1; row2++)
      {
         /*
          * Check if (row2, column2) invalidates (row1, column1) as a queen
          * spot. Check if rows have a queen in the same column
          */
         int column2 = columns[row2];
         if (column1 == column2)
         {
            return false;
         }

         /*
          * Right Angled triangle - ***Pythagoras theorem logic***. 
          * 
          * Check diagonals: if the distance between the columns equals the
          * distance between the rows, then they're in the same diagonal.
          */
         int columnDistance = Math.abs(column2 - column1);

         /*
          * row 1 > row2, so need for abs
          */
         int rowDistance = row1 - row2;
         if (columnDistance == rowDistance)
         {
            return false;
         }
      }

      return true;
   }
}
