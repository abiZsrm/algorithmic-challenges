package chap02_Linked.Lists;

import utility.Node;

/**
 * Delete Middle Node: Implement an algorithm to delete a node in the middle
 * (i.e any node that the first and last node, not necessarily the exact middle)
 * of a singly linked list, given only access to that node.
 * 
 * EXAMPLE 
 * Input: The node c from the linked list 
 *         a -> b -> c -> d -> e -> f
 * Result: Nothing is returned, but the new linked list looks like 
 *         a -> b -> d -> e -> f.
 *         
 * (11.20.2019)
 */
public class Problem_2_3
{
   public static void deleteArbitraryNode(Node linkedList, Character nodeValue)
   {
      while(linkedList != null)
      {
         if(linkedList.value == nodeValue)
         {
            linkedList.value = linkedList.next.value; 
            linkedList.next = linkedList.next.next; 
            break; 
         }
         
         linkedList = linkedList.next; 
      }
   }
}
