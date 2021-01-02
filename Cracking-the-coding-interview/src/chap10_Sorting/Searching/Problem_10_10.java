package chap10_Sorting.Searching;

import java.util.ArrayList;

import prac10_Sorting.Searching.Test.Node;

/**
 * (11.06.2019)
 * 
 * Rank from Stream: Imagine you are reading in a stream of integers.
 * Periodically, you wish to be able to look up the rank of a number x (the
 * number of values less than or equal to x). Implement the data structures and
 * algorithms to support these operations. That is, implement the method track
 * (int x), which is called when each number is generated, and the method
 * getRankOfNumber (int x), which returns the number of values less than or
 * equal to x (not including x itself)
 * 
 * Example 
 * 
 * Stream(in order of appearance): 5, 1, 4, 4, 5, 9, 7, 13, 3
 * getRankOfNumber(1) = 0 
 * getRankOfNumber(3) = 1 
 * getRankOfNumber(4) = 3
 * 
 * (Need a sunday for this). 
 */
public class Problem_10_10
{
   /**
    * Approach #1. 
    * 1. Create a binary search tree. 
    * 2. Count the number of nodes in its descendents.
    */
   public static Node nodeInsert(Node root, Node nodeToBeInserted)
   {
      if(root == null)
      {
         return nodeToBeInserted; 
      }
      
      if(nodeToBeInserted.value <= root.value)
      {
         root.left = nodeInsert(root.left, nodeToBeInserted);
      }
      else
      {
         root.right = nodeInsert(root.right, nodeToBeInserted);
      }
      
      return root; 
   }
   
   public static void countNodes(Node node, ArrayList<Node> nodes)
   {
      if(node == null)
      {
         return;  
      }
      
      nodes.add(node); 
      countNodes(node.left, nodes);
      countNodes(node.right, nodes);
   }
   
   /**
    * (11.07.2019)
    * 
    * Textbook solution. 
    * 
    * Improvisation in the traversal technique. 
    * To find the rank of a number, we could do an in-order traversal, keeping 
    * a counter as we traverse. The goal is that, by the time we find x, counter
    * will equal the number of elements less than x. 
    * 
    * As long as we are moving left during searching for x, the counter will not 
    * change because all the values we are skipping on the right side are greater
    * than x. 
    */
   
   
}
