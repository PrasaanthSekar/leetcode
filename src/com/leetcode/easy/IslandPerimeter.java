package com.leetcode.easy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class IslandPerimeter {
    static class Pair {
        int row;
        int column;

        Pair(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

    public static void main(String[] args) {
//        int result = islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}});
        int result = islandPerimeterBFS(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}});
//        int result = islandPerimeterBFS(new int[][]{{0, 1}});
        System.out.println(result);
    }

    public static int islandPerimeterBFS(int[][] grid) {
        Queue<Pair> queue = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    queue.add(new Pair(i, j));
            }
        }

        while (queue.peek() != null) {
            Pair currentPair = queue.peek();
            if (currentPair.column - 1 >= 0 && grid[currentPair.column - 1][currentPair.row] == 0) {
                sum += 1;
            } else if (currentPair.column == 0) sum += 1;

            if (currentPair.column + 1 < grid[0].length && grid[currentPair.column + 1][currentPair.row] == 0) {
                sum += 1;
            } else if (currentPair.column == grid[0].length - 1) sum += 1;

            if (currentPair.row - 1 >= 0 && grid[currentPair.column][currentPair.row - 1] == 0) {
                sum += 1;
            } else if (currentPair.row == 0) sum += 1;

            if (currentPair.row + 1 < grid.length && grid[currentPair.column][currentPair.row + 1] == 0) {
                sum += 1;
            } else if (currentPair.row == grid.length - 1) sum += 1;
            queue.remove();
        }
        return sum;
    }

    public static int islandPerimeter(int[][] grid) {
        if (grid.length == 1 && grid[0].length == 1) return 4;
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    sum += 4;
                    if (i != 0 && grid[i - 1][j] == 1) sum -= 1;
                    if (i != grid.length - 1 && grid[i + 1][j] == 1) sum -= 1;
                    if (j != 0 && grid[i][j - 1] == 1) sum -= 1;
                    if (j != grid[0].length - 1 && grid[i][j + 1] == 1) sum -= 1;
                }
            }
        }
        return sum;
    }
}
