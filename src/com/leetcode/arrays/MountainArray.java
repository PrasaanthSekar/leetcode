package com.leetcode.arrays;

public class MountainArray {

    public static void main(String[] args) {
        // write your code here
        boolean result = validMountainArray(new int[]{3, 5, 5});
        System.out.println(result);
    }

    public static boolean validMountainArray(int[] arr) {
        int maxIndex = 0;
        int maxValue = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxIndex = i;
                maxValue = arr[i];
            } else {
                break;
            }
        }

        if (maxIndex == 0 || maxIndex == arr.length - 1)
            return false;
        for (int i = maxIndex + 1; i < arr.length; i++) {
            if (arr[i] < maxValue) {
                maxValue = arr[i];
            } else
                return false;
        }
        return true;
    }
}
