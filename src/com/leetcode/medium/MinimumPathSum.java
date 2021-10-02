package com.leetcode.medium;

public class MinimumPathSum {
    public static void main(String[] args) {
        int result = minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}});
        System.out.println(result);
    }

    public static int minPathSum(int[][] grid) {
        int[][] sums = new int[grid.length][grid.length];
        return findSumMemo(grid, 0, 0);
    }

    private static int findSumMemo(int[][] grid, int level, int index) {
        if (level > grid.length || index > grid[0].length) return 0;
        if (level == grid.length - 1 || index == grid[0].length - 1) return grid[level][index];


        int min = Integer.MAX_VALUE;
        int down = findSumMemo(grid, level + 1, index);
        int right = findSumMemo(grid, level, index + 1);

        int cost = findSumMemo(grid, level + 1, index) + findSumMemo(grid, level, index + 1);
        int total = grid[level][index] + Math.min(down, right);

//        System.out.println(min);
        return total;
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
