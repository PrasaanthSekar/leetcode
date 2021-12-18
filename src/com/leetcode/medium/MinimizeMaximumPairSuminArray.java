package com.leetcode.medium;

import java.util.Arrays;

public class MinimizeMaximumPairSuminArray {
    public static void main(String[] args) {
        System.out.println(minPairSum(new int[]{4, 1, 5, 1, 2, 5, 1, 5, 5, 4}));
    }

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int len = nums.length;
        int index = 0;
        int max = 0;
        while (index < (len / 2)) {
            int sum = nums[index] + nums[len - 1 -index];
            max = Math.max(max, sum);
            index++;
        }
        return max;
    }
}
