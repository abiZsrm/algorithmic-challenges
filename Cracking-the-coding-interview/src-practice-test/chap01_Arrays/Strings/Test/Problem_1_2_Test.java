package chap01_Arrays.Strings.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap01.Problem_1_2;

public class Problem_1_2_Test
{
   @Test
   public void testProblem_1_2()
   {
      String input1 = "aabcde"; 
      String input2 = "bcdeaa";
      String input3 = "abcd"; 
      
      assertTrue(Problem_1_2.checkStr1PermutationOfStr2(input2, input1)); 
      assertFalse(Problem_1_2.checkStr1PermutationOfStr2(input3, input1)); 
   }
   
   @Test
   public void testProblem_1_2_Approach2()
   {
      String input1 = "aabcde"; 
      String input2 = "bcdeaa"; 
      String input3 = "abcd"; 
      
//      assertTrue(Problem_1_2.checkStr1IsPermutationOfStr2BySorting(input1, input2)); 
//      assertFalse(Problem_1_2.checkStr1IsPermutationOfStr2BySorting(input1, input3)); 
   }
}
