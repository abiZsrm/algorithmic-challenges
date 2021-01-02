package prac02_Linked.Lists.Test;

import org.junit.Test;

import prac02_Linked.Lists.Problem_2_5;
import test.utlity.Output;
import utility.Node;

public class Problem_2_5_Test
{
   @Test
   public void testSumList()
   {
      // List 1.
      Node list1 = new Node(null, 7); 
      list1.next = new Node(null, 1); 
      list1.next.next = new Node(null, 6); 
      
      // List 2. 
      Node list2 = new Node(null, 5); 
      list2.next = new Node(null, 9); 
      list2.next.next = new Node(null, 2);
      
      // Sum List
      Output.printList(Problem_2_5.sumList(list1, list2));
   }
   
   @Test
   public void testSumListRecurse()
   {
      // List 1. 
      Node list1 = new Node(null, 6); 
      list1.next = new Node(null, 1); 
      list1.next.next = new Node(null, 7);
      
      // List 2. 
      Node list2 = new Node(null, 2); 
      list2.next = new Node(null, 9); 
      list2.next.next = new Node(null, 5); 
      
      // Sum List In Reverse. 
      Node result = Problem_2_5.sumListRecurse(list1, list2); 
      Output.printList(result);
   }
}
