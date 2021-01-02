package dynamic.programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Given an array of distinct integers candidates and a target integer target,
 * return a list of all unique combinations of candidates where the chosen
 * numbers sum to target. You may return the combinations in any order.
 * 
 * The same number may be chosen from candidates an unlimited number of times.
 * Two combinations are unique if the frequency of at least one of the chosen
 * numbers is different.
 * 
 * It is guaranteed that the number of unique combinations that sum up to target
 * is less than 150 combinations for the given input.
 * 
 ******* Example 1: *******
 * 
 * Input: candidates = [2,3,6,7], target = 7
 * 
 * Output: [[2,2,3],[7]]
 * 
 * Explanation: 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be
 * used multiple times. 7 is a candidate, and 7 = 7. These are the only two
 * combinations.
 * 
 * (01.01.2021). 
 */
public class Problem_1
{
   public static List<List<Integer>> findCombination(int[] candidates, int target)
   {
      ArrayList<Integer> combination = new ArrayList<Integer>();
      List<List<Integer>> combinations = new ArrayList<List<Integer>>();
      HashSet<String> hashes = new HashSet<String>();

      findCombination(hashes, target, combination, combinations, candidates);

      return combinations;
   }

   private static void findCombination(HashSet<String> hashes, int remaining, ArrayList<Integer> combination,
            List<List<Integer>> combinations, int[] candidates)
   {
      if (remaining == 0)
      {
         if (combinations.size() == 0)
         {
            combinations.add((ArrayList) combination.clone());
            hashes.add(constructHash(combination));
         }
         else
         {
            String hash = constructHash(combination);
            if (hashes.contains(hash))
            {
               return;
            }
            else
            {
               hashes.add(hash);
               combinations.add((ArrayList) combination.clone());
            }
         }
      }
      else if (remaining < 0)
      {
         return;
      }
      else
      {
         for (int i = 0; i < candidates.length; i++)
         {
            combination.add(candidates[i]);
            findCombination(hashes, remaining - candidates[i], combination, combinations, candidates);
            combination.remove(combination.size() - 1);
         }
      }
   }

   private static String constructHash(List<Integer> list)
   {
      int[] hashCodeList = new int[200];

      for (Integer integer : list)
      {
         hashCodeList[integer]++;
      }

      String output = "";

      for (Integer integer : hashCodeList)
      {
         output += Integer.toString(integer);
      }

      return output;
   }

}
