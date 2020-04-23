package com.algos;

public class min_steps {
//	Input: points[m][n] = { {-2, -3,   3}, 
//  			          {-5, -10,  1}, 
//            			  {10,  30, -5} 
//          			};
	static int minInitialPoints(int points[][], int R, int C) {
		// dp[i][j] represents the minimum initial points player
		// should have so that when starts with cell(i, j) successfully
		// reaches the destination cell(m-1, n-1)
		int dp[][] = new int[R][C];
		int m = R, n = C;

		// Base case
		dp[m - 1][n - 1] = points[m - 1][n - 1] > 0 ? 1 : Math.abs(points[m - 1][n - 1]) + 1;

		// Fill last row and last column as base to fill
		// entire table
		for (int i = m - 2; i >= 0; i--)
			dp[i][n - 1] = Math.max(dp[i + 1][n - 1] - points[i][n - 1], 1);
			System.out.println("1=>"+dp[0][0]+" "+dp[0][1]+" "+dp[0][2]);
			System.out.println("1=>"+dp[1][0]+" "+dp[1][1]+" "+dp[1][2]);
			System.out.println("1=>"+dp[2][0]+" "+dp[2][1]+" "+dp[2][2]);
			System.out.println("");
		for (int j = n - 2; j >= 0; j--)
			dp[m - 1][j] = Math.max(dp[m - 1][j + 1] - points[m - 1][j], 1);
			System.out.println("2=>"+dp[0][0]+" "+dp[0][1]+" "+dp[0][2]);
			System.out.println("2=>"+dp[1][0]+" "+dp[1][1]+" "+dp[1][2]);
			System.out.println("2=>"+dp[2][0]+" "+dp[2][1]+" "+dp[2][2]);
			System.out.println("");
		// fill the table in bottom-up fashion
		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				int min_points_on_exit = Math.min(dp[i + 1][j], dp[i][j + 1]);
				dp[i][j] = Math.max(min_points_on_exit - points[i][j], 1);
				System.out.println("3=>"+dp[0][0]+" "+dp[0][1]+" "+dp[0][2]);
				System.out.println("3=>"+dp[1][0]+" "+dp[1][1]+" "+dp[1][2]);
				System.out.println("3=>"+dp[2][0]+" "+dp[2][1]+" "+dp[2][2]);
				System.out.println("");
			}
		}
		System.out.println("4=>"+dp[0][0]+" "+dp[0][1]+" "+dp[0][2]);
		System.out.println("4=>"+dp[1][0]+" "+dp[1][1]+" "+dp[1][2]);
		System.out.println("4=>"+dp[2][0]+" "+dp[2][1]+" "+dp[2][2]);
		return dp[0][0];
	}

	/* Driver program to test above function */
	public static void main(String args[]) {
		int points[][] = { { -2, -3, 3 },
						   { -5, -10, 1 }, 
						   { 10, 30, -5 } };
		int R = 3, C = 3;
		System.out.println("Minimum Initial Points Required: " + minInitialPoints(points, R, C));
	}
}/* This code is contributed by Rajat Mishra */
