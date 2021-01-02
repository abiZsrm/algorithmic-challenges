package prac04_Trees.Graphs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utility.Node_TG;

public class Problem_4_1_Test
{

   @Test
   public void testRouteBetweenNodes()
   {
     /*
      * Create Graph. 
      *    
      *    d(4) 
      *   /
      * (1)       d(5)
      *   \        |
      *   d(2) -- d(3)
      */
     Node_TG node1 = new Node_TG(1); 
     Node_TG node2 = new Node_TG(2); 
     Node_TG node3 = new Node_TG(3); 
     Node_TG node4 = new Node_TG(4); 
     Node_TG node5 = new Node_TG(5); 
     
     node1.adjNodes.add(node4); 
     node1.adjNodes.add(node2); 
     node2.adjNodes.add(node3); 
     node3.adjNodes.add(node5); 
     
     Node_TG[] graph = new Node_TG[] {node1, node2, node3, node4, node5};
     
     // Verify if path exists between 1 and 5. 
     assertTrue(Problem_4_1.isRouteBetweenNodes(node1, node5, graph));
     
     // Verify if path exists between 2 and 5. 
     assertTrue(Problem_4_1.isRouteBetweenNodes(node1, node5, graph)); 
     
     // Verify if path does not exist between 4 and 5. 
     assertFalse(Problem_4_1.isRouteBetweenNodes(node4, node5, graph)); 
   }
}
