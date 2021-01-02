package chap01_Arrays.Strings;

import java.util.Arrays;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a
 * permutation of the other.
 * 
 * (11.15.2019)
 */
public class Problem_1_2
{
   /**
    * Approach #1: Use an additional data structure to store the count and then
    * compare the count against each other.
    * 
    * Method to check if input1 is a permutation of input2.
    * 
    * @param input1 - String 1.
    * @param input2 - String 2.
    * @return - true, if input1 is a permutation of input2, false otherwise.
    */
   public static boolean checkStr1PermutationOfStr2(String input1, String input2)
   {
      int[] input1Count = characterCount(input1);
      int[] input2Count = characterCount(input2);
      int CHAR_LIMIT = 128;

      for (int i = 0; i < CHAR_LIMIT; i++)
      {
         if (input1Count[i] != input2Count[i])
         {
            return false;
         }
      }

      return true;
   }

   /**
    * Method to return a datastructure that keeps track of the count of array.
    * 
    * @param input - input of type String.
    * @returns - an int[] array representing the count of individual characters
    *          in the input String.
    */
   static int[] characterCount(String input)
   {
      int CHAR_LIMIT = 128;
      int[] CHARACTER_COUNT = new int[CHAR_LIMIT];
      int INPUT_LENGTH = input.length();

      for (int i = 0; i < INPUT_LENGTH; i++)
      {
         CHARACTER_COUNT[input.charAt(i)]++;
      }

      return CHARACTER_COUNT;
   }

   // Approach #2.
   /**
    * Since in a permutation, the words have equivalent set of characters but
    * they are jumbled. If we sort and check for equality then we could say they
    * are a permutation.
    */
   public static boolean checkStr1IsPermutationOfStr2BySorting(String input1, String input2)
   {
      char[] input1Arr = input1.toCharArray();
      char[] input2Arr = input2.toCharArray();

      Arrays.sort(input1Arr);
      Arrays.sort(input2Arr);

      return new String(input1Arr).equals(new String(input2Arr));
   }

}
