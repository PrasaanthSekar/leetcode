package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int left = 0;
        int right = matrix[0].length;
        int bottom = matrix.length;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = 0; i < matrix.length; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = 0; i < matrix[0].length; i++) {
                list.add(matrix[top][i]);
            }
            right--;
            for (int i = matrix.length - 1; i >= 0; i--) {
                list.add(matrix[left][i]);
            }

        }
        return list;
    }
}
