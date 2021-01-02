package test.utlity;

import java.util.HashSet;

import utility.Node;

public class ListUtility
{
   public static boolean checkIfValueDoesNotExist(Node linkedList, Character value)
   {
      HashSet<Character> nodeTracker = new HashSet<Character>(); 
      Node ptr1 = linkedList; 
      
      while(ptr1 != null)
      {
         if( ((Character)ptr1.value) == value)
         {
            return false; 
         }
         
         ptr1 = ptr1.next; 
      }
      
      return true; 
   }
   
   public static boolean compareListWithValues( Node linkedList1, Node linkedList2 )
   {
      while(linkedList1 != null && linkedList2 != null)
      {
         if(linkedList1.value == linkedList2.value)
         {
            linkedList1 = linkedList1.next; 
            linkedList2 = linkedList2.next; 
         }
         else
         {
            return false; 
         }
      }
      
      return true; 
   }
   
   public static boolean checkIfListHasDuplicates(Node<Integer> linkedList)
   {
      HashSet<Integer> nodeTracker = new HashSet<Integer>(); 
      
      while(linkedList != null)
      {
         if(nodeTracker.contains(linkedList.value))
         {
            return false; 
         }
         else
         {
            nodeTracker.add(linkedList.value); 
         }
         
         linkedList = linkedList.next; 
      }
      
      return true; 
   }
}
