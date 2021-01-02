package prac08_Recursion.DP.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap08_Recursion.DP.Problem_8_8;
import test.utlity.Output;

public class Problem_8_8_Test
{
   @Test
   public void testPermWithDupes()
   {
      String input = "aab"; 
      ArrayList<String> expectedOutput = new ArrayList<String>(); 
      expectedOutput.add("aab"); 
      expectedOutput.add("baa");
      expectedOutput.add("aba"); 
      
      ArrayList<String> result = Problem_8_8.generatePermWithDupes(input); 
      
      Output.printList(result);
      
      assertTrue(Output.compareListWithTypeString(expectedOutput, result));  
   }
}
