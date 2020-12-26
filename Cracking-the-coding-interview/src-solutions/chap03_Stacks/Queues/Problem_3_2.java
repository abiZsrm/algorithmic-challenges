package chap03_Stacks.Queues;

/**
 * Stack Min: How would you design a stack which, in addition to push and pop.
 * has a function min which returns the minimum element ? Push, pop and min
 * should all operate in O(1) time.
 * 
 * (11.30.2019)
 */
public class Problem_3_2
{
   private static CustomStack m_stack = new Problem_3_2()
                                          .new CustomStack();  
   
   private class CustomStack
   {
      private int[] stackArr; 
      private final int DEFAULT_CAPACITY = 5; 
      
      private int stackPtr; 
      
      // Initialized to the arbitrary element outside bounds. 
      private int minimum = 999; 
      
      public CustomStack()
      {
         stackArr = new int[DEFAULT_CAPACITY]; 
      }
      
      public void push(int elementToPush)
      {
         stackArr[stackPtr++] = elementToPush; 
         
         /**
          * Maintain minimum. 
          */
         if(this.minimum > elementToPush)
         {
        	 minimum = elementToPush; 
         }
      }
      
      public int getMin()
      {
         return this.minimum; 
      }
   }
   
   public static void push(int elementToPush)
   {
      m_stack.push(elementToPush);
   }
   
   public static int getMin()
   {
      return m_stack.getMin(); 
   }
}
