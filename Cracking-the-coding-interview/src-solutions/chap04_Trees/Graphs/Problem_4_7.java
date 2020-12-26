package chap04_Trees.Graphs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import utility.Dependencies;
import utility.Node_TGC;

/**
 * Build Order: You are given a list of projects and a list of dependencies
 * (which is a list of pairs of projects, where the second project is dependent
 * on the first project). All of a project's dependencies must be built before
 * the project is. Find a build order that will allow the projects to be built.
 * If there is no valid build order, return an error.
 * 
 * EXAMPLE 
 * Input: 
 * projects: a, b, c, d, e, f. 
 * dependencies: (a, d), (f, b), (b,d), (f, a), (d, c)
 * 
 * Output: f, e, a, b, d, c
 * 
 * (11.30.2019)
 */
public class Problem_4_7
{
   public static String identifyBuildOrder( List<Node_TGC> projectList, 
		   								    List<Dependencies> dependencies )
   {
	   Node_TGC[] buildOrder = new Node_TGC[projectList.size()]; 
	   
	   // Populate Dependencies. 
	   populateDependencies(dependencies); 
	   
	   for(int index=0; index<buildOrder.length; index++)
	   {
		   // Identify and store independent nodes.
		   storeIndependentNodes(buildOrder, index, projectList);
		   
		   // Remove the independent node from all the graph. 
		   removeIndependentNodeFromProject(buildOrder[index], projectList);
	   }
	   
	   // Construct the string and return the build Order. 
      return constructOutput(buildOrder); 
   }
   
   private static String constructOutput(Node_TGC[] buildOrder)
   {
	   List<Node_TGC> list = Arrays.asList(buildOrder); 
	   return list.stream()
		       .map(Node_TGC::getValue)
		   	   .collect(Collectors.joining(",")); 
   }
   
   private static void removeIndependentNodeFromProject(Node_TGC nodeToRemove, List<Node_TGC> projectList)
   {
	   for( Node_TGC node : projectList)
	   {
		   if(node.dependencies.containsKey(nodeToRemove.value))
		   {
			  node.dependencies.remove(nodeToRemove.value); 
		   }
	   }
   }
   
   private static void storeIndependentNodes(Node_TGC[] buildOrder, int index, List<Node_TGC> projectList)
   {
	  Node_TGC independentNode = null; 
	   
	  for(Node_TGC node : projectList)
	  {
		 if(node.dependencies.size() == 0)
		 {
			 independentNode = node; 
			 break; 
		 }
	  }
	  
	  buildOrder[index] = independentNode; 
	  
	  // Remove the independent node from the linked list. 
	  projectList.remove(buildOrder[index]); 
   }
   
   private static void populateDependencies( List<Dependencies> dependencies)
   {
	   for(Dependencies dependency : dependencies)
	   {
		   dependency.node.dependencies
		   			 .put( dependency.dependent.value, dependency.dependent );  
	   }
   }
}
