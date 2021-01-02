package chap02_Linked.Lists;

import utility.Node;

/**
 * Partition: Write code to partition a linked list around a value x, such that
 * all nodes less than x come before all nodes greater than or equal to x. If x
 * is contained within the list, the values of x only need to be after the
 * elements less than x (see below). The partition element x could appear
 * anywhere in the right partition; it does not need to appear between the left
 * and right partitions.
 * 
 * EXAMPLE 
 * Input: 3-> 5-> 8 -> 5 -> 10 -> 2 -> 1 [Partition = 5] 
 * Output: 3-> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 * 
 * (11.21.2019) - Struggled to comprehend the question. 
 */
public class Problem_2_4_P
{
   /*
    * Assumption: Question does not bring up any space related issues.   
    */
   public static Node partitionLinkedListAroundX(Node linkedList, int partitionValue)
   {
      Node nodesLessThanX = null; 
      Node nodesGreaterThanX = null; 
      Node ptrForMerging = null; 
      Node startPtr = null; 
      
      while(linkedList != null)
      {
         // If the value of node is lesser than the partition. 
         if( ((Integer)linkedList.value) <= partitionValue)
         {
            if(nodesLessThanX == null)
            {
               nodesLessThanX = linkedList; 
               startPtr = nodesLessThanX; 
            }
            else
            {
               nodesLessThanX.next = linkedList; 
               nodesLessThanX = nodesLessThanX.next; 
            }
         }
         else
         {
            // If the value of node is greater than the partition. 
            if(nodesGreaterThanX == null)
            {
               nodesGreaterThanX = linkedList; 
               ptrForMerging = nodesGreaterThanX; 
            }
            else
            {
               nodesGreaterThanX.next = linkedList; 
               nodesGreaterThanX = nodesGreaterThanX.next; 
            }
         }
         
         linkedList = linkedList.next; 
      }
      
      // Terminate List. 
      nodesGreaterThanX.next = null; 
      
      // Merge lists.
      nodesLessThanX.next = ptrForMerging; 
      
      // Return the ptr. 
      return startPtr;
   }
}
