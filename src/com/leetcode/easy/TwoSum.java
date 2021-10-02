package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        // write your code here
        int array[] = new int[]{3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSumUpdate(array, target)));
    }

    public static int[] twoSumUpdate(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                result[0] = i;
                result[1] = map.get(remainder);
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
//        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }
}
