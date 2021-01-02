package prac04_Trees.Graphs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utility.Node_T;

public class Problem_4_4_Test
{
   @Test
   public void testCheckBalanced()
   {
      /*
       * Unbalanced Tree as differences in height is 2. 
       *     (1)
       *    /   \
       *  (2)   (5)
       *    \
       *    (3)
       *     /
       *    (4)
       */
      Node_T node1 = new Node_T(null, null, 1); 
      Node_T node2 = new Node_T(null, null, 2); 
      Node_T node3 = new Node_T(null, null, 3); 
      Node_T node4 = new Node_T(null, null, 4); 
      Node_T node5 = new Node_T(null, null, 5); 
      
      node1.left = node2; 
      node1.right = node5; 
      node2.right = node3; 
      node3.left = node4; 
      
      // Verify if the tree is un-balanced. 
      assertFalse(Problem_4_4.isBalanced(node1)); 
      
      /*
       * Balanced Tree as the differences in height is just 1. 
       *       (6)
       *     /     \
       *   (7)     (8)
       *   /      /   \
       * (9)   (10)  (11) 
       */
      Node_T node6 = new Node_T(null, null, 6); 
      Node_T node7 = new Node_T(null, null, 7); 
      Node_T node8 = new Node_T(null, null, 8); 
      Node_T node9 = new Node_T(null, null, 9); 
      Node_T node10 = new Node_T(null, null, 10); 
      Node_T node11 = new Node_T(null, null, 11); 
      
      node6.left = node7; 
      node6.right = node8; 
      node7.left = node9; 
      node8.left = node10; 
      node8.right = node11; 
      
      // Verify if the tree is balanced. 
      assertTrue(Problem_4_4.isBalanced(node6)); 
   }
}
