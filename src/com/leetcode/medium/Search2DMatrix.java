package com.leetcode.medium;

public class Search2DMatrix {

    public static void main(String[] args) {
//        [1,3,5,7],[10,11,16,20],[23,30,34,60]
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 60));
        System.out.println(searchMatrix(new int[][]{{1,3}}, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix.length;
        int currCol = 0;
        while (currCol < cols) {
            if (target >= matrix[currCol][0] && target <= matrix[currCol][matrix[0].length - 1]) {
                int[] array = new int[matrix[0].length];
                for (int i = 0; i < array.length; i++) {
                    array[i] = matrix[currCol][i];
                }
                return binarySearch(array, target);
            } else {
                currCol++;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return true;
            } else if (target < array[mid]) {
                end--;
            } else
                start++;
        }
        return false;
    }
}
