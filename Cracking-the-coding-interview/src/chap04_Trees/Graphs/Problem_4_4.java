package chap04_Trees.Graphs;

import utility.Node_T;

/**
 * Check Balanced: Implement a function to check if a binary tree is balanced.
 * For the purposes of this question, a balanced tree is defined to be a tree
 * such that heights of the 2 subtrees of any node never differ by more than
 * one.
 * 
 * (11.29.2019)
 */
public class Problem_4_4
{
   public static boolean isBalanced( Node_T root )
   {
	  if(root == null)
	  {
		  return true; 
	  }
	  
	  int leftHeight = calculateHeight(root.left, 0); 
	  int rightHeight = calculateHeight(root.right, 0); 
	  
	  if(Math.abs(leftHeight - rightHeight) > 1)
	  {
		  return false; 
	  }
	  else
	  {
		 return  isBalanced(root.left) && isBalanced(root.right); 
	  }
	  
   }
   
   private static int calculateHeight( Node_T root, int height )
   {
	   if(root == null)
	   {
		   return (height - 1); 
	   }
	   
	   return Math.max( calculateHeight(root.left, height + 1), 
			   	 		calculateHeight(root.right, height + 1) ); 
   }
}
