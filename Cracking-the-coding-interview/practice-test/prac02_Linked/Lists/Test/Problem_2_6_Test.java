package prac02_Linked.Lists.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import prac02_Linked.Lists.Problem_2_6;
import utility.Node;

public class Problem_2_6_Test
{
   @Test
   public void testIsPalindromeList()
   {
      // Create List. 
      Node linkedList = new Node(null, 1); 
      linkedList.next = new Node(null, 2); 
      linkedList.next.next = new Node(null, 1); 
      
      // Verify Palindrome. 
      assertTrue(Problem_2_6.isPalindromeList(linkedList)); 
   }
}
