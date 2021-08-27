package com.leetcode;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        // write your code here
        int result = singleNumber(new int[]{1});
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) <= nums.length - 1 && nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i++;
        }
        return nums[nums.length - 1];
    }
}
