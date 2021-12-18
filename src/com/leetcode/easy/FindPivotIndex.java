package com.leetcode.easy;

public class FindPivotIndex {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{2,4,2}));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        int balance = 0;
        for (int i = 0; i < nums.length; i++) {
            balance = sum - nums[i] - leftSum;
            if (leftSum == balance) return i;
            leftSum += nums[i];

        }
        return -1;
    }
}
