package chap04_Trees.Graphs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utility.Node_T;

public class Problem_4_2_Test
{
   @Test 
   public void testCreateBSTFromSortedArray()
   {
      int[] sortedArray = new int[] {1, 2, 3, 4, 5, 6, 7}; 
      
      /**
       *          (4)
       *       /       \
       *     (2)       (6)
       *    /   \      /  \
       *  (1)   (3)  (5)  (7) 
       */
      Node_T createdBST = Problem_4_2.createBinarySearchTreeFromSortedArray(sortedArray);
      assertTrue(createdBST.value == 4); 
      assertTrue(createdBST.left.value == 2); 
      assertTrue(createdBST.right.value == 6); 
      assertTrue(createdBST.left.left.value == 1); 
      assertTrue(createdBST.left.right.value == 3); 
      assertTrue(createdBST.right.left.value == 5); 
      assertTrue(createdBST.right.right.value == 7); 
   }
}
