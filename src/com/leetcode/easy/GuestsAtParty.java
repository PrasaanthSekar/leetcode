package com.leetcode.easy;

public class GuestsAtParty {

    public static void main(String[] args) {
        System.out.println(findGuests(new int[]{0, 2, 1}));
    }

//    [0, 1, 1, 2, 2]
    public static int findGuests(int[] ints) {
        int[] res = new int[ints.length];
        int guestsIn = 0;
        res[0] = Math.min(guestsIn, ints[0]) == ints[0] ? 1 : 0;
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] <= ints[i - 1]) {
                res[i] = res[i - 1] + 1;
            } else {
                res[i] = res[i - 1];
            }
        }
        return res[ints.length - 1];
    }
}
