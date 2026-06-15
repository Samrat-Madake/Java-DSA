// 6. Tiling Problem
/*
Given a floor of dimensions 2 x n and tiles of dimensions 2 x 1, the task is to find the number of ways the floor can be tiled. A tile can either be placed horizontally i.e as a 1 x 2 tile or vertically i.e as 2 x 1 tile. 

Note: Two tiling arrangements are considered different if the placement of at least one tile differs.

Examples :

Input: n = 3
Output: 3
Explanation: We need 3 tiles to tile the board of size 2 x 3.
We can tile in following ways:
1) Place all 3 tiles vertically.
2) Place first tile vertically and remaining 2 tiles horizontally.
3) Place first 2 tiles horizontally and remaining tiles vertically.

Explanation :

At any point we have 2 choices to place the tile:
1. Place the tile vertically, in this case the problem reduces to f(n-1) as one tile is fixed and we need to find for remaining n-1 tiles.

2. Place the tile horizontally, in this case the problem reduces to f(n-2) as two tiles are fixed and we need to find for remaining n-2 tiles.
*/

public class Q_5 {
    
	public int numberOfWays(int n) {
		int[] dp = new int[46];
		
		return func(n, dp);
		
	}
	public int func(int n, int[] dp) {
		// code here
		if (n <= 1) {
			dp[n] = 1;
			return 1;
		}
		
		if(dp[n]!=0)return dp[n];
		
		dp[n] =  func(n - 1,dp) + func(n - 2,dp);
		return dp[n];
	}

    public static void main(String[] args) {
        Q_5 q = new Q_5();
        int n = 10;
        System.out.println(q.numberOfWays(n));
    }
};
