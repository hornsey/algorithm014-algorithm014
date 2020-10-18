package Week_09;

/**
 * @author huangtao
 * @date 2020/10/18
 */
public class Q63Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
			return 0;
		}

		int m = obstacleGrid.length, n = obstacleGrid[0].length;
		int[][] dp = new int[m+1][n+1];
		for (int i = 1; i < m+1; i++) {
			for (int j = 1; j < n+1; j++) {
				if (obstacleGrid[i-1][j-1] == 1) {
					dp[i][j] = 0;
				} else if (i == 1 && j == 1) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i-1][j] + dp[i][j-1];
				}
			}
		}
		return dp[m][n];
	}
}
