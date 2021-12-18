package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(shortestToChar("aaba", 'b')));
    }

    public static int[] shortestToChar(String s, char c) {
        char[] charArr = s.toCharArray();
        int[] result = new int[charArr.length];
        int prev = Integer.MAX_VALUE;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == c)
                list.add(i);
        }
        int index = 0;
        int next = list.get(index);
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == c) {
//                result[i] = 0;
                prev = i;
                index++;
                if (index >= list.size()) next = Integer.MAX_VALUE;
                else next = list.get(index);
            } else {
                result[i] = Math.min(
                        Math.abs(i - prev),
                        Math.abs(i - next)
                );
            }
        }
        return result;
    }
}
