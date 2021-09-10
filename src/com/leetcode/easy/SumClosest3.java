package com.leetcode.easy;

public class SumClosest3 {

    public static void main(String[] args) {
        // write your code here
        int result = threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        System.out.println(result);
    }

    public static int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 2; k < nums.length; k++) {
                    int tempSum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(tempSum - target) < Math.abs(sum - target)) {
                        sum = tempSum;
                    }
                }
            }
        }
        return sum;
    }
}
