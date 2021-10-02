package com.leetcode.fourteendaysalgopractice;

import java.util.Arrays;

public class Matrix01 {
    public static void main(String[] args) {
        // write your code here
        int[][] input = {{0}, {1}};
//        int[][] input = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] result = updateMatrix(input);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] updateMatrix(int[][] mat) {
        int[][] mat1 = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != 0) {
                    int top = findTop(mat, i - 1, j, 0);
                    top = top == 0 ? Integer.MAX_VALUE : top;
                    int bottom = findBottom(mat, i + 1, j, 0);
                    bottom = bottom == 0 ? Integer.MAX_VALUE : bottom;
                    int right = findRight(mat, i, j + 1, 0);
                    right = right == 0 ? Integer.MAX_VALUE : right;
                    int left = findLeft(mat, i, j - 1, 0);
                    left = left == 0 ? Integer.MAX_VALUE : left;

                    int min1 = Math.min(top, bottom);
                    int min2 = Math.min(right, left);
                    System.out.println(Math.min(min1, min2));
                    mat1[i][j] = Math.min(min1, min2);
                } else {
                    mat1[i][j] = mat[i][j];
                }
            }
        }
        return mat1;
    }

    private static int findTop(int[][] mat, int i, int j, int count) {
        count++;
        if (i < 0) {
            return 0;
        }
        if (mat[i][j] == 0) {
            return count;
        }

        return findTop(mat, i - 1, j, count);
    }

    private static int findBottom(int[][] mat, int i, int j, int count) {
        count++;
        if (i > mat.length - 1) {
            return 0;
        }
        if (mat[i][j] == 0) {
            return count;
        }

        return findBottom(mat, i + 1, j, count);
    }

    private static int findRight(int[][] mat, int i, int j, int count) {
        count++;
        if (j > mat[0].length - 1) {
            return 0;
        }
        if (mat[i][j] == 0) {
            return count;
        }

        return findRight(mat, i, j + 1, count);
    }

    private static int findLeft(int[][] mat, int i, int j, int count) {
        count++;
        if (j < 0) {
            return 0;
        }
        if (mat[i][j] == 0) {
            return count;
        }

        return findLeft(mat, i, j - 1, count);
    }
}