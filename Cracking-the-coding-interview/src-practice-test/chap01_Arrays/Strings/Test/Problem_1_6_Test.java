package chap01_Arrays.Strings.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chap01.Problem_1_6;

public class Problem_1_6_Test
{
   @Test
   public void testStringCompression()
   {
      assertEquals("a2b1c5a3", Problem_1_6.compressInputString("aabcccccaaa")); 
   }
}
