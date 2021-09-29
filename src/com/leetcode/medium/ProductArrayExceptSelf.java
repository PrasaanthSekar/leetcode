package com.leetcode.medium;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int product = 1;
        for (int num : nums) {
            product *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) result[i] = product / nums[i];
            else result[i] = product;
        }
        return result;
    }
}
