package chap02_Linked.Lists.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap02.Problem_2_8;
import utility.Node;

public class Problem_2_8_Test
{
   @Test
   public void testIsCircularList()
   {
      Node<Integer> list1 = new Node<Integer>(null, 1); 
      list1.next = new Node<Integer>(null, 2); 
      list1.next.next = new Node<Integer>(null, 3); 
      list1.next.next.next = new Node<Integer>(null, 4);
      
      // Verify if the list has a loop. 
      assertFalse(Problem_2_8.isCircular(list1)); 
      
      // Create Circular Link. 
      list1.next.next.next.next=  list1.next;
      
      // Verify if the list has a loop. 
      assertTrue(Problem_2_8.isCircular(list1)); 
   }
}
