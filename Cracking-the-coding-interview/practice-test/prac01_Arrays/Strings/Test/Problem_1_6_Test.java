package prac01_Arrays.Strings.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import prac01_Arrays.Strings.Problem_1_6;


public class Problem_1_6_Test
{
   @Test
   public void testStringCompression()
   {
      assertEquals("a2b1c5a3", Problem_1_6.compressInputString("aabcccccaaa")); 
   }
}
