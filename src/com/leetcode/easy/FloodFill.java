package com.leetcode.easy;

import com.leetcode.medium.CombinationSum;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        System.out.println(
                Arrays.deepToString(
                        floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2)
                )
        );
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (image[sr][sc] != newColor) {
            fillColor(image, sr, sc, color, newColor);
        }
        return image;
    }

    private static void fillColor(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color)
            return;

        image[sr][sc] = newColor;

        fillColor(image, sr - 1, sc, color, newColor);
        fillColor(image, sr + 1, sc, color, newColor);
        fillColor(image, sr, sc - 1, color, newColor);
        fillColor(image, sr, sc + 1, color, newColor);
    }
}
