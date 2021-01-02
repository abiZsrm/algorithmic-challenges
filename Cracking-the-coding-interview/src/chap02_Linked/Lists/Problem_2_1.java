package chap02_Linked.Lists;

import java.util.HashSet;

import utility.Node;

/**
 * Remove Dups: Write code to remove duplicates from an unsorted linked list.
 * 
 * Follow Up. How would you solve this problem if a temporary buffer is not
 * allowed ?
 * 
 * (11.20.2019)
 */
public class Problem_2_1
{
   /**
    * Method to remove the duplicates from the given linked list. 
    * 
    * @param linkedList - a given input. 
    */
   public static void removeDuplicates(Node<Integer> linkedList)
   {
      HashSet<Integer> nodeTracker = new HashSet<Integer>(); 
      
      while(linkedList != null)
      {
         if(nodeTracker.contains(linkedList.value))
         {
            linkedList.value = (Integer) linkedList.next.value; 
            linkedList.next = linkedList.next.next; 
         }
         else
         {
            nodeTracker.add(linkedList.value); 
         }
         
         linkedList = linkedList.next; 
      }
   }
   
   /**
    * FOLLOW UP: How would you solve this problem if a temporary 
    * buffer is not allowed ? 
    */
   public static void removeDuplicatesWithoutTempBuffer(Node linkedList)
   {
      Node ptr1 = linkedList; 
      Node ptr2 = linkedList.next; 

      do
      {
         // Initialize ptr2 || Re-Initialize during second iteration of ptr1. 
         ptr2 = ptr1.next; 
         
         while(ptr2 != null)
         {
            /*
             * If there exists a duplicate then remove
             * the duplicate using the ptr1. 
             */
            if(ptr1.value == ptr2.value)
            {
               ptr1.value = ptr1.next.value; 
               ptr1.next = ptr1.next.next; 
               break; 
            }
            
            // Increment ptr2. 
            ptr2 = ptr2.next; 
         }
         
         // Increment ptr1 - Move to next node. 
         ptr1 = ptr1.next;
         
      }while(ptr1.next != null); 
   }
}
