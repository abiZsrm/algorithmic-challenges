package utility;

import prac10_Sorting.Searching.Test.Node;

public class Tree
{
   /***
    * Method to create a binary search tree. 
    * 
    * @param nodes list of node values. 
    * @return the root of the binary search tree. 
    */
   public static Node generateBinarySearchTree(int[] nodes)
   {
      int START_INDEX = 0; 
      Node root = new Node( nodes[START_INDEX] );
      
      for(int i=1; i<nodes.length; i++)
      {
         treeInsert(root, new Node(nodes[i])); 
      }
      
      return root; 
   }
   
   /***
    * Method to insert the node to the tree. 
    * 
    * @param root of the tree. 
    * @param nodeToInsert - node to be inserted. 
    * @return
    */
   public static Node treeInsert(Node root, Node nodeToInsert)
   {
      if(root == null)
      {
         return nodeToInsert; 
      }
      
      if(nodeToInsert.value <= root.value)
      {
        /*
         * Insert the node to the left of the root
         * if the value of the node is less than the
         * root. 
         */
         root.left = treeInsert(root.left, nodeToInsert); 
      }
      else
      {
         /*
          * Insert the node to the right of the root
          * if the value of the node is greater than
          * the root. 
          */
         root.right = treeInsert(root.right, nodeToInsert); 
      }
      
      return root; 
   }
   
   /**
    * Traverse the tree. 
    * @param root
    */
   public static void treeTraverse( Node root )
   {
      StringBuilder output = new StringBuilder();  
      treeTraverse( root, output );
      System.out.println( "Printing inOrder traversal of the tree." ); 
      System.out.println( output.toString() ); 
   }
   
   private static void treeTraverse( Node root, StringBuilder output )
   {
      if(root == null)
      {
         return; 
      }
      
      treeTraverse( root.left, output );
      output.append( Integer.toString(root.value).concat(",") ); 
      treeTraverse( root.right, output ); 
   }
   
   /**
    * Print subTree of the given node with an inOrderTraversal. 
    */
   public static void printSubTree(Node node)
   {
      StringBuilder output = new StringBuilder(); 
      printSubTree( node, output ); 
      System.out.println( output.toString() ); 
   }
   
   private static void printSubTree( Node node, StringBuilder output )
   {
      if( node == null )
      {
         return; 
      }
      
      printSubTree(node.left, output);
      output.append(Integer.toString(node.value).concat(",")); 
      printSubTree(node.right, output);
   }
   
   /**
    * Search Node. 
    */
   public static Node retrieveNodeWithValue( Node root, int value )
   {
      if(root == null)
      {
         return null; 
      }
      
      if(root.value == value)
      {
         return root; 
      }
      
      /*
       * I am beginning to leverage the local variables in the stack. 
       * [Matrix music plays]. :-D
       */
      Node leftSubTree = retrieveNodeWithValue(root.left, value); 
      if(leftSubTree != null)
      {
         return leftSubTree; 
      }
      
      Node rightSubTree = retrieveNodeWithValue(root.right, value);
      if(rightSubTree != null)
      {
         return rightSubTree; 
      }
      
      return null; 
   }
}
