package chap04_Trees.Graphs;

import java.util.LinkedList;

import utility.Node_TG;

/**
 * Route between Nodes: Given a directed graph, design an algorithm to find out
 * whether there is a route between nodes.
 * 
 * (11.25.2019)
 */
public class Problem_4_1
{
   public static boolean isRouteBetweenNodes( Node_TG srcNode, Node_TG targetNode, 
                                              Node_TG[] graph )
   {
      LinkedList<Node_TG> queue = new LinkedList<Node_TG>(); 
      queue.add(srcNode); 
      
      while( !queue.isEmpty() )
      {
         Node_TG nodeInProcess = queue.pop(); 
         
         for(Node_TG node : nodeInProcess.adjNodes)
         {
            if(node.value == targetNode.value)
            {
               return true; 
            }
            else
            {
               queue.add(node); 
            }
         }
      }
      
      return false; 
   }
}
