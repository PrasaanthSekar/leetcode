package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        // write your code here
        int result = romanToInt("DXLII");
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> romanMap = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        StringBuilder romanBuilder = new StringBuilder(s);
        String romanReverse = romanBuilder.reverse().toString();
        char prev = romanReverse.charAt(0);
        for (int i = 0; i < romanReverse.length(); i++) {
            if (romanReverse.charAt(i) != prev && romanMap.get(romanReverse.charAt(i)) < result) {
                result -= romanMap.get(romanReverse.charAt(i));
            } else
                result += romanMap.get(romanReverse.charAt(i));

            prev = romanReverse.charAt(i);
        }
        return result;
    }
}
