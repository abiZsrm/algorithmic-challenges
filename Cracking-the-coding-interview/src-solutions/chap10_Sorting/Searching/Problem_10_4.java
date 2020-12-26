package chap10_Sorting.Searching;

/*
 * You are given an array-like datastructure Listy which lacks a size method.
 * It does, however have an elementAt(i) method that returns the element at
 * index i in O(1) time. If i is beyond the bounds of the data structure it
 * returns -1. (For this reason, the data structure only supports positive
 * integers). Given a Listy which contains sorted, positive integers, find
 * the index at which an element x occurs. If x occurs multiple times, you
 * may return any index.
 * 
 * (11.22.2019). 
 */
public class Problem_10_4
{
   
   /**
    * Text Solution: Compute length of the list by plugging in exponential values
    * and then perform binary search.  
    */
   
//   /*
//    * Linear search for the element, break out when the element is found. 
//    */
//   public static int retrieveIndexInListy(Listy list, int elementToBeSearched)
//   {
//      int indexCounter = 0; 
//      
//      while(list.elementAt(indexCounter) != -1)
//      {
//         if(list.elementAt(indexCounter) == elementToBeSearched)
//         {
//            return indexCounter; 
//         }
//         
//         indexCounter++; 
//      }
//      
//      return -1; // Not Found.  
//   }
}
