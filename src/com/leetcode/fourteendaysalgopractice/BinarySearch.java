package com.leetcode.fourteendaysalgopractice;

public class BinarySearch {

    public static void main(String[] args) {
        // write your code here
        int result = search(new int[]{-2, 3, 4, 5}, 1);
        System.out.println(result);
    }


    public static int search1(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 1) {
            if (nums[len - 1] == target) return 0;
            else return -1;
        }
        int mid = (len + 1) / 2;
        while (mid >= 0 && mid < len) {
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                mid++;
//                if (mid < len && nums[mid] > target) return -1;
            } else {
                mid--;
//                if (mid > 0 && nums[mid] < target) return -1;
            }
        }
        return -1;
    }
}
