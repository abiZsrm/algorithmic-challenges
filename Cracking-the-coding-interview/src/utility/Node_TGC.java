package utility;

import java.util.HashMap;

/**
 * Node specific to Trees & Graphs 
 * with value of type Character. 
 */
public class Node_TGC
{
   public Character value; 
   public HashMap<Character, Node_TGC> dependencies; 
   
   public Node_TGC(Character value)
   {
      this.value = value; 
      this.dependencies = new HashMap<Character, Node_TGC>();
   }
   
   public String getValue()
   {
	   return this.value.toString(); 
   }
}
