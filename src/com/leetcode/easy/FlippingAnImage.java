package com.leetcode.easy;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}})));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int row = image[0].length;
        int col = image.length;
         int[][] result = new int[row][col];
        for (int i = 0; i < image.length; i++) {
            for (int j = image[i].length - 1; j >= 0; j--) {
                int index = image[i].length - 1 - j;
                result[i][index] = image[i][j];
                 if(result[i][index] == 0)
                     result[i][index] = 1;
                 else
                     result[i][index] = 0;
            }
        }
        return result;
    }
}
