package chap16_Moderate;

/**
 * Smallest Difference: Given two arrays of integers, compute the pair of 
 * values (one value in each array) with the smallest (non-negative) difference. 
 * Return the difference. 
 * 
 * Example
 * Input: {1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
 * Output: 3. That is, the pair (11, 8). 
 */
public class Problem_16_6
{
   /*
    * (12.05.2019)
    * NO INTUITION AT ALL. 
    */
	
	public static void main(String[] args) 
	{
		int[] variable = new int[3]; 
		int[] variable2 = {1, 2, 3, 5}; 
		
		variable = variable2; 
		for(int i : variable)
		{
			System.out.println(i); 
		}
		
		int[] result = computePairWithSmallestDiff(new int[]{1,  3, 15, 11, 2}, new int[]{23, 127, 235, 19, 8});
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
	/*
	 * (12.19.2020)
	 * Some Intuition established. 
	 */
	public static int[] computePairWithSmallestDiff(int[] inputArr1, int[] inputArr2)
	{
		int pairNum1 = inputArr1[0]; 
		int pairNum2 = inputArr2[0]; 
		int minSum = Math.abs(pairNum1 - pairNum2); 
		
		for(int i = 0; i < inputArr1.length; i++)
		{
			for(int j = 0; j<inputArr2.length; j++)
			{
				if(Math.abs(inputArr1[i] - inputArr2[j]) < minSum)
				{
					minSum = Math.abs(inputArr1[i] - inputArr2[j]); 
					pairNum1 = inputArr1[i]; 
					pairNum2 = inputArr2[j]; 
				}
			}
		}
		
		return new int[] {pairNum1, pairNum2}; 
	}
}
