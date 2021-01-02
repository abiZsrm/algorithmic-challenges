package chap01_Arrays.Strings.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap01_Arrays.Strings.Problem_1_3;


public class Problem_1_3_Test
{
   @Test
   public void testProblem_1_3()
   {
      String input = "Mr John Smith     "; 
      int trueLength = 13; 
      
      assertTrue(" Mr%20John%20Smith".equals(Problem_1_3.urlIfy(input, trueLength))); 
   }
}
