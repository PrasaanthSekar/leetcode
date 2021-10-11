package com.leetcode.medium;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        System.out.println(kthLargestElement(new int[]{1, 4, 6, 2, 3}, 2));
    }

    public static int kthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
            if(queue.size() > k){
                queue.remove();
            }
        }
        return queue.remove();
    }
}
