package chap10_Sorting.Searching.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chap10_Sorting.Searching.Problem_10_2;

public class Problem_10_2_Test
{
   @Test
   public void testGroupAnagrams()
   {
      String[] inputStrArray = new String[] {"abhi", "abcd", "aihb"}; 
      final String[] expectedStrArrayOrder = new String[] {"abcd", "abhi", "aihb"}; 
      
      // Invoke Group Anagrams
      Problem_10_2.groupAnagrams(inputStrArray);
      
      //Validate if the array is sorted by anagrams.
      assertEquals(expectedStrArrayOrder, inputStrArray); 
   }
}
