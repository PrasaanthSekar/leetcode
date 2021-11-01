package com.leetcode.easy;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0, 2, 4, 1})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0, 1, 4})));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int len = nums.length;
        int last = len - 1;
        int[] result = new int[len];
        for (int num : nums) {
            if (num % 2 == 0) {
                result[start] = num;
                start++;
            } else {
                result[last] = num;
                last--;
            }
        }
        return result;
    }
}
