package chap02_Linked.Lists;

import java.util.ArrayList;

import utility.Node;

/**
 * Palindrome: Implement a function to check if a linked list is a palindrome.
 * 
 * (11.21.2019). 
 */
public class Problem_2_6
{
   public static boolean isPalindromeList(Node linkedList)
   {
      ArrayList<Integer> reverseList = new ArrayList<Integer>();
      populateListInReverse(linkedList, reverseList);
      int startPtr = 0; 
      
      while(linkedList != null)
      {
         if( ((Integer)linkedList.value) != reverseList.get(startPtr) )
         {
            return false; 
         }
         
         startPtr++; 
         linkedList = linkedList.next; 
      }
      
      return true; 
   }

   private static void populateListInReverse(Node linkedList, ArrayList<Integer> reverseList)
   {
      if (linkedList == null)
      {
         return;
      }

      populateListInReverse(linkedList.next, reverseList);
      reverseList.add((Integer) linkedList.value);
   }
}
