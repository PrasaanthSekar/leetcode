package com.leetcode.fourteendaysalgopractice;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        // write your code here
//        moveZeroesArrayCopy(new int[]{0, 12, 1, -1});
        moveZeroesInPlace(new int[]{0, 1, 0, 3, 12});
    }

    private static void moveZeroesInPlace(int[] nums) {
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                last++;
                int temp = nums[i];
                nums[i] = nums[last];
                nums[last] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesArrayCopy(int[] nums) {
        int len = nums.length;
        int last = -1;
        int[] res = new int[len];
        for (int num : nums) {
            if (num != 0) {
                last = last + 1;
                res[last] = num;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
