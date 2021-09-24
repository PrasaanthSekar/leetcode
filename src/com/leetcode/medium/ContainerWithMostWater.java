package com.leetcode.medium;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int result = maxArea(new int[]{1,1000,6,1000,2,5,4,8,3,7});
        System.out.println(result);
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while (start < end) {
            if (height[start] != 0 && height[end] != 0) {
                int min = Math.min(height[start], height[end]);
                int distance = end - start;
                int area = min * distance;
                maxArea = Math.max(area, maxArea);
            }
            if (height[start] == height[end]) {
                start++;
                end--;
            } else if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
