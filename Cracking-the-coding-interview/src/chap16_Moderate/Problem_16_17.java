package chap16_Moderate;

/**
 * Contiguous Sequence: You are given an array of integers (both positive and negative). Find the continguous
 * sequence with the largest sum. Return the sum. 
 * EXAMPLE
 * Input: 2, -8, 3, -2, 4, -10. 
 * Output: 5 (i.e., {3, -2, 4})
 */
public class Problem_16_17
{
	public static void main(String[] args) 
	{
		int[] input = { 2, -8, 3, -2, 4, -10 }; 
		System.out.println(calculateContigousSequence(input));  
	}
	
	public static int calculateContigousSequence(int[] nums)
	{
		int currSum = nums[0]; 
		int maxSum = currSum; 
		
		for(int i = 1; i<nums.length; i++)
		{
			if(currSum + nums[i] > nums[i])
			{
				currSum = currSum + nums[i]; 
			}
			else
			{
				currSum = nums[i]; 
			}
			
			if(currSum > maxSum)
			{
				maxSum = currSum; 
			}
		}
		
		return maxSum; 
	}
}
