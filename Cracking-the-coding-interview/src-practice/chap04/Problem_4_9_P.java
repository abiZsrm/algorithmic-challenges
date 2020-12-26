package chap04;

import java.util.ArrayList;

/**
 * BST Sequences: A binary search tree was created by traversing through an
 * array from left to right and inserting each element. Given a binary search
 * tree with distinct elements, print all possible arrays that could have led to
 * this tree.
 * 
 *       (2)
 *      /   \
 *    (1)   (3)
 * 
 * Output: {2, 1, 3}, {2, 3, 1}.
 */
public class Problem_4_9_P
{
	/*
	 * Generate all possible combinations. 
	 */
	public static void generateCombination(String input)
	{
		StringBuilder sb = new StringBuilder(); 
		
		for(int i=0; i<input.length(); i++)
		{
			
		}
	}
	
	/**
	 * CHALLENGE - BEFORE/AFTER in 2 digits. 
	 * @param inputUnderConstruction
	 * @param characterToInsert
	 * @return
	 */
	public static ArrayList<String>
			generateCombination( String inputUnderConstruction, char characterToInsert )
	{
		ArrayList<String> possibleCombinations = new ArrayList<String>(); 
		StringBuilder sb = new StringBuilder(inputUnderConstruction); 
		
		for(int i=0; i<inputUnderConstruction.length(); i++)
		{
			sb.insert(i, characterToInsert); 
			possibleCombinations.add(sb.toString()); 
		}
		
		return possibleCombinations; 
	}
}
