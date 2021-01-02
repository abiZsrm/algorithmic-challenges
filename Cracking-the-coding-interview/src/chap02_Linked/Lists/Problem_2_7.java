package chap02_Linked.Lists;

import java.util.HashSet;

import utility.Node;

/**
 * Intersection: Given two (singly) linked lists, determine if the two lists
 * intersect. Return the intersecting node. Note that the intersection is defined
 * based on reference, not value. That is, if the kth node of the first linked
 * list is the exact same node (by reference) as the jth node of the second
 * linked list, then they are intersecting.
 * 
 * (11.21.2019). 
 */
public class Problem_2_7
{
   /***
    * Method to verify if the given two linkedlists intersect. 
    * 
    * @param linkedList1
    * @param linkedList2
    * @return true if the lists intersect, false otherwise. 
    */
   public static boolean doesIntersect(Node linkedList1, Node linkedList2)
   {
      HashSet<Node> list1Nodes = new HashSet<Node>(); 
      
      // Traverse and add nodes to a hashset for linked list 1. 
      while(linkedList1 != null)
      {
         list1Nodes.add(linkedList1); 
         linkedList1 = linkedList1.next;
      }
      
      /*
       *  Traverse all nodes in linked list 2 and verify if any of them
       *  are shared with list 1. 
       */
      while(linkedList2 != null)
      {
         if(list1Nodes.contains(linkedList2))
         {
            return true; 
         }
         
         linkedList2 = linkedList2.next; 
      }
       
      return false; 
   }
}
