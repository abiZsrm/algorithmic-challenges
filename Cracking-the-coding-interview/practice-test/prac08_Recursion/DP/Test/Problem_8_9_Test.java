package prac08_Recursion.DP.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import chap08_Recursion.DP.Problem_8_9;
import test.utlity.Output;

public class Problem_8_9_Test
{

   @Test
   public void testGenerateAllParens()
   {
      int pairs = 2;

      ArrayList<String> expectedOutput = new ArrayList<String>();
      expectedOutput.add("(())");
      expectedOutput.add("()()");

      ArrayList<String> result = Problem_8_9.generateAllParens(pairs);
      
      // Print out the result. 
      Output.printList(result);
      
      assertTrue(Output.compareListWithTypeString(expectedOutput, result));
   }
}
