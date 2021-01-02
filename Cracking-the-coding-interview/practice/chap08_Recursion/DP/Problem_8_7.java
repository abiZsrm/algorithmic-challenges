package chap08_Recursion.DP;

import java.util.ArrayList;

/**
 * (10.30.2019)
 * 
 * Permutation without Dupes: Write a method to compute all permutations of a
 * string of unique characters.
 * 
 * (Struggled).
 */
public class Problem_8_7
{
  public static ArrayList<String> generateAllPermutations(String input)
  {
     ArrayList<String> allPermutations = new ArrayList<String>(); 
     
     for(int i=0; i<input.length(); i++)
     {
        allPermutations = generateAllPermutations(allPermutations, input.charAt(i)); 
     }
     
     return allPermutations; 
  }
  
  private static ArrayList<String> generateAllPermutations(ArrayList<String> generatedPerms, char newCharacter)
  {
     if(generatedPerms.size() == 0)
     {
        generatedPerms.add(Character.toString(newCharacter)); 
        return generatedPerms; 
     }
     
     ArrayList<String> newGeneratedPerms = new ArrayList<String>(); 
     
     for(String str : generatedPerms)
     {
        /*
         * For every string in the generated permutation. We do the following: 
         * a. Append the character at every position. 
         * b. Put the newly generated string inside the list.  
         */
        for(int i=0; i<=str.length(); i++)
        {
           StringBuilder sb = new StringBuilder(str); 
           sb.insert(i, newCharacter); 
           newGeneratedPerms.add(sb.toString()); 
        }
     }
     
      return newGeneratedPerms;
   }
}
