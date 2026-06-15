// There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

// Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

// The test cases are generated so that the answer will be less than or equal to 2 * 109


class Q_3 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        return path(m, n, 0, 0, dp);
    }

    public int path(int m, int n, int currM, int currN, int[][] dp) {
        if (currM == m || currN == n) // out of bound : robot at last row or last column and trying to move down or right respectively
            return 0;

        if (currM == m - 1 && currN == n - 1) // robot at destination
            return 1;

        if (dp[currM][currN] != 0) // if we have already calculated the number of paths from this cell to destination, then return it
            return dp[currM][currN];

        dp[currM][currN] = path(m, n, currM + 1, currN, dp) + path(m, n, currM, currN + 1, dp);

        return dp[currM][currN];
    }
}