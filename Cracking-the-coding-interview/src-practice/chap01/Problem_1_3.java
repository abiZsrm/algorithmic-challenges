package chap01;

/**
 * (11.15.2019)
 * 
 * URLify: Write a method to replace all spaces in a string with '%20'. You may
 * assume that the string has sufficient space at the end to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you could perform
 * this operation in place.)
 * 
 * Example
 * Input: "Mr John Smit    ", 13
 * Output: "Mr%20John%20Smith"
 */
public class Problem_1_3
{
   public static void main(String[] args)
   {                
      String input = "Mr John Smith     "; 
      int trueLength = 13;
      
      System.out.println(urlIfy(input, trueLength));
   }
   
   public static String urlIfy(String input, int trueLength)
   {
	   
	   return null; 
   }
}
