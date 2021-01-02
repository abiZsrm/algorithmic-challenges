package prac08_Recursion.DP.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Test;

import chap08_Recursion.DP.Problem_8_7;
import test.utlity.Output;

public class Problem_8_7_Test
{

   @Test
   public void testGenerateAllPermutations()
   {
      String input = "abc";
      ArrayList<String> expectedOutput = new ArrayList<String>(); 
      expectedOutput.add("cba"); 
      expectedOutput.add("bca"); 
      expectedOutput.add("bac"); 
      expectedOutput.add("cab"); 
      expectedOutput.add("acb"); 
      expectedOutput.add("abc"); 
      
      ArrayList<String> result = Problem_8_7.generateAllPermutations(input); 
      assertTrue(Output.compareListWithTypeString(expectedOutput, result)); 
   }
}
