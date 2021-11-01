package com.leetcode.easy;

public class NimGame {
    public static void main(String[] args) {
        System.out.println(canWinNim(4));
        System.out.println(canWinNim(1));
    }

    public static boolean canWinNim(int n) {
        return isWinnner(n);
    }

    public static boolean isWinnner(int n) {
        if (n == 0) return true;


        return isWinnner(n - 1) || isWinnner(n - 2) || isWinnner(n - 3);
    }
}
