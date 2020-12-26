package chap02_Linked.Lists;

import utility.Node;

/**
 * Sum Lists: You have two numbers represented by a linked list, where each node
 * contains a single digit. The digits are stored in reverse order, such that
 * the 1's digit is at the head of the list. Write a function that adds the two
 * numbers and returns the sum as a linked list.
 * 
 * EXAMPLE 
 * Input: (7 -> 1 -> 6) + (5 -> 9 -> 2). That is 617 + 295 
 * Output: 2 -> 1 -> 9 that is, 912.
 * 
 * FOLLOW UP: Suppose the digits are stored in forward order. 
 * 
 * EXAMPLE Input: (6 -> 1-> 7) + (2 -> 9 -> 5). That is 617 + 295.
 * Output: 9 -> 1 -> 2. That is 912.
 * 
 * (11.21.2019)
 */
public class Problem_2_5
{
   public static Node sumList( Node list1, Node list2 )
   {
      int num = ((Integer)list1.value) + ((Integer)list2.value);  
      int carry = (num >= 10)?1:0; 
      int newSumValue = (num %10); 
      Node result = new Node(null, newSumValue); 
      
      // Invoke SumList. 
      sumList(list1.next, list2.next, result, carry);
      
      return result; 
   }
   
   private static void sumList(Node list1, Node list2, Node result, int carry)
   {
      /*
       * Terminate when no nodes to process in both list1; list2.
       * (Assumption): 
       */
      if(list1 == null && list2 == null)
      {
         return; 
      }
      
      int num = ((Integer) list1.value) + ((Integer) list2.value) + carry;
      carry = (num >= 10) ? 1 : 0; 
      int newSumValue = (num % 10); 
      result.next = new Node(null, newSumValue); 
      
      sumList(list1.next, list2.next, result.next, carry); 
   }
   
   /**
    * Idea is to store the result and deduce everything else and alter the
    * state.
    * 
    * (Leveraging the stack)
    * 
    * FOLLOW UP: Suppose the digits are stored in forward order.
    * 
    * EXAMPLE Input: (6 -> 1-> 7) + (2 -> 9 -> 5). That is 617 + 295. 
    * Output: 9 -> 1 -> 2. That is 912.
    * 
    * (11.21.2019). 
    */
   public static Node sumListRecurse(Node list1, Node list2)
   {
      Node result = new Node(null, null); 
      sumListRecurse(list1, list2, result);
      return result; 
   }
   
   private static void sumListRecurse(Node list1, Node list2, Node result)
   {
      if( list1.next == null && list2.next == null && result.next == null )
      {
         result.value = ((Integer)list1.value) + ((Integer)list2.value); 
         return; 
      }
      
      // Create Structure. 
      result.next = new Node(null, null); 
      sumListRecurse(list1.next, list2.next, result.next); 
      
      // Deduce from the subsequent node. 
      int carry = ( ((Integer)result.next.value) >= 10) ? 1 : 0; 
      result.next.value = ( ((Integer)result.next.value) % 10); 
      result.value = ((Integer)list1.value) + ((Integer)list2.value) + carry; 
   }
}
