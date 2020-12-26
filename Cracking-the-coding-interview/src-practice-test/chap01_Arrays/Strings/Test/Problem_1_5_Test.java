package chap01_Arrays.Strings.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap01.Problem_1_5;

public class Problem_1_5_Test
{
   @Test
   public void testOneEditAway()
   {
      assertTrue(Problem_1_5.oneEditAway("pale", "ple")); 
      assertTrue(Problem_1_5.oneEditAway("pales", "pale")); 
      assertTrue(Problem_1_5.oneEditAway("pale", "bale")); 
      assertFalse(Problem_1_5.oneEditAway("pale", "bake")); 
   }
}
