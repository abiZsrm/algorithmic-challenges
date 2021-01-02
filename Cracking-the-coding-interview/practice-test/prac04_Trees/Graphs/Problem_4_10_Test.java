package prac04_Trees.Graphs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap04_Trees.Graphs.Problem_4_10;
import utility.Node_T;

public class Problem_4_10_Test
{
   @Test
   public void checkSubTree()
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
      
      // Is (6, 5, 7) subtree of (4, ...., 7). 
      assertTrue(Problem_4_10.isSubTree(node6, node4)); 
   }
}
