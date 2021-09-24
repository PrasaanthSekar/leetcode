package com.leetcode.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int result = findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        System.out.println(result);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
