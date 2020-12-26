package chap04_Trees.Graphs;

import java.util.ArrayList;

import utility.Node_T;

/**
 * First Common Ancestor: Design an algorithm and write code to find the first
 * common ancestor of two nodes in a binary tree. Avoid storing additional nodes
 * in a data structure. 
 * 
 * NOTE: This is not necessarily a binary search tree.
 * 
 * (12.01.2019)
 */
public class Problem_4_8
{
   public static Integer firstCommonAncestor(Node_T root, Node_T node1, Node_T node2)
   {
	  ArrayList<Integer> node1Traversal = new ArrayList<Integer>(); 
	  ArrayList<Integer> node2Traversal = new ArrayList<Integer>(); 
	  
	  preOrderTraversal(root, node1.value, node1Traversal);
	  preOrderTraversal(root, node2.value, node2Traversal); 
	  Integer result = node1Traversal.get(leastCommonAncestor(node1Traversal, node2Traversal) - 1); 
	 
	  return result; 
   }
   
   private static int leastCommonAncestor(ArrayList<Integer> node1List, ArrayList<Integer> node2List)
   {
	   final int MIN_LENGTH = (node1List.size() > node2List.size())?node1List.size():node2List.size();
	   int commonAncestor = - 1; 
	   
	   for(int i=0; i<MIN_LENGTH; i++)
	   {
		   if(node1List.get(i) != node2List.get(i))
		   {
			  commonAncestor = i - 1; 
			  break; 
		   }
	   }
	   
	   if(commonAncestor < 0)
	   {
		   return -1; 
	   }
	   else
	   {
		   return commonAncestor; 
	   }
   }
   
   
   /*
    * Root-Left-Right. 
    */
   private static void preOrderTraversal(Node_T root, Integer node, ArrayList<Integer> list )
   {
	   if(root == null)
	   {
		   return; 
	   }
	   else if(root.value == node)
	   {
		   return; 
	   }
	   
	   list.add(root.value); 
	   preOrderTraversal(root.left, node, list);
	   preOrderTraversal(root.right, node, list);
   }
   
}
