package com.leetcode.medium;

import java.util.Map;
import java.util.TreeMap;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
//        System.out.println(longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}));
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int count = 0;
        int localCount = 0;
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Integer prev = null;
        for (Map.Entry<Integer, Integer> data : map.entrySet()) {
            if (prev != null && data.getKey() == prev + 1) {
                localCount++;
            } else {
                count = Math.max(localCount + 1, count);
                localCount = 0;
            }
            prev = data.getKey();
        }
        return Math.max(localCount + 1, count);
    }
}
