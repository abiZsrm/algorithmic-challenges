package chap16_Moderate;

/**
 * Tic Tac Win: Design an algorithm to figure out if someone has won a game of 
 * tic-tac-toe. 
 */
public class Problem_16_4
{
   /*****
    * ( BOARD ) 
    *      0 1 2
    *   0 |X|O|O|
    *   1 |X|O|X|
    *   2 |O|O|X|
    */
   public static boolean performBoardCheck( char[][] ticTacToe, char player)
   {
      /*
       * Trigger points 
       * (0, 0)
       * (2, 2)
       */
      
      return checkWin(ticTacToe, player); 
   }
   
   public static boolean checkWin( char[][] ticTacToeBoard, char player)
   {
      int bottomUpRow = 2; 
      int topLeftRow = 0;

      return (    checkCenter(ticTacToeBoard, player)
               || boardCheckBottomUp(ticTacToeBoard, bottomUpRow, bottomUpRow, player)
               || boardCheckTopLeft(ticTacToeBoard, topLeftRow, topLeftRow, player) ); 
   }
   
   
   private static boolean checkCenter(char[][] ticTacToe, char player)
   {
      for( int j=0; j<ticTacToe.length; j++ )
      {
         if(ticTacToe[1][j] != player)
         {
            return false; 
         }
      }
      
      return true; 
   }
   
   private static boolean boardCheckTopLeft( char[][] ticTacToe, int row, int col, char player)
   {
      return (    boardCheck(ticTacToe, row, col, 0, 1, 0, player)
               || boardCheck(ticTacToe, row, col, 1, 0, 0,  player)
               || boardCheck(ticTacToe, row, col, 1, 1, 0, player) ); 
   }
   
   private static boolean boardCheckBottomUp( char[][] ticTacToe, int row, int col, char player)
   {
      return (    boardCheck(ticTacToe, row, col, 0, -1, 0, player) 
               || boardCheck(ticTacToe, row, col, -1, 0, 0, player)
               || boardCheck(ticTacToe, row, col, -1, -1, 0, player)); 
   }
   
   private static boolean boardCheck( char[][] ticTacToe, int row, 
                                     int col, int rowDiff, 
                                     int colDiff, int count, char player )
   {
      if(    row < 0 
          || row > ticTacToe.length
          || col < 0
          || col > ticTacToe[0].length 
          || ticTacToe[row][col] != player)
      {
         return false; 
      } 
      
      if( ticTacToe[row][col] == player)
      {
         count++; 
      }
      
      if(count == 3)
      {
         return true; 
      }
      
      return boardCheck(ticTacToe, row + rowDiff, col + colDiff, rowDiff, colDiff, count, player); 
   }
}
