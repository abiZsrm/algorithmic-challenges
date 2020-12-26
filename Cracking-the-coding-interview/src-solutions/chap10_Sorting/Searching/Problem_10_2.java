package chap10_Sorting.Searching;

import java.util.Arrays;

/**
 * Group Anagrams: Write a method to sort an array of strings so that all the
 * anagrams are next to each other.
 * 
 * (11.05.2019) - Come back here. 
 * 
 * (11.22.2019) - Attempt #2 - I was originally right. There is indeed usage of a map and list pair. 
 * Textbook uses a combination of the two. They created a new Data Structure Implementation known as 
 * HashMapList<String, String>. Cool right. 
 */
public class Problem_10_2
{
   /*
    * Probable Solution. 
    * a. Edit the comparator to sort the strings.  
    */
   public static void groupAnagrams(String[] strArray)
   {
      Arrays.sort(strArray, Problem_10_2::compareStr); 
   }
   
   /**
    * (Text Solution): Actual logic method. 
    */
   private static int compareStr(String str1, String str2)
   {
      return (sortChars(str1).compareTo(sortChars(str2))); 
   }
   
   /**
    * (Text Solution): Helper Method. 
    */
   private static String sortChars(String str)
   {
      char[] strCharArr = str.toCharArray(); 
      Arrays.sort(strCharArr);
      return new String(strCharArr); 
   }
   
   /**
    * My Solution. 
    */
   private static int compareString(String str1, String str2)
   {
      char[] str1CharArr = str1.toCharArray(); 
      char[] str2CharArr = str2.toCharArray(); 
      
      Arrays.sort(str1CharArr);
      Arrays.sort(str2CharArr); 
      
      /*
       * WARNING! Made a mistake here, assumed that toString() would give
       * an equivalent string but it does not. 
       */
      System.out.println("Printing"); 
      System.out.println("String 1: " + str1CharArr.toString()); 
      System.out.println("String 2: " + str2CharArr.toString()); 
      
      return str1CharArr.toString().compareTo(str2CharArr.toString()); 
   }
}
