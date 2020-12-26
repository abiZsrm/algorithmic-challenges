package chap02_Linked.Lists.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chap02.Problem_2_2;
import utility.Node;

public class Problem_2_2_Test
{
   @Test
   public void testReturnKthToLast()
   {
      Node linkedList = new Node(null, 1);
      linkedList.next = new Node(null, 2);
      linkedList.next.next = new Node(null, 3); 
      linkedList.next.next.next = new Node(null, 4); 
      linkedList.next.next.next.next = new Node(null, 5); 
      
      // Verify if the kth node is being returned. 
      assertEquals(linkedList.next.next, Problem_2_2.returnKthToLast(linkedList, 3)); 
   }
}
