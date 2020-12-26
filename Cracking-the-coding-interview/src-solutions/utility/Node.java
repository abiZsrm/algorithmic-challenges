package utility;

public class Node<T>
{
   public Node next; 
   public T value; 
   
   public Node(Node next, T value)
   {
      this.next = next; 
      this.value = value; 
   }
}
