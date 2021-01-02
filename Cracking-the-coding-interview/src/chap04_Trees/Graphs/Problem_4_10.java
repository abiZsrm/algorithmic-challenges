package chap04_Trees.Graphs;

import utility.Node_T;

/**
 * Check SubTree: T1 and T2 are two very large binary trees, with T1 much bigger
 * than T2. Create an algorithm to determine if T2 is a subtree of T1.
 * 
 * A tree T2 is a subtree of T1 if there exists a node n in T1 such that the
 * subtree of n is identical to T2. That is, if you cut off the tree at node n,
 * the two trees would be identical.
 * 
 * (11.30.2019)
 */
public class Problem_4_10
{
   public static boolean isSubTree(Node_T node6, Node_T node4)
   {
	  StringBuilder subTreePath = new StringBuilder(); 
      inOrderTraversal(node6, subTreePath);
      
      StringBuilder treePath = new StringBuilder(); 
      inOrderTraversal(node4, treePath);
      
      return (treePath.toString().contains(subTreePath.toString())); 
   }
   
   private static void inOrderTraversal( Node_T root, StringBuilder sb )
   {
	   if(root == null)
	   {
		   return; 
	   }
	   
	   inOrderTraversal(root.left, sb);
	   sb.append(root.value); 
	   inOrderTraversal(root.right, sb);
   }
}
