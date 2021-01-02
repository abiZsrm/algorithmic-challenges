package chap03_Stacks.Queues;

/**
 * Three In One: Describe how you would use a single array to implement three
 * stacks.
 * 
 * (11.30.2019)
 */
public class Problem_3_1
{
   private int[] singleArr; 
   private static int NUM_STACKS; 
   private static int ARRAY_CAPACITY; 
   
   private int stackOnePtr; 
   private int stackTwoPtr; 
   private int stackThreePtr; 
   
   public Problem_3_1(int ARRAY_CAPACITY)
   {
	   Problem_3_1.NUM_STACKS = 3;
	   Problem_3_1.ARRAY_CAPACITY = ARRAY_CAPACITY; 
       singleArr = new int[NUM_STACKS * ARRAY_CAPACITY]; 
       
       stackOnePtr = 0; 
       stackTwoPtr = ARRAY_CAPACITY; 
       stackThreePtr = 2 * ARRAY_CAPACITY; 
   }
   
   public void push(int stackNum, int value) 
      throws Exception
   {
	   switch(stackNum)
	   {
	     case 1 :  if(stackOnePtr < Problem_3_1.ARRAY_CAPACITY)
				   {
	    	 			singleArr[stackOnePtr++] = value; 
				   }
				   else
				   {
				      throw new Exception("Stack " + stackNum + " is full."); 
				   }
	     		   break;
	     		  
	     case 2 : if(stackTwoPtr < (2 *Problem_3_1.ARRAY_CAPACITY))
	     		  {
	     		  	   singleArr[stackTwoPtr++] = value; 
	     		  }
			      else
			      {
			    	throw new Exception("Stack " + stackNum + " is full.");  
			      }
	              break; 
	     
	     case 3 : if(stackThreePtr < (3 * Problem_3_1.ARRAY_CAPACITY))
			      {
			    	 singleArr[stackThreePtr++] = value;  
			      }
			      else
			      {
			    	 throw new Exception("Stack " + stackNum + " is full."); 
			      }
	              break; 
	   }
   }
   
   public int pop(int stackNum)
      throws Exception
   {
	   int poppedElement = -1; 
	   
	   switch(stackNum)
	   {
		   case 1 : if(stackOnePtr < 0)
				    {
					   throw new Exception("Stack " + stackNum + " is empty."); 
				    }
				    else
				    {
				       poppedElement = singleArr[--stackOnePtr]; 
					   singleArr[stackOnePtr] = 0; 
				    }
		   			break; 
				   
		   case 2 : if(stackTwoPtr < Problem_3_1.ARRAY_CAPACITY)
				    {
					   throw new Exception("Stack " + stackNum + " is empty."); 
				    }
				    else
				    {
				       poppedElement = singleArr[--stackTwoPtr]; 
					   singleArr[stackTwoPtr] = 0; 
				    }
		   			break; 
		   
		   case 3 : if(stackThreePtr < (2 * Problem_3_1.ARRAY_CAPACITY))
					{
					   throw new Exception("Stack " + stackNum + " is empty."); 
					}
					else
					{
					   poppedElement = singleArr[--stackThreePtr]; 
					   singleArr[stackThreePtr] = 0; 
					}
		   			break; 
	   }
	   
	   return poppedElement; 
   }
}
