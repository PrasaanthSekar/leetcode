package com.leetcode.easy;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        // write your code here
        int[] result = findErrorNums(new int[]{2, 3, 2});
        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int sum = 0;
        int actualLength = (nums.length * (nums.length + 1)) / 2;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i] == nums[i + 1]) {
                    result[0] = nums[i];
                }
            }
            sum += nums[i];
        }
        result[1] = (actualLength - (sum - result[0]));
        return result;
    }
}
