package prac02_Linked.Lists.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import prac02_Linked.Lists.Problem_2_3;
import test.utlity.ListUtility;
import test.utlity.Output;
import utility.Node;

public class Problem_2_3_Test
{
   @Test
   public void testDeleteArbitraryNode()
   {
      // Create LinkedList
      Node<Character> linkedList = new Node(null, 'a'); 
      linkedList.next = new Node(null, 'b'); 
      linkedList.next.next = new Node(null, 'c'); 
      linkedList.next.next.next = new Node(null, 'd'); 
      linkedList.next.next.next.next = new Node(null, 'e'); 
      linkedList.next.next.next.next.next = new Node(null, 'f'); 
      
      // Delete the node 'c'. 
      Problem_2_3.deleteArbitraryNode(linkedList, 'c');
      Output.printList(linkedList);
      
      // Verify if the node with "value" was removed. 
      assertTrue(ListUtility.checkIfValueDoesNotExist(linkedList, 'c'));  
   }
}
