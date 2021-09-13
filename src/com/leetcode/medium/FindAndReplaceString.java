package com.leetcode.medium;

import java.util.List;

public class FindAndReplaceString {

    public static void main(String[] args) {
        // write your code here
        String result = findReplaceString("abcd", new int[]{0, 2}, new String[]{"ab", "ec"}, new String[]{"eee", "ffff"});
        System.out.println(result);
    }

    public static String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            String source = sources[i];
            String sub = s.substring(indices[i], indices[i] + sources[i].length());
            if (source.equals(sub)) {
                int start = result.indexOf(sub);
                result.replace(start, start + sources[i].length(), targets[i]);
            }
        }
        return result.toString();
    }
}
