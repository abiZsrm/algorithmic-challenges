package chap01_Arrays.Strings;

import java.util.Hashtable;

/**
 * (11.18.2019)
 * 
 * Palindrome Permutation: Given a String, write a function to check if it is a
 * permutation of a palindrome. A palindrome is a word or phrase that is the
 * same forwards and backwards. A permutation is a rearrangement of letters. The
 * palindrome does not need to be limited to just dictionary words.
 * 
 * EXAMPLE Input: Tact Coa Output: True (permutations: "taco cat", "atco cta",
 * etc.)
 */
public class Problem_1_4
{
   /*
    * Understanding and refining the question
    * - We have to find a permutation given the letters that is a palindrome.
    * - A palindrome is a mirror image meaning that there would be 2 characters 
    *   on both the end with a unique character in the middle which would mean 
    *   that there could only exist one character with count as 1. 
    */
   public static boolean thereExistsAPalindrome(String input)
   {
      Hashtable<Character, Integer> inputCharCount = inputCharCount(input.replaceAll(" ", "").toLowerCase()); 
      int singleCharacterCount = 0; 
      
      for(Character c : inputCharCount.keySet())
      {
         if( inputCharCount.get(c) == 1)
         {
            singleCharacterCount++; 
         }
         
         if(singleCharacterCount > 1)
         {
            return false; 
         }
      }
      
      return true; 
   }
   
   /*
    * Pointers to watch out for. 
    * a. Spaces. 
    * b. Case-Sensitive-ness. 
    * c. containsKey - instead of just contains. 
    * 
    * TODO: 
    * Q. What is the difference between contains & containsKey in Hashtable. 
    */
   private static Hashtable<Character, Integer> inputCharCount(String input)
   {
      Hashtable<Character, Integer> inputCharacterCount = new Hashtable<Character, Integer>(); 
      final int INPUT_LEN = input.length(); 
      Character charInProcess; 
      
      for(int i=0; i<INPUT_LEN; i++)
      {
         charInProcess = input.charAt(i); 
         if(inputCharacterCount.containsKey(charInProcess))
         {
            inputCharacterCount.put(charInProcess, inputCharacterCount.get(charInProcess) + 1); 
         }
         else
         {
            inputCharacterCount.put(charInProcess, 1); 
         }
      }
      
      return inputCharacterCount; 
   }
}
