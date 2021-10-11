package com.leetcode.medium;

public class MaximizeDistanceClosestPerson {
    public static void main(String[] args) {
//        System.out.println(maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
        System.out.println(maxDistToClosest(new int[]{0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1}));
//        System.out.println(maxDistToClosest(new int[]{0, 1}));
    }

    public static int maxDistToClosest(int[] seats) {
        int min = 0;
        int max = 0;
        int[] dp = new int[seats.length];
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != 1) {
                min = findClosest(seats, i, i, i, dp) - 1;
                max = Math.max(max, min);
            }
        }
        return max;
    }

    private static int findClosest(int[] seats, int left, int right, int index, int[] dp) {


        if (left < 0 || right > seats.length - 1)
            return Integer.MAX_VALUE - 1;

        if (seats[left] == 1 || seats[right] == 1)
            return 1;

        if (dp[index] != 0) return dp[index];

        return dp[index] = Math.min(
                1 + findClosest(seats, left - 1, right, index, dp),
                1 + findClosest(seats, left, right + 1, index, dp)
        );
    }
}
