package com.leetcode.medium;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int result = maxProductDP(new int[]{2, 3, -2, 4});
        System.out.println(result);
    }

    public static int maxProductDP(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
        }
        return 0;
    }

    public static int maxProduct(int[] nums) {
        int maxProdSoFar = nums[0];
        int maxProd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxProdSoFar = Math.max(nums[i], maxProdSoFar * nums[i]);
            maxProd = Math.max(maxProdSoFar, maxProd);
        }
        return maxProd;
    }
}
