package test.utlity;

/*
 * Problem 3.3
 * 
 * (12.01.2019). 
 */
public class CustomStack 
{
	private int[] customStackArr; 
	private static int STACK_CAPACITY; 
	private int customStackPtr; 
	
	public CustomStack(int STACK_CAPACITY)
	{
		CustomStack.STACK_CAPACITY = STACK_CAPACITY; 
		this.customStackArr = new int[STACK_CAPACITY]; 
	}
	
	public CustomStack()
	{
		CustomStack.STACK_CAPACITY = 5; 
		this.customStackArr = new int[CustomStack.STACK_CAPACITY]; 
	}
	
	public void push(int element)
	{
		this.customStackArr[customStackPtr] = element; 
		customStackPtr++; 
	}
	
	public boolean isStackFull()
	{
		return (this.customStackPtr == (CustomStack.STACK_CAPACITY)); 
	}
	
	public int getCurrentStackCapacity()
	{
		return this.customStackPtr + 1; 
	}
	
	public int pop()
	{
		int poppedElement = this.customStackArr[customStackPtr]; 
		this.customStackArr[customStackPtr] = 0; 
		customStackPtr--; 
		
		return poppedElement; 
	}
	
	public String toString()
	{
		String output = "Stack [ "; 
		int i = 0; 
		
		for(i=0; i<customStackArr.length - 1; i++)
		{
			output += customStackArr[i] + ", "; 
		}
		
		output += customStackArr[i] + " ]";
		
		return output; 
	}
}
