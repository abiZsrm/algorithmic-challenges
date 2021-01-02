package chap10_Sorting.Searching.Test;

import org.junit.Test;

import prac10_Sorting.Searching.Test.Node;
import utility.Tree;

public class Problem_10_10_Test
{
   @Test
   public void testNodeInsert()
   {
      int[] nodes = new int[] { 6, 4, 8, 7, 10, 9, 11 }; 
      Node bst = Tree.generateBinarySearchTree(nodes); 
      Tree.treeTraverse(bst);
      
      Node result = Tree.retrieveNodeWithValue(bst, 10); 
      System.out.println(result.value); 
      
      Tree.treeTraverse(result);
   }
}
