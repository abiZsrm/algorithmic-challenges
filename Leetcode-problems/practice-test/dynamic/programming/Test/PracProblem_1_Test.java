package dynamic.programming.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import dynamic.programming.PracProblem_1;

public class PracProblem_1_Test
{
   @Test
   public void testFindCombinationExample1()
   {
      // Example 1 //
      // Input
      int[] candidates = new int[] { 2, 3, 6, 7 };
      int targetSum = 7;

      // Expected combination.
      List<List<Integer>> expectedCombinations = new ArrayList<List<Integer>>();
      expectedCombinations.add(Arrays.asList(2, 2, 3));
      expectedCombinations.add(Arrays.asList(7));

      // Actual combination.
      List<List<Integer>> combinations = PracProblem_1.findCombination(candidates, targetSum);
      int match = returnNumberOfMatches(combinations, expectedCombinations); 
      
      // Validate if the number of combinations are present.
      assertTrue(expectedCombinations.size() == match);
   }

   @Test
   public void testFindCombinationExample2()
   {
      // Example 2 // 
      // Input
      int[] candidates = new int[] {2,3,5}; 
      int targetSum = 8; 
      
      // Expected combination.
      List<List<Integer>> expectedCombinations = new ArrayList<List<Integer>>();
      expectedCombinations.add(Arrays.asList(2,2,2,2));
      expectedCombinations.add(Arrays.asList(2,3,3));
      expectedCombinations.add(Arrays.asList(3,5));

      // Actual combination.
      List<List<Integer>> combinations = PracProblem_1.findCombination(candidates, targetSum);
      int match = returnNumberOfMatches(combinations, expectedCombinations); 
      
      // Validate if the number of combinations are present.
      assertTrue(expectedCombinations.size() == match);
   }
   
   @Test
   public void testFindCombinationExample3()
   {
      // Example 3 // 
      // Input
      int[] candidates = new int[] {1}; 
      int targetSum = 2; 
      
      // Expected combination.
      List<List<Integer>> expectedCombinations = new ArrayList<List<Integer>>();
      expectedCombinations.add(Arrays.asList(1, 1));

      // Actual combination.
      List<List<Integer>> combinations = PracProblem_1.findCombination(candidates, targetSum);
      int match = returnNumberOfMatches(combinations, expectedCombinations); 
      
      // Validate if the number of combinations are present.
      assertTrue(expectedCombinations.size() == match);   
   }
   
   private static int returnNumberOfMatches(List<List<Integer>> combinations, List<List<Integer>> expectedCombinations)
   {
      int match = 0;
      for (List<Integer> combination : combinations)
      {
         for (List<Integer> expectedCombination : expectedCombinations)
         {
            if (compareLists(expectedCombination, combination))
            {
               match++;
            }
         }
      }

      return match;
   }

   private static boolean compareLists(List<Integer> list1, List<Integer> list2)
   {
      boolean result = true;

      int[] list1Map = new int[200];
      int[] list2Map = new int[200];

      for (Integer i : list1)
      {
         list1Map[i]++;
      }

      for (Integer i : list2)
      {
         list2Map[i]++;
      }

      for (int i = 0; i < 200; i++)
      {
         if (list1Map[i] != list2Map[i])
         {
            return false;
         }
      }

      return result;
   }
}
