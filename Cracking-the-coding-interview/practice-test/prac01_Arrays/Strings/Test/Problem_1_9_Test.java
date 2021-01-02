package prac01_Arrays.Strings.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import prac01_Arrays.Strings.Problem_1_9;

public class Problem_1_9_Test
{
   @Test
   public void testStringRotation()
   {
      String str1 = "waterbottle"; 
      String str2 = "erbottlewat"; 
      
      assertTrue(Problem_1_9.isRotation(str1, str2)); 
   }
}
