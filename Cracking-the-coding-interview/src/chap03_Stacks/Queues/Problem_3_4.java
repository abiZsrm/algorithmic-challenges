package chap03_Stacks.Queues;

import java.util.Stack;

/**
 * Queue via Stacks: Implement a MyQueue class which implements a queue using
 * two stacks.
 * 
 * (11.30.2019)
 */
public class Problem_3_4
{
   public static MyQueue m_queue = new Problem_3_4().new MyQueue(); 
   
   public class MyQueue
   {
	  private Stack<Integer> firstStack; 
	  private Stack<Integer> secondStack; 
	  
	  public MyQueue()
	  {
		  this.firstStack = new Stack<Integer>(); 
		  this.secondStack = new Stack<Integer>(); 
	  }
	  
      public void enqueue(int element)
      {
    	  firstStack.push(element); 
      }
      
      public int dequeue()
      {
    	  while(!firstStack.isEmpty())
    	  {
    		  secondStack.push(firstStack.pop()); 
    	  }
    	  
    	  return secondStack.pop(); 
      }
   }
   
   public void enqueue(int element)
   {
      Problem_3_4.m_queue.enqueue(element);
   }
   
   public int dequeue()
   {
      return Problem_3_4.m_queue.dequeue(); 
   }
}
