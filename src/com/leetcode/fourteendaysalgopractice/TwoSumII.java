package com.leetcode.fourteendaysalgopractice;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
        // write your code here
//        moveZeroesArrayCopy(new int[]{0, 12, 1, -1});
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int last = numbers.length - 1;
        int[] res = new int[2];
        while (start < last) {
            int sum = numbers[start] + numbers[last];
            if (sum == target) {
                res[0] = start + 1;
                res[1] = last + 1;
                return res;
            } else if (sum < target) start++;
            else last--;
        }
        return null;
    }
}
