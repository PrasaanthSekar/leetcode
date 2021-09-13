package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

    public static void main(String[] args) {
        // write your code here
//        List<String> dict = new ArrayList<>();
//        dict.add("aaaa");
//        dict.add("aaa");
//
//        boolean result = wordBreak1("aaaaaaa", dict);
//        List<String> dict = new ArrayList<>();
//        dict.add("cat");
//        dict.add("dog");
//        dict.add("sand");
//        dict.add("and");
//        dict.add("cat");
//        boolean result = wordBreak1("catsandog", dict);
        List<String> dict = new ArrayList<>();
        dict.add("a");
        dict.add("b");
        dict.add("bbb");
        dict.add("bbbb");
        boolean result = wordBreak1("bb", dict);
        System.out.println(result);
    }

    public static boolean wordBreak1(String s, List<String> wordDict) {
        String temp = s;
        int i = temp.length();
        while (i > 0) {
            String newStr = temp.substring(0, i);
            if (wordDict.contains(newStr)) {
                StringBuilder result = new StringBuilder(temp);
                temp = result.replace(0, i, "").toString();
                i = temp.length();
            } else
                i--;
        }
        return temp.length() <= 0;
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        List<String> resultList = new ArrayList<>();
        for (String word : wordDict) {
            if (s.contains(word)) {
                resultList.add(word);
                int start = s.indexOf(word);
                StringBuilder result = new StringBuilder(s);
                s = result.replace(start, word.length(), "").toString();
            }
        }
        return true;
    }
}
