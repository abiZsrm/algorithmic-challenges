package chap04_Trees.Graphs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utility.Node_T;

public class Problem_4_5_Test
{
   @Test
   public void testBTIsaBST()
   {
      /*
       * Binary tree that is a binary search tree.
       *  
       *        (4)
       *      /     \
       *    (2)      (6)
       *    /  \     /  \
       *  (1)  (3) (5)  (7)
       */
      Node_T node4 = new Node_T(null, null, 4); 
      Node_T node2 = new Node_T(null, null, 2); 
      Node_T node6 = new Node_T(null, null, 6); 
      Node_T node1 = new Node_T(null, null, 1); 
      Node_T node3 = new Node_T(null, null, 3); 
      Node_T node5 = new Node_T(null, null, 5); 
      Node_T node7 = new Node_T(null, null, 7); 
      
      node4.left = node2; 
      node4.right = node6; 
      node2.left = node1; 
      node2.right = node3; 
      node6.left = node5; 
      node6.right = node7; 
      
      assertTrue(Problem_4_5.validateBST(node4)); 
   }
   
   @Test
   public void testBTIsNotaBST()
   {
      /*
       * Binary tree that is not a binary search tree. 
       * 
       *       (1)
       *      /    \
       *    (2)    (3)
       *   /   \
       * (4)   (5)
       */
      Node_T node1 = new Node_T(null, null, 1); 
      Node_T node2 = new Node_T(null, null, 2); 
      Node_T node3 = new Node_T(null, null, 3); 
      Node_T node4 = new Node_T(null, null, 4); 
      Node_T node5 = new Node_T(null, null, 5); 
      
      node1.left = node2; 
      node1.right = node3; 
      node2.left = node4; 
      node2.right = node5; 
      
      assertFalse(Problem_4_5.validateBST(node1)); 
   }
}
