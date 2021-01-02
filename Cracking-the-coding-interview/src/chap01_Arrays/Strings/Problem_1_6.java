package chap01_Arrays.Strings;

/**
 * String Compression: Implement a method to perform basic string compression
 * using the counts of repeated characters. For example, the string aabcccccaaa
 * would become a2b1c5a3. If the "compressed" string would not become smaller
 * than the original string, your method should return the original string. You
 * can assume the string has only uppercase and lowercase letters (a-z).
 * 
 * (11.18.2019). 
 */
public class Problem_1_6
{
   public static String compressInputString(String inputStr)
   {
      char[] inputStrCharArr = inputStr.toCharArray();
      StringBuilder compressedStr = new StringBuilder();

      int i = 0;
      int j = i + 1;
      int duplicateCount = 1;

      while (j < inputStrCharArr.length)
      {
         if (inputStrCharArr[i] == inputStrCharArr[j])
         {
            duplicateCount++;
         }
         else
         {
            compressedStr.append(inputStrCharArr[i])
                         .append(duplicateCount);
            i = j;
            duplicateCount = 1;
         }

         j++;
      }
      
      /*
       * Appending the last character. 
       */
      compressedStr.append(inputStrCharArr[i])
                   .append(duplicateCount); 

      return compressedStr.toString();
   }
}
