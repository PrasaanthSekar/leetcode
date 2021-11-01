package com.leetcode.fourteendaysalgopractice;

import java.util.Arrays;

public class Matrix01 {
    public static void main(String[] args) {
        // write your code here
//        int[][] input = {{0}, {1}};
//        int[][] input = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] input = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] result = updateMatrix(input);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] updateMatrix(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1)
                    result[i][j] = findDistance(mat, i, j);
            }
        }
        return result;
    }

    private static int findDistance(int[][] mat, int i, int j) {
//        if (i < 0 || i > mat.length) return Integer.MAX_VALUE;
//        if (j < 0 || j > mat[0].length) return Integer.MAX_VALUE;

        if (mat[i][j] == 0)
            return 1;

        int top = (i - 1 >= 0) ? 1 + findDistance(mat, i - 1, j) : Integer.MAX_VALUE;
        int down = (i + 1 < mat.length) ? 1 + findDistance(mat, i + 1, j) : Integer.MAX_VALUE;
        int right = (j - 1 <= 0) ? 1 + findDistance(mat, i, j + 1) : Integer.MAX_VALUE;
        int left = (j + 1 < mat[0].length) ? 1 + findDistance(mat, i, j - 1) : Integer.MAX_VALUE;
        return Math.min(top, Math.min(down, Math.min(right, left)));
    }
}