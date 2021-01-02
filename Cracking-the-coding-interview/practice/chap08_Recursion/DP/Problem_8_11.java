package chap08_Recursion.DP;

/**
 * (10.31.2019)
 * 
 * Coins: Given an infinite number of quarters (25 cents), dimes (10 cents),
 * nickel (5 cents), and pennies (1 cent), write code to calculate the number
 * of ways of representing n cents.
 */
public class Problem_8_11
{
   /*
    * Problem with this approach is you are going to recompute denominations. 
    */
   public static int representNCents(int n, int[] denominations)
   {
      int count = 0; 
      
      if (n < 0)
      {
         return 0; 
      }
      else if (n == 0)
      {
         return 1; 
      }
      else if (n > 0)
      {
         for(int i=0; i<denominations.length; i++)
         {
            /**
             * (Bug Identified) - 11.01.2019. 
             * 
             * When your denomination is '1' - then it is assumed that 
             * it could be broken down as 1 divides everything. 
             */
            if(denominations[i] == 1)
            {
               count += 1; 
            }
            else 
            {
               count += representNCents(n - denominations[i], denominations);
            }
         }
      }
      
      return count; 
   }
   
   /**
    * (11.01.2019)
    * 
    * Text Solution. 
    */
   public static int makeChange(int n)
   {
      int[] denoms = {25, 10, 5, 1}; 
      return makeChange(n, denoms, 0); 
   }
   
   private static int makeChange(int amount, int[] denoms, int index)
   {
      // Last Denom. 
      /*
       * We assume that for 1 we do not need to expand the stack 
       * and hence we assume that it could be broken down so it would 
       * be 1. 
       */
      if(index >= denoms.length - 1)
      {
         return 1; 
      }
      
      int denomAmount = denoms[index]; 
      int ways = 0; 
      
      for(int i = 0; i * denomAmount <= amount; i++)
      {
         int amountRemaning = amount - (i * denomAmount); 
         ways += makeChange(amountRemaning, denoms, index + 1); 
      }
      
      return ways; 
   }
   
   /**
    * (11.01.2019)
    * 
    * Research: Why (n + 1) ? 
    */
   
}
