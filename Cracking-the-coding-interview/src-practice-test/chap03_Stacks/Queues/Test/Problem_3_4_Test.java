package chap03_Stacks.Queues.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap03.Problem_3_4;
import chap03.Problem_3_4.MyQueue;

public class Problem_3_4_Test
{
   @Test
   public void testMyQueue()
   {
      MyQueue queue = Problem_3_4.m_queue; 
      queue.enqueue(5);
      queue.enqueue(10);
      
      // Check for First-In-First-Out nature. 
      assertTrue(queue.dequeue() == 5);  
   }
}
