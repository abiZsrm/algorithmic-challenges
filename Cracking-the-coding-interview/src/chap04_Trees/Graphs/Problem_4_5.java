package chap04_Trees.Graphs;

import utility.Node_T;

/**
 * Validate BST: Implement a function to check if a binary tree is a binary
 * search tree.
 * 
 * (11.29.2019)
 */
public class Problem_4_5
{
   public static boolean validateBST( Node_T root )
   {
		if (root.left == null && root.right == null) 
		{
			return true;
		} else if (root != null && root.left != null && root.right != null 
				&& root.left.value < root.value
				&& root.right.value > root.value) 
		{
			return validateBST(root.left) && validateBST(root.right);
		} else 
		{
			return false;
		}
   }
}
