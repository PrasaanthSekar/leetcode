package com.leetcode.medium;

import java.util.*;

public class CountServersCommunicate {
    static class Pair {
        int row;
        int column;

        Pair(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

    public static void main(String[] args) {
        System.out.println(countServers(new int[][]{{1, 0, 0, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}}));
    }

    public static int countServers(int[][] grid) {
        int sum = 0;
        Deque<Pair> nodes = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    nodes.add(new Pair(i, j));
            }
        }

        while (nodes.peek() != null) {
            int i = nodes.peek().row;
            int j = nodes.peek().column;
            if ((i != 0 && grid[i - 1][j] == 1) ||
                    (i != grid.length - 1 && grid[i + 1][j] == 1) ||
                    (j != 0 && grid[i][j - 1] == 1) ||
                    (j != grid[0].length - 1 && grid[i][j + 1] == 1)
            ) {
                sum++;
            }
            nodes.remove();
        }
        return sum;
    }
}
