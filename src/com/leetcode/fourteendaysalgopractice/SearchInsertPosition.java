package com.leetcode.fourteendaysalgopractice;

public class SearchInsertPosition {

    public static void main(String[] args) {
        // write your code here
        int result = searchInsert(new int[]{1, 3, 5, 7}, 0);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int pivot;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            }
            if (target < nums[pivot]) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return left;
    }
}
