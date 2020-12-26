package chap01_Arrays.Strings;

/**
 * One Away 
 * 
 * There are three types of edits that could be performed on strings
 * 1. insert a character. 
 * 2. Remove a character, or 
 * 3. Replace a character. 
 * 
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * 
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 * 
 * (11.19.2019)
 */
public class Problem_1_5
{
   /**
    * Text book solution. 
    * @param first
    * @param second
    * @return
    */
   public static boolean oneEditAway(String first, String second)
   {
      if(first.length() == second.length())
      {
         return oneEditReplace(first, second); 
      }
      else if(first.length() + 1 == second.length())
      {
         return oneEditInsert(first, second); 
      }
      else if(first.length() - 1 == second.length())
      {
         return oneEditInsert(second, first); 
      }
      
      return false; 
   }
   
   private static boolean oneEditReplace(String s1, String s2)
   {
      boolean foundDifference = false; 
      
      for(int i=0; i<s1.length(); i++)
      {
         if(s1.charAt(i) != s2.charAt(i))
         {
            if(foundDifference)
            {
               return false; 
            }
            
            foundDifference = true; 
         }
      }
      
      return true; 
   }
   
   private static boolean oneEditInsert(String s1, String s2)
   {
      int index1 = 0; 
      int index2 = 0; 
      
      while(index2 < s2.length() && index1 < s1.length())
      {
         if(s1.charAt(index1) != s2.charAt(index2))
         {
            if(index1 != index2)
            {
               return false; 
            }
            
            index2++; 
         }
         else
         {
            index1++; 
            index2++; 
         }
      }
      
      return true; 
   }
   
 
}
