package chap16_Moderate;

/**
 * Pond Sizes: You have an integer matrix representing a plot of land, where the value 
 * at that location represents the height above sea level. A value of zero indicates water. A 
 * pond is a region of water connected vertically, horizontally, or diagonally. The size of the pond is the total 
 * number of connected water cells. Write a method to compute the sizes of all ponds in the matrix. 
 * Example
 * Input: 
 * 0 2 1 0
 * 0 1 0 1
 * 1 1 0 1
 * 0 1 0 1
 * 
 * Output: 2, 4, 1 (in any order)
 */
public class Problem_16_19
{
	private static int pondConnection; 
	
	public static void main(String[] args) 
	{
		findConnectingPonds();
	}
	
	public static void findConnectingPonds()
	{
		int[][] ponds = new int[][] {
									 {0, 2, 1, 0}, 
									 {0, 1, 0, 1}, 
									 {1, 1, 0, 1}, 
									 {0, 1, 0, 1}
									}; 
		
		int ROW_MAX = ponds.length ; 
		int COL_MAX = ponds[0].length ; 
		
		for(int i = 0; i < ROW_MAX; i++)
		{
			for(int j = 0; j < COL_MAX; j++)
			{
				if(ponds[i][j] == 0)
				{
					calculateConnectingPond(ponds, i, j, ROW_MAX, COL_MAX); 
					System.out.println(pondConnection);
					pondConnection = 0; 
				}
			}
		}
	}
	
	public static boolean calculateConnectingPond(int[][] pond, int row, int col, int ROW_MAX, int COL_MAX)
	{
		if (row >= ROW_MAX 
				|| col >= COL_MAX 
				|| row < 0 
				|| col < 0 
				|| pond[row][col] != 0) {
			return false;
		}

		pond[row][col] = 1;
		pondConnection++;

		return calculateConnectingPond(pond, row - 1, col, ROW_MAX, COL_MAX) // up
				|| calculateConnectingPond(pond, row + 1, col, ROW_MAX, COL_MAX) // down.
				|| calculateConnectingPond(pond, row, col - 1, ROW_MAX, COL_MAX) // left.
				|| calculateConnectingPond(pond, row, col + 1, ROW_MAX, COL_MAX) // right.
				|| calculateConnectingPond(pond, row - 1, col - 1, ROW_MAX, COL_MAX) // up-left.
				|| calculateConnectingPond(pond, row - 1, col + 1, ROW_MAX, COL_MAX) // up-right.
				|| calculateConnectingPond(pond, row + 1, col - 1, ROW_MAX, COL_MAX) // down-left.
				|| calculateConnectingPond(pond, row + 1, col + 1, ROW_MAX, COL_MAX);// down-right.
	}
}
