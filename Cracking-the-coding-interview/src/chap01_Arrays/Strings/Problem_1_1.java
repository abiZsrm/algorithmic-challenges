package chap01_Arrays.Strings;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique
 * characters.
 * 
 * Follow Up #1: What if you cannot use additional data structures.
 * 
 * (11.14.2019)
 */
public class Problem_1_1
{
   public static boolean isUnique(String input)
   {
      char[] RADIX = new char[255];

      for (int i = 0; i < input.length(); i++)
      {
         RADIX[input.charAt(i)]++;
      }

      /**
       * Traverse through the additional data structure to figure out if the
       * counter of any character is 2 which would indicate that it is a
       * duplicate.
       */
      for (int i = 0; i < RADIX.length; i++)
      {
         if (RADIX[i] == 2)
         {
            return false;
         }
      }

      return true;
   }

   /**
    * Improvisation: We could further improvise this by sorting and then
    * checking.
    * 
    * TODO - Follow Up #2: Trying to do the same without using an additional data
    * structure.
    */
   public static boolean isUniqueFollowUp(String input)
   {
      char[] inputCharArr = input.toCharArray();

      for (int i = 0; i < inputCharArr.length; i++)
      {
         for (int j = 0; j < inputCharArr.length; j++)
         {
            if (i == j)
            {
               continue;
            }
            else
            {
               if (inputCharArr[i] == inputCharArr[j])
               {
                  return false;
               }
            }
         }
      }

      return true;
   }
}
