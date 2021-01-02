package chap8_Recursion.DP;

import java.util.ArrayList;

/**
 * (10.29.2019)
 * 
 * Power Set: Write a method to return all subsets of a set. 
 */
public class Problem_8_4
{
   
  public static ArrayList<String> generateAllSubsets(ArrayList<String> input)
  {
     ArrayList<String> generatedSubSets = new ArrayList<String>(); 
     
     for(String strInput : input)
     {
        generatedSubSets = generateSetWithNewCharacter(generatedSubSets, strInput); 
     }
     
     return generatedSubSets; 
  }
  
  private static ArrayList<String> generateSetWithNewCharacter(ArrayList<String> preReqSet, String newCharacter)
  {
     ArrayList<String> generatedSetWithNewInput = new ArrayList<String>(); 
     
     /*
      * Add new character as independent tuple. 
      */
     generatedSetWithNewInput.add(newCharacter); 
     
     for(String str : preReqSet)
     {
        generatedSetWithNewInput.add(str.concat(newCharacter)); 
     }
     
     generatedSetWithNewInput.addAll(preReqSet); 
     
     return generatedSetWithNewInput; 
  }
  
  /**
   * Text Solution #1 - Recursion. 
   */
  public ArrayList<ArrayList<String>> getSubSets(ArrayList<String> set, int index)
  {
     ArrayList<ArrayList<String>> allsubsets; 
     
     if(set.size() == index)
     {
        allsubsets = new ArrayList<ArrayList<String>>(); 
        allsubsets.add(new ArrayList<String>()); // Empty Set. 
     }
     else 
     {
        allsubsets = getSubSets(set, index + 1); 
        String item = set.get(index); 
        
        ArrayList<ArrayList<String>> moreSubSets = new ArrayList<ArrayList<String>>(); 
        for(ArrayList<String> subset : allsubsets)
        {
           ArrayList<String> newSubSet = new ArrayList<String>(); 
           newSubSet.addAll(subset); 
           newSubSet.add(item); 
           moreSubSets.add(newSubSet); 
        }
        
        allsubsets.addAll(moreSubSets); 
     }
     
     return allsubsets; 
  }
  
  /**
   * Text Solution #2 - Combinatorics. 
   * 
   * TODO: Appears too complex. Skipped, will come back in the future. 
   */
}
