package com.leetcode.easy;

import java.util.Arrays;

public class MaxRepeating {

    public static void main(String[] args) {
//        System.out.println(maxRepeating(new int[]{2, 3, 3, 5, 3, 4, 1, 7}, 8, 8));
        System.out.println(maxRepeating(new int[]{1, 1, 1, 2, 2, 3, 3, 3}, 8, 8));
    }

    public static int maxRepeating(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++)
            arr[(arr[i] % k)] += k;

        System.out.println(Arrays.toString(arr));
        // Find index of the maximum repeating element
        int max = arr[0], result = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = i;
            }
        }

        /* Uncomment this code to get the original array back
        for (int i = 0; i< n; i++)
          arr[i] = arr[i]%k; */

        // Return index of the maximum element
        return result;
    }
}
