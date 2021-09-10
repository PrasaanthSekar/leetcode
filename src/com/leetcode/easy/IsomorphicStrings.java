package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */
public class IsomorphicStrings {

    public static void main(String[] args) {
        // write your code here
        boolean result = isIsomorphic("paper", "title");
        System.out.println(result);
    }

    public static boolean isIsomorphic(String s, String t) {
        StringBuilder str = new StringBuilder();
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(t.charAt(i)) != null)
                return false;
            map.put(s.charAt(i), t.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            str.append(map.get(s.charAt(i)));
        }
        return str.toString().equals(t);
    }
}
