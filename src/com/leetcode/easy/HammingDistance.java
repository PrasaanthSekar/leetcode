package com.leetcode.easy;

public class HammingDistance {
    public static void main(String[] args) {
        int result = hammingDistance(1, 4);
        System.out.println(result);
    }

    public static int hammingDistance(int x, int y) {
        String s1 = binary(x);
        String s2 = binary(y);
        System.out.println(s1+"qqqqqqq"+s2);
        int maxZeros = Math.max(s1.length(), s2.length());

        return 0;
    }

    public static String binary(int num) {
        StringBuilder bin = new StringBuilder();
        while (num > 0) {
            bin.append(num % 2);
            num = num / 2;
        }
        return bin.reverse().toString();
    }
}
