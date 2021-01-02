package chap02_Linked.Lists.Test;

import org.junit.Test;

import prac02_Linked.Lists.Problem_2_4;
import test.utlity.Output;
import utility.Node;

public class Problem_2_4_Test
{
   @Test
   public void testPartitionLinkedListAroundX()
   {
      /**
       * Creating the following linkedList. 
       * 
       * 3-> 5-> 8 -> 5 -> 10 -> 2 -> 1 [Partition = 5] 
       */
      Node<Integer> linkedList = new Node<Integer>(null, 3); 
      linkedList.next = new Node(null, 5); 
      linkedList.next.next = new Node(null, 8); 
      linkedList.next.next.next = new Node(null, 5); 
      linkedList.next.next.next.next = new Node(null, 10); 
      linkedList.next.next.next.next.next = new Node(null, 2); 
      linkedList.next.next.next.next.next.next = new Node(null, 1); 
      
      int partitionValue = 5; 
      
      Node partitionedList = Problem_2_4.partitionLinkedListAroundX(linkedList, partitionValue); 
      
      // Print the newly partitioned list.
      Output.printList(partitionedList);
   }
}
