package chap04_Trees.Graphs;

import utility.Node_T_Successor;

/**
 * Successor: Write an algorithm to find the "next" node (i.e., in-order
 * successor) of a given node in a binary search tree. You may assume that each
 * node has a link to its parent.
 * 
 * (12.03.2019)
 */
public class Problem_4_6
{
   public static Node_T_Successor findSuccessor(Node_T_Successor node)
   {
      if (node.right != null)
      {
         return findTreeMinimum(node.right);
      }

      Node_T_Successor parent = node.parent;
      // As long as it is right keep moving up. Stop once its left.
      while (parent != null && parent.right == node)
      {
         node = node.parent;
         parent = node.parent;
      }

      return parent;
   }

   public static Node_T_Successor findTreeMinimum(Node_T_Successor node)
   {
      if (node.left == null)
      {
         return node;
      }

      return findTreeMinimum(node.left);
   }
}
