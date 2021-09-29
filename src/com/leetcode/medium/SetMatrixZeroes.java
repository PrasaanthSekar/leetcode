package com.leetcode.medium;


import java.util.LinkedList;
import java.util.Queue;

public class SetMatrixZeroes {

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        //[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        setZeroes(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}});
    }

    public static void setZeroes(int[][] matrix) {
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0)
                    queue.add(new Pair(i, j));
            }
        }
        while (queue.peek() != null) {
            Pair newPair = queue.poll();
            int row = newPair.first;
            int col = newPair.second;
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("\n");
        }
    }
}
