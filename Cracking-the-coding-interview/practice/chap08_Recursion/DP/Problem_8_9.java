package chap08_Recursion.DP;

import java.util.ArrayList;

/**
 * (10.30.2019)
 * 
 * Parens: Implement an algorithm to print all valid (e.g., properly opened
 * and closed) combinations of n pairs of parentheses.
 * 
 * EXAMPLE Input: 3 Output: ((())), (()()), (())(), ()(()), ()()()
 * 
 * Pointers. 
 * a. We were very close. We have to decide how to maintain a 
 *    proper state inside when making a recursive function call. 
 * b. State propagation has to be kept in mind.
 * 
 *  (Struggled).
 */
public class Problem_8_9
{
  
   public static ArrayList<String> generateAllParens(int pairs)
   {
      ArrayList<String> allPairs = new ArrayList<String>();
      char[] parens = new char[pairs * 2]; 
      generateAllParens(2, 2, allPairs, parens, 0);

      return allPairs;
   }

   public static void generateAllParens( int open, int close, ArrayList<String> allPairs, 
                                         char[] parens, int index )
   {
      /*
       * ISSUE: What is this base case. 
       */
      if(open < 0 || close < open)
      {
         return; 
      }
      
      if (open == 0 && close == 0)
      {
         allPairs.add(String.copyValueOf(parens));
      }
      else
      {
         parens[index] = '('; 
         generateAllParens(open - 1, close, allPairs, parens, index + 1);
         
         parens[index] = ')'; 
         generateAllParens(open, close - 1, allPairs, parens, index + 1);
      }

   }
}
