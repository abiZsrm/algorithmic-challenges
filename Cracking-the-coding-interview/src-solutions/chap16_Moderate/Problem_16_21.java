package chap16_Moderate;

import java.util.Arrays;

/**
 * Sum Swap: Given two arrays of integers, find a pair of values (one value from each array) that 
 * you can swap to give the two arrays the same sum. 
 * 
 *  Example. 
 *  Input: {4, 1, 2, 1, 1, 2} and {3, 6, 3, 3}
 *  Output: {1, 3}
 *
 */
public class Problem_16_21
{
	public static void main(String[] args) 
	{
		int[] inputArr1 = new int[] {4, 1, 2, 1, 1, 2}; 
		int[] inputArr2 = new int[] {3, 6, 3, 3 }; 
		
		int[] pairs = sumSwap(inputArr1, inputArr2); 
		System.out.println(pairs[0]);
		System.out.println(pairs[1]);
	}
	
	public static int calculateSum(int[] inputArray)
	{
		int totalSum = 0; 
		
		for(int i = 0; i < inputArray.length; i++)
		{
			totalSum += inputArray[i]; 
		}
		
		return totalSum; 
	}
	
	public static int[] sumSwap(int[] inputArr1, int[] inputArr2)
	{
		int[] largeArr = null; 
		int[] smallArr = null; 
		
		int arr1sum = calculateSum(inputArr1); 
		int arr2sum = calculateSum(inputArr2); 
		
		if(arr1sum > arr2sum)
		{
			largeArr = inputArr1;
			smallArr = inputArr2; 
		}
		else
		{
			smallArr = inputArr1; 
			largeArr = inputArr2; 
		}
		
		int diff = Math.abs(arr1sum - arr2sum); 
		int foundPairDiff = diff/2; 
		
		// Sort both the arrays. 
		Arrays.sort(inputArr1);
		Arrays.sort(inputArr2);
		
		int i = 0; 
		int j = 0; 
		
		int[] pairs = new int[2]; 
		while (i < largeArr.length && j < smallArr.length)
		{
			if(Math.abs(largeArr[i] - smallArr[j]) == foundPairDiff)
			{
				pairs[0] = largeArr[i]; 
				pairs[1] = smallArr[j]; 
				return pairs; 
			}
			else if ((largeArr[i] - smallArr[j]) > foundPairDiff)
			{
				j++; 
			}
			else if((largeArr[i] - smallArr[j]) < foundPairDiff)
			{
				i++; 
			}
		}
		
		return pairs; 
	}
}
