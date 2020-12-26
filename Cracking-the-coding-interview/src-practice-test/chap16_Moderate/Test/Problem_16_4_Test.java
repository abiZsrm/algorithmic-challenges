package chap16_Moderate.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap16_Moderate.Problem_16_4;

public class Problem_16_4_Test
{
   
   @Test
   public void testBoardCheck()
   {
      char[][] ticTacToeBoard = new char[][] { 
                                                { 'X', 'O', 'O' }, 
                                                { 'X', 'X', 'O' }, 
                                                { 'O', 'X', 'O' } 
                                             };
       //assertTrue(Problem_16_4.boardCheck(ticTacToeBoard, 0, 0, 'X'));
       assertTrue(Problem_16_4.performBoardCheck(ticTacToeBoard, 'O'));
   }
}
