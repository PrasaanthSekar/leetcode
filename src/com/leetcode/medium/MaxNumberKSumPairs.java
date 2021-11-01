package com.leetcode.medium;

import java.util.HashMap;

public class MaxNumberKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
        System.out.println(maxOperations(new int[]{2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2}, 3));
    }

    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int remain = k - num;
            if (map.containsKey(remain)) {
                count++;
                if (map.get(remain) == 1)
                    map.remove(remain);
                else
                    map.put(remain, map.get(remain) - 1);
            }else
                map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
