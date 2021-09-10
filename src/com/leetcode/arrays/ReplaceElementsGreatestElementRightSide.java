package com.leetcode.arrays;

import java.util.Arrays;

public class ReplaceElementsGreatestElementRightSide {

    public static void main(String[] args) {
        // write your code here
        int[] result = validMountainArray(new int[]{400});
        System.out.println(Arrays.toString(result));
    }

    public static int[] validMountainArray(int[] arr) {
        int[] result = new int[arr.length];

        if (arr.length == 1)
            result[0] = -1;
        else {
            for (int i = 0; i < arr.length - 1; i++) {
                result[i] = replaceArray(i + 1, arr);
            }
        }
        result[arr.length - 1] = -1;
        return result;
    }

    private static int replaceArray(int start, int[] arr) {
        int max = 0;
        for (int i = start; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
