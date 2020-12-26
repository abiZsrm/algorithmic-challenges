package chap02_Linked.Lists.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap02.Problem_2_7;
import utility.Node;

public class Problem_2_7_Test
{
   @Test
   public void testIntersectionOfLinkedLists()
   {
      // Create list1. 
      Node list1 = new Node(null, 1); 
      list1.next = new Node(null, 2); 
      list1.next.next = new Node(null, 3); 
      list1.next.next.next = new Node(null, 4); 
      
      // Create list2. 
      Node list2 = new Node(null, 5); 
      list2.next = new Node(null, 6); 
      list2.next.next = new Node(null, 7); 
      list2.next.next.next = new Node(null, 8);

      // Verify if the nodes do not intersect. 
      assertFalse(Problem_2_7.doesIntersect(list1, list2)); 
      
      // Create Intersection between 4 & 8. 
      list1.next.next.next.next = list2.next.next.next;
      
      // Verify if the nodes intersect. 
      assertTrue(Problem_2_7.doesIntersect(list1, list2));
   }
}
