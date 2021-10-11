package com.leetcode.medium;

public class UniquePathsII {
    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println(uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
        System.out.println(uniquePathsWithObstacles(new int[][]{{0, 0, 0}}));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];
        return findUniquePath(row, col, 0, 0, obstacleGrid, dp);
    }

    public static int findUniquePath(int row, int col, int currRow, int currCol, int[][] obstacleGrid, int[][] dp) {

        if (currRow == row || currCol == col || obstacleGrid[currRow][currCol] == 1)
            return 0;

        if (currRow == row - 1 && currCol == col - 1) {
//            if (obstacleGrid[currCol][currCol] == 1) return 0;
            return 1;
        }

        return dp[currRow][currCol] = findUniquePath(row, col, currRow + 1, currCol, obstacleGrid, dp) +
                findUniquePath(row, col, currRow, currCol + 1, obstacleGrid, dp);
    }
}
