package com.leetcode.easy;

public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1,2,2,3,2}));
    }

    public static boolean isMonotonic(int[] nums) {
        int inc = 0;
        int dec = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                continue;
            if (nums[i] > nums[i + 1]) {
                dec++;
            } else {
                inc++;
            }
        }
        System.out.println(inc);
        System.out.println(dec);
        return inc == 0 || dec == 0;
    }
}
