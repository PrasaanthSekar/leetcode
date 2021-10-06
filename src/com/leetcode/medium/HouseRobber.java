package com.leetcode.medium;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(robMemo(new int[]{0}));
    }

    public static int robMemo(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int len = nums.length;
        int[] memo = new int[len + 1];
        memo[0] = nums[0];
        memo[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            memo[i] = Math.max(memo[i - 1], nums[i] + memo[i - 2]);
        }
        return memo[len - 1];
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int len = nums.length;
        int[] memo = new int[len + 1];
        int max = nums[0];
        int index = 0;
        while (index < len) {
            int profit = 0;
            for (int i = index; i < len; i += 2) {
                profit += nums[i];
            }
            max = Math.max(max, profit);
            memo[index] = max;
            index++;
        }
        return memo[len - 1];
    }
}
