package com.leetcode.fourteendaysalgopractice;

import java.util.Arrays;

public class Matrix01 {
    public static void main(String[] args) {
        // write your code here
        int[][] input = {{1, 1, 0}, {1, 0, 0}, {0, 0, 0}};
        int[][] result = updateMatrix(input);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] updateMatrix(int[][] mat) {
        int[][] mat1 = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != 0) {
                    int left = 1;
                    int right = 1;
                    int bottom = 1;
                    int top = 1;
                    left = findLeft(mat, i, j, left);
                    left = left == 1 ? Integer.MAX_VALUE : left;
                    right = findRight(mat, i, j, right);
                    right = right == 1 ? Integer.MAX_VALUE : right;
                    top = findTop(mat, i, j, top);
                    top = top == 1 ? Integer.MAX_VALUE : top;
                    bottom = findBottom(mat, i, j, bottom);
                    bottom = bottom == 1 ? Integer.MAX_VALUE : bottom;
                    mat1[i][j] = Math.min(Math.min(left, right), Math.min(top, bottom));
                } else {
                    mat1[i][j] = mat[i][j];
                }
            }
        }
        return mat1;
    }

    private static int findLeft(int[][] mat, int i, int j, int left) {
        if (i - 1 >= 0) {
            if (mat[i - 1][j] == 1) {
                i = i - 1;
                left++;
                return findLeft(mat, i, j, left);

            }
        }
        return left;
    }

    private static int findRight(int[][] mat, int i, int j, int right) {
        if (i + 1 < mat.length) {
            if (mat[i + 1][j] == 1) {
                i = i + 1;
                right++;
                return findRight(mat, i, j, right);

            }
        }
        return right;
    }

    private static int findTop(int[][] mat, int i, int j, int top) {
        if (j - 1 >= 0) {
            if (mat[i][j - 1] == 1) {
                j = j - 1;
                top++;
                return findTop(mat, i, j, top);

            }
        }
        return top;
    }

    private static int findBottom(int[][] mat, int i, int j, int bottom) {
        System.out.println(mat[0].length);
        if (j + 1 < mat[0].length) {
            if (mat[i][j + 1] == 1) {
                j = j + 1;
                bottom++;
                return findBottom(mat, i, j, bottom);

            }
        }
        return bottom;
    }

//    private static int findNearest(int[][] mat, int i, int j, int left, int right, int bottom, int top) {
//        System.out.println(i);
//        System.out.println(j);
//
//        if (i - 1 >= 0 && mat[i - 1][j] == 1) {
//            i = i - 1;
//            left++;
//            findNearest(mat, i, j, left, right, bottom, top);
//        }
//        if (i + 1 <= mat.length && mat[i + 1][j] == 1) {
//            i = i + 1;
//            right++;
//            findNearest(mat, i, j, left, right, bottom, top);
//        }
//        if (j - 1 >= 0 && mat[i][j - 1] == 1) {
//            j = j - 1;
//            top++;
//            findNearest(mat, i, j, left, right, bottom, top);
//        }
//        if (j + 1 <= mat[0].length && mat[i][j + 1] == 1) {
//            j = j + 1;
//            bottom++;
//            findNearest(mat, i, j, left, right, bottom, top);
//        }
//
//        return Math.min(left, Math.min(right, Math.min(bottom, Math.min(bottom, top))));
//    }
}
