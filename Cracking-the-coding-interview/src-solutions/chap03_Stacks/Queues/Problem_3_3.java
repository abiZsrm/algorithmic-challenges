package chap03_Stacks.Queues;

import java.util.Stack;

import test.utlity.CustomStack;

/**
 * Stack of Plates: Imagine a (literal) stack of plates. If the stack gets too
 * high, it might topple. Therefore, in real life, we would likely start a new
 * stack when the previous stack exceeds some threshold, Implement a data
 * structure setOfStacks that mimics this.
 * 
 * SetOfStacks should be composed of several stacks and should create a new
 * stack once the previous one exceeds capacity.
 * 
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to single
 * stack (that is, pop() should return the same values as it would if there were
 * just a single stack).
 * 
 * FOLLOW UP Implement a function popAt(int index) which performs a pop
 * operation on a specific sub-stack.
 * 
 * (12.01.2019) : TODO: Try to understand what the follow up is requesting. 
 */
public class Problem_3_3
{
	public class SetOfStacks 
	{
		private Stack<CustomStack> m_setOfStacks; 
		
		public SetOfStacks()
		{
			this.m_setOfStacks = new Stack<CustomStack>(); 
		}
		
		public void push(int element)
		{
			if(m_setOfStacks.isEmpty())
			{
				m_setOfStacks.push(new CustomStack()); 
				m_setOfStacks.peek().push(element);
			}
			else if(m_setOfStacks.peek().isStackFull())
			{
				m_setOfStacks.push(new CustomStack()); 
				m_setOfStacks.peek().push(element);
			}
			else 
			{
				// Add element to the stack. 
				m_setOfStacks.peek().push(element);
			}
		}
		
		public int pop()
		{
			if(m_setOfStacks.peek().getCurrentStackCapacity() == 1)
			{
				return m_setOfStacks.pop().pop(); 
			}
			else
			{
				return m_setOfStacks.peek().pop(); 
			}
		}
		
		public Stack<CustomStack> getSetOfStacks()
		{
			return this.m_setOfStacks; 
		}
	}
}
