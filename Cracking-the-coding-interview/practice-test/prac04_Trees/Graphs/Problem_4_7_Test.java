package prac04_Trees.Graphs;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import utility.Dependencies;
import utility.Node_TGC;

public class Problem_4_7_Test
{
   public Character value; 
   
   @Test
   public void generateBuildOrder()
   {
      String expectedBuildOrder = "e,f,a,b,d,c"; 
      
      // Create Nodes. 
      Node_TGC nodeA = new Node_TGC('a'); 
      Node_TGC nodeB = new Node_TGC('b'); 
      Node_TGC nodeC = new Node_TGC('c'); 
      Node_TGC noded = new Node_TGC('d'); 
      Node_TGC nodee = new Node_TGC('e'); 
      Node_TGC nodef = new Node_TGC('f');
      
      // Dependencies.
      Dependencies nodeAD = new Dependencies(nodeA, noded); 
      Dependencies nodeFB = new Dependencies(nodef, nodeB); 
      Dependencies nodeBD = new Dependencies(nodeB, noded); 
      Dependencies nodeFA = new Dependencies(nodef, nodeA); 
      Dependencies nodeDC = new Dependencies(noded, nodeC); 
      
      // project list and dependencies. 
      List<Node_TGC> projectList = new LinkedList<Node_TGC>(Arrays.asList(nodeA, nodeB, nodeC, noded, nodee,nodef)); 
      List<Dependencies> dependencies = new LinkedList<Dependencies>(Arrays.asList(nodeAD, nodeFB, nodeBD, nodeFA, nodeDC)); 
      
      
      // Verify if the build order is found as the expected build order. 
      assertEquals(expectedBuildOrder, Problem_4_7.identifyBuildOrder(projectList, dependencies)); 
   }
}
