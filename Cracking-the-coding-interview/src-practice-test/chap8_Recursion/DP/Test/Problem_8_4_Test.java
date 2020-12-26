package chap8_Recursion.DP.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.junit.Test;

import chap8_Recursion.DP.Problem_8_4;
import test.utlity.Output;

public class Problem_8_4_Test
{
   @Test
   public void testGetAllSubSets()
   {
      ArrayList<String> set = new ArrayList<String>();
      
      // List of characters
      set.add("a1"); 
      set.add("a2");
      set.add("a3"); 
      
      Output.printList(Problem_8_4.generateAllSubsets(set)); 
   }
}
