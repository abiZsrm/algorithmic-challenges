package chap02_Linked.Lists;

import utility.Node;

/**
 * Return Kth to Last: Implement an algorithm to find the kth to last element of
 * a singly linked list.
 * 
 * (11.20.2019)
 */
public class Problem_2_2
{
   public static Node returnKthToLast(Node linkedList, int kth)
   {
      Node ptr1 = linkedList; 
      Node ptr2 = linkedList; 
      
      // Create k distance between 2 ptrs. 
      while(kth != 0)
      {
         ptr2 = ptr2.next; 
         kth--; 
      }
      
      // Increment ptr2 until it reaches end. 
      while(ptr2 != null)
      {
         ptr1 = ptr1.next; 
         ptr2 = ptr2.next; 
      }
      
      // Return the kth node as head 
      return ptr1; 
   }
}
