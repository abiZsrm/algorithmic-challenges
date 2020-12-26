package utility;

public class Node_T_Successor 
{
	public Node_T_Successor left; 
	public Node_T_Successor right; 
	public Integer value; 
	public Node_T_Successor parent; 
	
	public Node_T_Successor(Node_T_Successor left, Node_T_Successor right, Integer value, Node_T_Successor parent)
	{
		this.left = left; 
		this.right = right; 
		this.parent = parent; 
		this.value = value; 
	}
	
}
