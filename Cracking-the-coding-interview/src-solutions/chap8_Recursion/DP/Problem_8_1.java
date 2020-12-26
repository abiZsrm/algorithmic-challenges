package chap8_Recursion.DP;

/*
 * (10.24.2019)
 * 
 * Problem: A child is running up a staircase with n steps and could hop
 * either 1 step, 2 step or 3 steps at a time. Implement a method to count
 * how many possible ways the child could run up the stairs. 
 */
public class Problem_8_1
{
   /*
    * With memoization. 
    */
   public static int hopNSteps(int n, int[] memo)
   {
      if(memo[n] != 0)
      {
         return memo[n]; 
      }
      else if(n < 0)
      {
         return 0; 
      }
      else if(n == 0)
      {
         return 1; 
      }
      else
      {
         memo[n] = hopNSteps(n - 1) + hopNSteps(n - 2) + hopNSteps(n - 3);
         return memo[n]; 
      }
   }
   
   /*
    * Without memoization. 
    */
   public static int hopNSteps(int n)
   {
      if(n < 0)
      {
         return 0; 
      }
      else if(n == 0)
      {
         return 1; 
      }
      else 
      {
         return hopNSteps(n - 1) + hopNSteps(n - 2) + hopNSteps(n - 3); 
      }
   }
}
