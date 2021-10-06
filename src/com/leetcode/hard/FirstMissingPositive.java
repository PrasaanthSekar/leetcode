package com.leetcode.hard;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1}));
    }

    public static int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int index = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
            index = i;
        }
        return index + 1;
    }
}
