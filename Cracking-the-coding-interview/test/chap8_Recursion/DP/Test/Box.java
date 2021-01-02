package chap8_Recursion.DP.Test;

import prac08_Recursion.DP.Test.Box;

public class Box
{
   private int width; 
   private int depth; 
   private int height; 
   
   public Box(int width, int depth, int height)
   {
      this.width = width; 
      this.depth = depth; 
      this.height = height; 
   }
   
   public int getWidth()
   {
      return this.width; 
   }
   
   public int getDepth()
   {
      return this.depth; 
   }
   
   public int getHeight()
   {
      return this.height; 
   }
   
   public boolean couldSitOn(Box lowerBox)
   {
      return (    this.width < lowerBox.width
               && this.depth < lowerBox.depth
               && this.height < lowerBox.height ); 
   }
}
