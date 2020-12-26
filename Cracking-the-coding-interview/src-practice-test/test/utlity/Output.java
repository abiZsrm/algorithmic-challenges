package test.utlity;

import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Collectors;

import chap8_Recursion.DP.Test.Point;
import utility.Node;

public class Output
{
	/**
	 * Method to print all the "CustomStack" inside the stack. 
	 * 
	 * @param setOfStacks - an input set of stacks. 
	 */
	public static void printAllStack(Stack<CustomStack> setOfStacks)
	{
		String output = ""; 
		int counter = 1; 
		
		while(!setOfStacks.isEmpty())
		{
			output += counter++ + " : " + setOfStacks.pop().toString() + "\n"; 
		}
		
		System.out.println(output); 
	}
	
   /**
    * Method to print the list. 
    * 
    * @param list - an input list. 
    */
   public static void printList(Node list)
   {
      String output = ""; 
      
      while(list != null)
      {
         output += list.value + " -> "; 
         list = list.next; 
      }
      
      if(list == null)
      {
         output += "null"; 
      }
      
      System.out.println(output); 
   }
   
   /**
    * Method to print an array of type Integer. 
    * 
    * @param array - an Integer array. 
    */
   public static void printArray( Integer[] array )
   {
      String output = ""; 
      
      for(int i=0; i<array.length; i++)
      {
         output += array[i] + ", "; 
      }
      
      System.out.println(output);
   }
   
   /**
    * Method to print an 2D array of type primitive int. 
    * 
    * @param array
    */
   public static void printArray( int[][] array)
   {
      String output = ""; 
      
      for(int i=0; i<array.length; i++)
      {
         for(int j=0; j<array[i].length; j++)
         {
            output += array[i][j] + "|";
         }
         
         output += "\n"; 
      }
      
      System.out.println(output); 
   }
   
   
   /**
    * Method to print an arraylist collection. 
    * 
    * @param input - an ArrayList. 
    */
   public static void printList( ArrayList<String> input )
   {
     System.out.println(input.stream()
                             .collect(Collectors.joining(",")));
   }
   
   /**
    * Method to compare 2 lists of data type point. 
    * 
    * @param list1
    * @param list2
    * @return - true if both the lists contains the same points, false otherwise. 
    */
   public static boolean compareList( ArrayList<Point> list1, 
                                      ArrayList<Point> list2 )
   {
      boolean result = true; 
      
      for(Point p : list1)
      {
         if(!list2.contains(p))
         {
            return false; 
         }
      }
      
      return result; 
   }
   
   /**
    * Method to compare 2 lists of data type String. 
    * 
    * @param list1
    * @param list2
    * @return - true if both the lists contains the same points, false otherwise. 
    */
   public static boolean compareListWithTypeString( ArrayList<String> list1, 
                                                    ArrayList<String> list2 )
   {
      boolean result = true; 
      
      for(String str : list1)
      {
         if(!list2.contains(str))
         {
            return false; 
         }
      }
      
      return result; 
   }
   
   /**
    * Method to print a 2 dimensional array of any type.
    *  
    * @param array
    */
   public static void print2DArray(Object[][] array)
   {
      String output = ""; 
      
      for(int i=0; i<array.length; i++)
      {
         for(int j=0; j<array[i].length; j++)
         {
            output += array[i][j] + "|"; 
         }
         
         output += "\n"; 
      }
      
      System.out.println(output);
   }
   
   public static void print2DArray( char[][] array )
   {
      String output = ""; 
      
      for(int i=0; i<array.length; i++)
      {
         for(int j=0; j<array[i].length; j++)
         {
            output += array[i][j] + "|"; 
         }
         
         output += "\n"; 
      }
      
      System.out.println(output); 
   }
}
