package com.leetcode.arrays;

import java.util.Arrays;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        // write your code here
        int result = thirdMax(new int[]{1, 2});
        System.out.println(result);
    }

    public static int thirdMax(int[] nums) {
        // 1    2   2   3
        Arrays.sort(nums);
        int len = nums.length;
        int count = 1;
        int max = nums[len - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (count == 3) {
                return max;
            }
            if (nums[i] < max) {
                max = nums[i];
                count++;
            }
        }
        if (count < 3) {
            return nums[len - 1];
        }
        return max;
    }
}
