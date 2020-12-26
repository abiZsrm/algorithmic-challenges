package chap04_Trees.Graphs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utility.Node_T;

public class Problem_4_8_Test
{
   @Test
   public void testFirstCommonAncestor()
   {
      /*
       * Binary tree. 
       * 
       *        (1)
       *      /      \
       *   (2)       (3)
       *   /  \      /  \
       * (4)  (5)  (6)  (7) 
       *           /      \
       *         (8)      (9)
       */
      Node_T node1 = new Node_T(null, null, 1); 
      Node_T node2 = new Node_T(null, null, 2); 
      Node_T node3 = new Node_T(null, null, 3); 
      Node_T node4 = new Node_T(null, null, 4); 
      Node_T node5 = new Node_T(null, null, 5); 
      Node_T node6 = new Node_T(null, null, 6); 
      Node_T node7 = new Node_T(null, null, 7); 
      Node_T node8 = new Node_T(null, null, 8); 
      Node_T node9 = new Node_T(null, null, 9); 
      
      node1.left = node2; 
      node1.right = node3; 
      node2.left = node4; 
      node2.right = node5; 
      node3.left = node6; 
      node3.right = node7; 
      node6.left = node8; 
      node7.right = node9; 
      
      // The first common ancestor of node 8 and node 9 is node 3. 
      assertTrue(node3.value == Problem_4_8.firstCommonAncestor(node1, node8, node9));
      
      // The first common ancestor of node 4 and node 9 is node 1. 
      assertTrue(node1.value == Problem_4_8.firstCommonAncestor(node1, node4, node9)); 
   }
}
