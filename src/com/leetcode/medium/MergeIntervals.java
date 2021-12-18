package com.leetcode.medium;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 3}, {2, 6}, {6, 7}, {8, 10}, {15, 18}})));
//        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 4}, {4, 5}})));
        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 4}, {5, 6}})));
    }

    public static int[][] merge(int[][] intervals) {
        List<Integer> result = new ArrayList<>();
        int[] temp = new int[2];
        temp[0] = intervals[0][0];
        if (intervals.length == 1) {
            temp[1] = intervals[0][1];
        }
        int prev = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= prev) {
                prev = intervals[i][1];
                temp[1] = intervals[i][1];
            } else {
                if (temp[0] > 0) {
                    result.add(temp[0]);
                    if (temp[1] > 0)
                        result.add(temp[1]);
                    else
                        result.add(intervals[i - 1][1]);
                    temp = new int[2];
                }
                result.add(intervals[i][0]);
                result.add(intervals[i][1]);
            }
        }
        if (temp[0] > 0) {
            result.add(temp[0]);
            result.add(temp[1]);
        }
        System.out.println(result);
        int[][] finalResult = new int[result.size() / 2][2];
        int row = 0;
        int column = 0;
        for (int i = 0; i < result.size(); i++) {
            finalResult[row][column] = result.get(i);
            column++;
            if (column == 2) {
                column = 0;
                row++;
            }
        }
        return finalResult;
    }
}
