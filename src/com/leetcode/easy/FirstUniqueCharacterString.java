package com.leetcode.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character character: s.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> charMap: map.entrySet()) {
            if(charMap.getValue() == 1)
                return s.indexOf(charMap.getKey());
        }

        return -1;
    }
}
