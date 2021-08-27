package com.leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        // write your code here
        int result = binarySearch(new int[]{1, 2, 4, 5, 6}, 6);
        System.out.println(result);
    }

    public static int binarySearch(int[] s, int target) {
        int mid = s.length / 2;
        while (mid != 0) {
            if (s[mid] == target)
                return mid;
            else if (s[mid] > target)
                mid--;
            else
                mid++;
        }
        return mid;
    }
}
