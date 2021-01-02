package utility;

import java.util.ArrayList;

/**
 * Node specific to Trees & Graphs. 
 */
public class Node_TG
{
   public Integer value; 
   public ArrayList<Node_TG> adjNodes; 
   
   public Node_TG(Integer value)
   {
      this.value = value; 
      this.adjNodes = new ArrayList<Node_TG>();
   }
}
