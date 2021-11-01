package com.leetcode.medium;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{-1, -1}, 1)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[k];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(map::get));
        for (Integer data : map.keySet()) {
            queue.add(data);
            if (queue.size() > k) queue.remove();
        }
        for (int j = k - 1; j >= 0; j--) {
            result[j] = queue.remove();
        }
        return result;
    }
}
