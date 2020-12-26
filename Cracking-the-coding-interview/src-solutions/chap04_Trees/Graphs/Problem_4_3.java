package chap04_Trees.Graphs;

import java.util.ArrayList;

import utility.Node_T;

/**
 * List Depth: Given a binary tree, design an algorithm which creates a linked
 * list of all the nodes at each depth (e.g, if you have a tree with depth D,
 * you will have D linked lists).
 * 
 * (11.28.2019)
 */
public class Problem_4_3
{
   public static ArrayList<ArrayList<Integer>> getLinkedListDepth(Node_T root)
   {
	   ArrayList<ArrayList<Integer>> depthNodesList = new ArrayList<ArrayList<Integer>>();
	   int actualDepth = calculateDepth(root, 0); 
	   
	   // Create structure to store the nodes. 
	   for(int i = 0; i <= actualDepth; i++)
	   {
		   depthNodesList.add(new ArrayList<Integer>()); 
	   }
	   
	   // Store nodes with respect to depth. 
	   storeNodesInDepth(root, 0, depthNodesList);
	   
      return depthNodesList; 
   }
   
   private static void storeNodesInDepth( Node_T root, int depth, 
		   						          ArrayList<ArrayList<Integer>> depthNodesList)
   {
	   if(root == null)
	   {
		   return; 
	   }
	   
	   depthNodesList.get(depth).add(root.value); 
	   storeNodesInDepth(root.left, depth + 1, depthNodesList);
	   storeNodesInDepth(root.right, depth + 1, depthNodesList); 
   }
   
   private static int calculateDepth( Node_T root, int depth)
   {
	   if(root == null)
	   {
		   return depth - 1; 
	   }
	   
	   return Math.max( calculateDepth(root.left, depth + 1), 
			   	 	    calculateDepth(root.right, depth + 1) ); 
   }
}
