package chap8_Recursion.DP;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * (10.30.2019)
 * 
 * Permutation with Dupes: Write a method to compute all permutations of a
 * string whose characters are not necessarily unique. The list of
 * permutations should not have duplicates.
 * 
 * a. Struggled with this problem. 
 * b. Had the basic idea but was constantly doubting due to issues with
 *    other simple area of the code. 
 *    
 * (Struggled)
 */
public class Problem_8_8
{
   public static ArrayList<String> generatePermWithDupes(String input)
   {
      /*
       * TODO: Figure out if hashtable would be the right selection since
       * it does not preserve order. 
       */
      Hashtable<Character, Integer> frequencyTable = generateFreqTable(input); 
      ArrayList<String> allPermutations = new ArrayList<String>(); 
      
      generateAllPermWithDupes(frequencyTable, allPermutations, input.length(), "", input);
      return allPermutations; 
   }
   
   public static void generateAllPermWithDupes( Hashtable<Character, Integer> frequencyTable, 
                                                ArrayList<String> allPermutations, 
                                                int strLen, 
                                                String strUnderConstruction, 
                                                String input)
   {
      if(strLen == 0)
      {
         allPermutations.add(strUnderConstruction.toString());
         return; 
      }
      
      /**
       * What is the issue here. Would concurrent modification lead 
       * to issues. 
       * 
       * ISSUE: The issue was with the stringbuilder since it was not getting re-initialized 
       * it was being constantly appended over and over again. 
       */
      for(Character c : frequencyTable.keySet() )
      {
         if(frequencyTable.get(c) != 0)
         {
            frequencyTable.put(c, frequencyTable.get(c) - 1); 
            
            generateAllPermWithDupes(frequencyTable, allPermutations, strLen - 1, strUnderConstruction + c, input);
            frequencyTable.put(c, frequencyTable.get(c) + 1); 
         }
      }
   }
   
   private static Hashtable<Character, Integer> generateFreqTable(String input)
   {
      Hashtable<Character, Integer> freqTable = new Hashtable<Character, Integer>(); 
      
      for(int i=0; i<input.length(); i++)
      {
         Character c = input.charAt(i); 
         if(freqTable.containsKey(c))
         {
            freqTable.put(c, freqTable.get(c) + 1);
         }
         else
         {
            freqTable.put(c, 1); 
         }
      }
      
      return freqTable; 
   }
}
