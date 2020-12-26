package chap04_Trees.Graphs;

import java.util.ArrayList;

import utility.Node_T;

/**
 * Paths with Sum: You are given a binary tree in which each node contains a
 * integer value (which might be positive or negative). Design an algorithm to
 * count the number of paths that sum to a given value. The path does not need
 * to start or end at the root or a leaf, but it must go downwards (traveling
 * only from parent nodes to child nodes).
 * 
 * (11.30.2019)
 */
public class Problem_4_12
{
	
	public static ArrayList<String> computePathForSum( Node_T root, int INPUT_SUM )
	{
		ArrayList<String> allPaths = new ArrayList<String>(); 
		
		// Compute all paths. 
		computePathForSum(root, INPUT_SUM, allPaths);
		
		return allPaths; 
	}
	
	
	private static void computePathForSum( Node_T node, int INPUT_SUM, 
										   ArrayList<String> allPaths )
	{
		// In-Order Traversal. 
		if(node == null)
		{
			return; 
		}
		
		computePathForSum(node.left, INPUT_SUM, allPaths);
		computePathForSumFromNode( node, INPUT_SUM, 
								   node.value, allPaths, 
								   ("" + node.value + ","));
		computePathForSum(node.right, INPUT_SUM, allPaths); 
	}
	
	private static void computePathForSumFromNode( Node_T node, int INPUT_SUM, 
												   int pathSum, ArrayList<String> allPaths, 
												   String path)
	{
		if(pathSum == INPUT_SUM)
		{
			allPaths.add(path); 
		}
		else if(pathSum > INPUT_SUM)
		{
			return; 
		}
		else 
		{
			if(node.left != null)
			{
				computePathForSumFromNode( node.left, INPUT_SUM, 
						                   (pathSum + node.left.value), allPaths,
						                   (path + node.left.value + ","));
			}
			
			if(node.right != null)
			{
				computePathForSumFromNode( node.right, INPUT_SUM, 
						                   (pathSum + node.right.value), allPaths,
						                   (path + node.right.value + ","));
			}
		}
	}
}
