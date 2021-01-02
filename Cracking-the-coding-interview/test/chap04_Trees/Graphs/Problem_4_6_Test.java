package chap04_Trees.Graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utility.Node_T_Successor;



public class Problem_4_6_Test
{
   @Test
   public void testSuccessor()
   {
      Node_T_Successor node15 = new Node_T_Successor(null, null, 15, null); 
      Node_T_Successor node6 = new Node_T_Successor(null, null, 6, null); 
      Node_T_Successor node18 = new Node_T_Successor(null, null, 18, null); 
      Node_T_Successor node3 = new Node_T_Successor(null, null, 3, null); 
      Node_T_Successor node2 = new Node_T_Successor(null, null, 2, null); 
      Node_T_Successor node4 = new Node_T_Successor(null, null, 4, null); 
      Node_T_Successor node7 = new Node_T_Successor(null, null, 7, null); 
      Node_T_Successor node13 = new Node_T_Successor(null, null, 13, null); 
      Node_T_Successor node9 = new Node_T_Successor(null, null, 9, null); 
      Node_T_Successor node17 = new Node_T_Successor(null, null, 17, null); 
      Node_T_Successor node20 = new Node_T_Successor(null, null, 20, null); 
      
      /*
       * Construct Tree. 
       * 
       *             (15)
       *           /      \
       *        (6)        (18)
       *      /     \     /      \
       *    (3)     (7) (17)     (20)
       *    /  \      \
       *  (2)  (4)   (13)
       *               / 
       *             (9)
       */
      node15.left = node6; 
      node15.right = node18; 
      node6.left = node3; 
      node6.right = node7; 
      node6.parent = node15; 
      node18.left = node17; 
      node18.right = node20; 
      node18.parent = node15; 
      node3.left = node2; 
      node3.right = node4; 
      node3.parent = node6; 
      node7.right = node13; 
      node7.parent = node6; 
      node13.left = node9; 
      node13.parent = node7; 
      node9.parent = node13; 
      node17.parent = node18; 
      node20.parent = node18; 
      
      assertEquals(Problem_4_6.findSuccessor(node15), node17);
   }
}
