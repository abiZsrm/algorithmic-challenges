package prac04_Trees.Graphs;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

import utility.Node_T;

public class Problem_4_3_Test
{
   @Test
   public void testListDepth()
   {
      Node_T node1 = new Node_T(null, null, 1); 
      Node_T node2 = new Node_T(null, null, 2);
      Node_T node3 = new Node_T(null, null, 3); 
      Node_T node4 = new Node_T(null, null, 4); 
      Node_T node5 = new Node_T(null, null, 5); 
      Node_T node6 = new Node_T(null, null, 6); 
      Node_T node7 = new Node_T(null, null, 7); 
      
      /*
       * Binary tree. 
       * 
       *       (1)
       *     /     \
       *   (2)     (3)
       *   /  \     /\
       *  (4) (5) (6) (7)
       */
      node1.left = node2; 
      node1.right = node3; 
      node2.left = node4; 
      node2.right = node5; 
      node3.left = node6; 
      node3.right = node7;
      
      // There would be 3 lists. 
      assertTrue(Problem_4_3.getLinkedListDepth(node1).size() == 3); 
   }
}
