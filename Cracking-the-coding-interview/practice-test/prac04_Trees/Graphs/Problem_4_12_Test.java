package prac04_Trees.Graphs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap04_Trees.Graphs.Problem_4_12;
import utility.Node_T;

public class Problem_4_12_Test 
{
	
	@Test
	public void testComputePathForSum()
	{
		
		/*
		 * Create Binary Tree. 
		 *       (1)
		 *     /     \
		 *   (2)     (3)
		 *   /  \    /  \ 
		 * (4) (5) (6)  (7) 
		 */
		Node_T node1 = new Node_T(null, null, 1); 
		Node_T node2 = new Node_T(null, null, 2); 
		Node_T node3 = new Node_T(null, null, 3); 
		Node_T node4 = new Node_T(null, null, 4); 
		Node_T node5 = new Node_T(null, null, 5); 
		Node_T node6 = new Node_T(null, null, 6); 
		Node_T node7 = new Node_T(null, null, 7); 
		
		node1.left = node2; 
		node1.right = node3; 
		node2.left = node4; 
		node2.right = node5; 
		node3.left = node6; 
		node3.right = node7; 
		
		// The path sum. 
		final int SUM = 10;
		
		// Validate path for sum. 
		assertTrue(Problem_4_12.computePathForSum(node1, SUM).size() == 2); 
	}
}
