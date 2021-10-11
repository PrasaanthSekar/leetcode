package com.leetcode.medium;

public class NumberofIslands {

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        }));
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    updateIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void updateIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1')
            return;

        grid[i][j] = '2';

        updateIsland(grid, i + 1, j);
        updateIsland(grid, i - 1, j);
        updateIsland(grid, i, j + 1);
        updateIsland(grid, i, j - 1);
    }
}
