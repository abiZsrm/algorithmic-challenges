package chap02_Linked.Lists;

import utility.Node;

/**
 * Loop Detection: Given a circular linked list, implement an algorithm that
 * returns the node at the beginning of the loop. Definition Circular linked
 * list: A (corrupt) linked list in which a node's next pointer points to an
 * earlier node, so as to make a loop in the linked list. 
 * 
 * EXAMPLE Input: A -> B -> C -> D -> E -> C (the same C as earlier). 
 * Output: C.
 * 
 * (11.21.2019). 
 */
public class Problem_2_8
{
   public static boolean isCircular(Node list1)
   {
      Node ptr1 = list1; 
      Node ptr2 = list1.next.next; 
      
      while(ptr1.next != null && ptr2.next != null && ptr2.next.next != null)
      {
         if( ptr1 == ptr2 )
         {
            return true; 
         }
         
         ptr1 = ptr1.next; 
         ptr2 = ptr2.next.next; 
      }
      
      return false; 
   }
}
