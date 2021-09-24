package com.leetcode.easy;

public class MaximumSubarray {

    public static void main(String[] args) {
        // write your code here
        int result = kadane(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(result);
    }

    public static int kadane(int[] nums) {
        int maxSoFar = nums[0];
        int maxEnding = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            maxSoFar = Math.max(maxEnding, maxSoFar);
        }
        return 0;
    }

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
