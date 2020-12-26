package chap01_Arrays.Strings.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap01.Problem_1_1;

public class Problem_1_1_Test
{
   @Test
   public void testIsUnique()
   {
      assertTrue(Problem_1_1.isUnique("abhi"));
      assertFalse(Problem_1_1.isUnique("abhishek")); 
   }
   
   @Test
   public void testIsUniqueFollowUp()
   {
      assertTrue(Problem_1_1.isUniqueFollowUp("abhi")); 
      assertFalse(Problem_1_1.isUniqueFollowUp("abhishek")); 
   }
}
