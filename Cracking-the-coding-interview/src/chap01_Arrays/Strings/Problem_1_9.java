package chap01_Arrays.Strings;

/**
 * String Rotation: Assume you have a method isSubstring which checks if one
 * word is a substring of another. Given two strings, s1 and s2, write code to
 * check if s2 is a rotation of s1 using only one call to isSubString (e.g.,
 * "waterbottle" is a rotation of "erbottlewat").
 * 
 * (11.18.2019). 
 */
public class Problem_1_9
{
   public static boolean isRotation( String s1, String s2 )
   {
      return s1.concat(s1).contains(s2); 
   }
}
