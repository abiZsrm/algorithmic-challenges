package chap01_Arrays.Strings;

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
      char[] inputCharArr = input.toCharArray();
      
      int i = trueLength - 1; 
      int j = input.length() - 1;
      
      while( i >= 0)
      {
         if(inputCharArr[i] == ' ')
         {
            inputCharArr[j] = '0';  
            inputCharArr[j - 1] = '2'; 
            inputCharArr[j - 2] = '%';
            
            j = j - 3; 
         }
         else
         {
            inputCharArr[j] = inputCharArr[i]; 
            j--; 
         }
         
         i--; 
      }
      
      /*
       * Erase remaining characters from the start of the 
       * array. 
       */
      while(j >= 0)
      {
         inputCharArr[j--] = ' '; 
      }
      
      return new String(inputCharArr); 
   }
}
