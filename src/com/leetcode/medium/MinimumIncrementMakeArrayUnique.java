package com.leetcode.medium;

import java.util.HashMap;

public class MinimumIncrementMakeArrayUnique {
    public static void main(String[] args) {
        System.out.println(minIncrementForUnique(new int[]{1, 2, 2}));
        System.out.println(minIncrementForUnique(new int[]{3, 2, 1, 2, 1, 7}));
    }

    public static int minIncrementForUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (Integer num : nums) {
            int temp = num;
            while (map.get(temp) != null) {
                temp++;
                count++;
            }
            map.put(temp, 1);
        }
        return count;
    }
}
