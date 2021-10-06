package com.leetcode.easy;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        // write your code here
        String result = addBinary("1010", "1011");
        System.out.println(result);
    }

    public static String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int maxLength = Math.max(aLength, bLength);
        if (a.length() < b.length())
            a = padZeros(a, maxLength);
        else
            b = padZeros(b, maxLength);

        int carry = 0;
        String result = "";
        for (int i = Math.max(aLength, bLength) - 1; i >= 0; i--) {
            int sum = 0;
            sum = carry + Integer.parseInt(String.valueOf(a.charAt(i))) + Integer.parseInt(String.valueOf(b.charAt(i)));
            carry = 0;

            if (i == 0) {
                if (sum == 2)
                    sum = 10;
                else if (sum > 2)
                    sum = 11;
            } else {
                if (sum == 2) {
                    carry = 1;
                    sum = 0;
                } else if (sum > 2) {
                    carry = 1;
                    sum = 1;
                }
            }

            result = sum + result;
        }
        return result;
    }

    public static String padZeros(String a, int maxLength) {
        StringBuilder newString = new StringBuilder();
        int toBeAdded = maxLength - a.length();
        newString.append("0".repeat(Math.max(0, toBeAdded)));
        newString.append(a);
        return newString.toString();
    }
}
