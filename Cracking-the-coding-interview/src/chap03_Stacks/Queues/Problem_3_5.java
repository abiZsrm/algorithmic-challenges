package chap03_Stacks.Queues;

import java.util.Stack;

/**
 * Sort Stack: Write a program to sort a stack such that the smallest items are
 * on the top. You could use an additional temporary stack, but you may not copy
 * the elements into any other data structure (such as an array). The stack
 * supports the following operations: push, pop, peek and isEmpty.
 * 
 * (12.01.2019)
 */
public class Problem_3_5
{
   public static Stack<Integer> sortStack(Stack<Integer> stack)
   {
	   Stack<Integer> tempStack = new Stack<Integer>();
	   tempStack.push(stack.pop()); 
	   
	   while( !stack.isEmpty() )
	   {
		   Integer min = stack.pop(); 
		   
		   while( !tempStack.isEmpty() && min > tempStack.peek() )
		   {
			   stack.push(tempStack.pop()); 
		   }
		   
		   tempStack.push(min); 
	   }
	   
      return tempStack; 
   }
}
