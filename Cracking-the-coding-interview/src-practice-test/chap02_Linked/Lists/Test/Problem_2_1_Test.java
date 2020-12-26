package chap02_Linked.Lists.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap02.Problem_2_1;
import test.utlity.ListUtility;
import test.utlity.Output;
import utility.Node;

public class Problem_2_1_Test
{
   @Test
   public void testRemoveDuplicates()
   {
      Node linkedList1 = new Node(null, 1); 
      linkedList1.next = new Node(null, 2); 
      linkedList1.next.next = new Node(null, 4); 
      linkedList1.next.next.next = new Node(null, 4); 
      linkedList1.next.next.next.next = new Node(null, 5); 
      
      Node linkedList2 = new Node(null, 1); 
      linkedList2.next = new Node(null, 2); 
      linkedList2.next.next = new Node(null, 4); 
      linkedList2.next.next.next = new Node(null, 4); 
      linkedList2.next.next.next.next = new Node(null, 5); 
      
      // Before Removing Duplicates. 
      System.out.println("Before Removing Duplicates - Test Remove Duplicates With Temp Buffer"); 
      Output.printList(linkedList1);
      
      // After Removing Duplicates. 
      System.out.println("\nAfter Removing Duplicates"); 
      Problem_2_1.removeDuplicates(linkedList1);
      Output.printList(linkedList1);
      
      // Verify if the list has duplicates. 
      assertTrue(ListUtility.checkIfListHasDuplicates(linkedList1)); 
   }
   
   @Test
   public void testRemoveDuplicatesWithoutTempBuffer()
   {
      Node linkedList1 = new Node(null, 1); 
      linkedList1.next = new Node(null, 2); 
      linkedList1.next.next = new Node(null, 4); 
      linkedList1.next.next.next = new Node(null, 4); 
      linkedList1.next.next.next.next = new Node(null, 5); 
      
      Node linkedList2 = new Node(null, 1); 
      linkedList2.next = new Node(null, 2); 
      linkedList2.next.next = new Node(null, 4); 
      linkedList2.next.next.next = new Node(null, 4); 
      linkedList2.next.next.next.next = new Node(null, 5); 
      
      // Before Removing Duplicates. 
      System.out.println("\nBefore Removing Duplicates - Test Remove Duplicates Without Temp Buffer"); 
      Output.printList(linkedList1);
      
      // After Removing Duplicates. 
      System.out.println("\nAfter Removing Duplicates"); 
      Problem_2_1.removeDuplicatesWithoutTempBuffer(linkedList1);
      Output.printList(linkedList1);
      
      // Verify if the list has duplicates. 
      assertTrue(ListUtility.checkIfListHasDuplicates(linkedList1)); 
   }
}
