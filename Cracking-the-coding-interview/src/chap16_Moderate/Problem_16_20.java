package chap16_Moderate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * T9: On old cell phones, users typed on a numeric keypad and the phone would
 * provide a list of words that matched these numbers. Each digit mapped to a set of 0-4 
 * letters. Implemented an algorithm to return a list of matching words, given a sequence of digits. 
 * You are provided a list of valid words (provided in whatever datastructure you'd like). 
 * The mappings is shown in the diagram below: 
 * 
 * Refer Page 195 Problem 16.20. 
 *
 */
public class Problem_16_20
{
	public static void main(String[] args) 
	{
		List<String> givenWords = Arrays.asList("tree", "used", "bads"); 
		String digitSequence = "8733"; 
		
		collectValidWordsForSequence(givenWords, digitSequence);
	}
	
	public static void collectValidWordsForSequence(List<String> givenWords, String digitSequence)
	{
		List<String> validWordsForSequence = new ArrayList<String>(); 
		
		givenWords.stream()
				  .filter((String input) -> { return isWordForNumberExists(input, digitSequence); })
				  .forEach(validWordsForSequence::add);
		
		System.out.println("Valid words for sequence: " + digitSequence + " are - ");
		validWordsForSequence.forEach(System.out::println);
	}
	
	public static boolean isWordForNumberExists(String word, String digitSequence)
	{
		HashMap<Character, HashSet<Character>> phonePad = retrievePhoneKey(); 
		
		for(int i = 0; i < word.length(); i++)
		{
			if(!phonePad.get(digitSequence.charAt(i)).contains(Character.valueOf(word.charAt(i))))
			{
				return false; 
			}
		}
		
		return true; 
	}
	
	public static HashMap<Character, HashSet<Character>> retrievePhoneKey()
	{
		HashMap<Character, HashSet<Character>> hmap = new HashMap<Character, HashSet<Character>>(); 
		
		HashSet<Character> hset1 = new HashSet<Character>(); 
		
		HashSet<Character> hset2 = new HashSet<Character>(); 
		hset2.add('a'); 
		hset2.add('b'); 
		hset2.add('c'); 
		
		HashSet<Character> hset3 = new HashSet<Character>(); 
		hset3.add('d'); 
		hset3.add('e'); 
		hset3.add('f'); 
		
		HashSet<Character> hset4 = new HashSet<Character>(); 
		hset4.add('g'); 
		hset4.add('h'); 
		hset4.add('i'); 
		
		HashSet<Character> hset5 = new HashSet<Character>(); 
		hset5.add('j'); 
		hset5.add('k'); 
		hset5.add('l'); 
		
		HashSet<Character> hset6 = new HashSet<Character>(); 
		hset6.add('m'); 
		hset6.add('n'); 
		hset6.add('o'); 
		
		HashSet<Character> hset7 = new HashSet<Character>(); 
		hset7.add('p'); 
		hset7.add('q'); 
		hset7.add('r'); 
		hset7.add('s'); 
		
		HashSet<Character> hset8 = new HashSet<Character>(); 
		hset8.add('t'); 
		hset8.add('u'); 
		hset8.add('v'); 
		
		HashSet<Character> hset9 = new HashSet<Character>(); 
		hset9.add('w'); 
		hset9.add('x'); 
		hset9.add('y'); 
		hset9.add('z'); 
		
		HashSet<Character> hset0 = new HashSet<Character>();  
		
		hmap.put('0', hset0); 
		hmap.put('1', hset1); 
		hmap.put('2', hset2); 
		hmap.put('3', hset3); 
		hmap.put('4', hset4); 
		hmap.put('5', hset5); 
		hmap.put('6', hset6); 
		hmap.put('7', hset7); 
		hmap.put('8', hset8); 
		hmap.put('9', hset9); 
		
		return hmap; 
	}
}
