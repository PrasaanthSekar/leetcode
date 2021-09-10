package com.leetcode.easy;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        // write your code here
        int array[] = new int[]{3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
//        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }
}
