package chap01_Arrays.Strings.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap01_Arrays.Strings.Problem_1_4;

public class Problem_1_4_Test
{
   @Test
   public void testThereExistsAPalindrome()
   {
      String inputPositive = "Tact Coa";
      String inputPositive2 = "Tact Ca";
      String inputNegative = "Tact Co";

      assertTrue(Problem_1_4.thereExistsAPalindrome(inputPositive));
      assertTrue(Problem_1_4.thereExistsAPalindrome(inputPositive2));
      assertFalse(Problem_1_4.thereExistsAPalindrome(inputNegative));
   }
}
