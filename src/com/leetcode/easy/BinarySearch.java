package com.leetcode.easy;

public class BinarySearch {
    public static void main(String[] args) {
        // write your code here
//        int result = binarySearch(new int[]{1, 2, 4, 5, 6}, 6);
        int result = binarySearchMissingElement(new int[]{ 1, 2, 4, 5});
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

    public static int binarySearchMissingElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {

            int mid = (left + right) / 2;

            // If the middle element is not on
            // the middle index, then the missing element is mid + 1.
            if (arr[mid] != mid + 1 && arr[mid - 1] == mid) {
                return mid + 1;
            }

            // This case means that the missing element is
            // not to the left. So search the right.
            if (arr[mid] == mid + 1)
                right = mid - 1;

                // This case means that the missing element is not
                // to the right. So search the left.
            else
                left = mid + 1;
        }

        // Will reach here if no missing element found.
        return -1;
    }
}
