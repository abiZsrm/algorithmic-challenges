package chap04_Trees.Graphs;

import utility.Node_T;

/**
 * Minimal Tree: Given a sorted (increasing order) array with unique integer
 * elements, write an algorithm to create a binary search tree with minimal
 * height.
 * 
 * (11.25.2019)
 */
public class Problem_4_2
{
   public static Node_T createBinarySearchTreeFromSortedArray(int[] sortedArray)
   {
      return medianSelection(sortedArray, 0, sortedArray.length, null);
   }

   private static Node_T medianSelection(int[] sortedArray, int low, int high, Node_T root)
   {
      if (low < high)
      {
         int mid = (low + high) / 2;

         if (root == null)
         {
            root = new Node_T(null, null, sortedArray[mid]);
         }
         else
         {

            treeInsert(root, new Node_T(null, null, sortedArray[mid]));
         }
         
         medianSelection(sortedArray, low, mid, root);
         medianSelection(sortedArray, mid + 1, high, root);
      }
      return root;
   }

   private static Node_T treeInsert(Node_T root, Node_T nodeToBeInserted)
   {
      if (root == null)
      {
         return nodeToBeInserted;
      }
      else if (nodeToBeInserted.value <= root.value)
      {
         root.left = treeInsert(root.left, nodeToBeInserted);
      }
      else
      {
         root.right = treeInsert(root.right, nodeToBeInserted);
      }

      return root;
   }
}
