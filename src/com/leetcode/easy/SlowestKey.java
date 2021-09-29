package com.leetcode.easy;

public class SlowestKey {
    public static void main(String[] args) {
        System.out.println(slowestKey(new int[]{9, 29, 49, 50}, "cbcd"));
        System.out.println(slowestKey(new int[]{12, 23, 36, 46, 62}, "spuda"));
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int lDuration = releaseTimes[0];
        int curr = releaseTimes[0];
        char longest = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            int diff = releaseTimes[i] - curr;
            curr = releaseTimes[i];
            if (diff > lDuration) {
                lDuration = diff;
                longest = keysPressed.charAt(i);
            } else if (diff == lDuration) {
                if (keysPressed.charAt(i) > longest) {
                    longest = keysPressed.charAt(i);
                }
            }
        }
        return longest;
    }
}
