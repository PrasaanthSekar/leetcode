package com.leetcode.easy;

public class IslandPerimeter {
    public static void main(String[] args) {
//        int result = islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}});
        int result = islandPerimeter(new int[][]{{1,0}});
        System.out.println(result);
    }

    public static int islandPerimeter(int[][] grid) {
        if (grid.length == 1 && grid[0].length == 1) return 4;
        int sum = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || i == grid.length - 1) {
                        sum += 1;
                    } else {
                        if (grid[i - 1][j] == 0) sum += 1;
                        if (grid[i + 1][j] == 0) sum += 1;
                    }
                    if (j == 0 || j == grid.length - 1) {
                        sum += 1;
                    } else {
                        if (grid[i][j - 1] == 0) sum += 1;
                        if (grid[i][j + 1] == 0) sum += 1;
                    }
                }
            }
        }
        return sum;
    }
}
