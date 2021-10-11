package com.leetcode.easy;

public class BinarySearch {
    public static void main(String[] args) {
        // write your code here
//        int result = binarySearch(new int[]{1, 2, 4, 5, 6}, 6);
        int result = binarySearchMissingElement(new int[]{0, 2, 3, 4, 5});
        System.out.println(result);
    }

    public static int binarySearch(int[] s, int target) {
        int low = 0;
        int high = s.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (s[mid] == target)
                return mid;
            else if (target < s[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static int binarySearchMissingElement(int[] s) {
        int low = 0;
        int high = s.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (s[mid] == mid + 1)
                low = mid + 1;
            else if (s[mid] > mid + 1)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low + 1;
    }
}
