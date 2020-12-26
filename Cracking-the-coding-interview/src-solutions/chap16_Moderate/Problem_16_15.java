package chap16_Moderate;

import java.util.HashSet;

/***
 * Master Mind: The Game of Master Mind is played as follows: 
 * 
 * The computer has four slots, and each slot will contain a ball that is 
 * red (R), yellow (Y), green (G) or blue (B). For example, the computer might have
 * RGGB (Slot #1 is red, Slots #2 and #3 are green, Slot #4 is blue). 
 * 
 * You, the user, are tyring to guess the solution. You might for example, guess YRGB. 
 * 
 * When you guess the correct color for the correct slot, you get a "hit". If you guess a color that
 * exists but is in the wrong slot, you get a "pseudo-hit". Note that a slot that is a hit could never count 
 * as a pseudo-hit. 
 * 
 * For example, if the actual solution is RGBY and you guess GGRR, you have one hit and one pseudo-hit. 
 * Write a method that, given a guess and a solution, returns the number of hits and pseudo-hits. 
 */
public class Problem_16_15
{
	public static void main(String[] args) {
		String guess =    "YGGR"; 
		String solution = "RGRY"; 
		calculateHitPseudoHit(guess.toCharArray(), solution.toCharArray());
	}
	public static void calculateHitPseudoHit(char[] guess, char[] solution)
	{
		int hit = 0; 
		int pseudoHit = 0; 
		HashSet<Integer> processIdx = new HashSet<Integer>(); 
		HashSet<Character> guessChar = new HashSet<Character>(); 
		
		for(int i = 0; i < 4; i++)
		{
			if(guess[i] == solution[i])
			{
				hit++; 
			}
			else
			{
				processIdx.add(i); 
			}
		}
		
		// Process Index. 
		for(Integer i : processIdx)
		{
			guessChar.add(guess[i]); 
		}
		
		for(Integer i : processIdx)
		{
			if(guessChar.contains(solution[i]))
			{
				pseudoHit++; 
			}
		}
		
		System.out.println("Hit: " + hit);
		System.out.println("Pseudo Hit: " + pseudoHit);
//		return new int[] {hit, pseudoHit}; 
	}
	
}
