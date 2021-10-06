package com.leetcode.medium;

public class MinimumPathSum {
    public static void main(String[] args) {
        int result = minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}});
        System.out.println(result);
    }

    public static int minPathSum(int[][] grid) {
        int[][] sums = new int[grid.length][grid.length];
        return findSumMemo(grid, grid.length - 1, grid[0].length - 1, sums);
    }

    private static int findSumMemo(int[][] grid, int level, int index, int[][] sums) {
        if (level == 0 && index == 0) {
            return sums[level][index] = grid[level][index];
        }

        if (level < 0 || index < 0) {
            return 0;
        }

        if (sums[level][index] != 0)
            return sums[level][index];

//        int down = Integer.MAX_VALUE;
//        int right = Integer.MAX_VALUE;

//        if (level + 1 < grid.length)
//        int down = findSumMemo(grid, level - 1, index, sums);
//        if (index + 1 < grid[0].length)
//        int right = findSumMemo(grid, level, index - 1, sums);

        sums[level][index] = grid[level][index] + Math.min(
                findSumMemo(grid, level - 1, index, sums),
                findSumMemo(grid, level, index - 1, sums)
        );
        return sums[level][index];
    }

    private static int findSum(int[][] grid, int level, int index, int[][] sums) {
        if (level == grid.length - 1 && index == grid.length - 1)
            return sums[level][index] = grid[level][index];

        int down = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        if (level + 1 < grid.length)
            down = findSum(grid, level + 1, index, sums);

        if (index + 1 < grid.length)
            right = findSum(grid, level, index + 1, sums);

        sums[level][index] = grid[level][index] + Math.min(
                down, right
        );
        return sums[level][index];
    }
}
