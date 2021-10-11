package com.leetcode.medium;

import java.util.HashMap;

public class WordsDataStructure {
    public static void main(String[] args) {
        WordDictionary obj = new WordDictionary();
        obj.addWord("word");
        boolean param_2 = obj.search("word");
        System.out.println(param_2);
    }
}

class WordDictionary {
    HashMap<String, Integer> words;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        words = new HashMap<>();
    }

    public void addWord(String word) {
        words.put(word, words.getOrDefault(word, 0) + 1);
    }

    public boolean search(String word) {
//        if(word.startsWith("."))
        String s = "adasdasda";
        for(Character map: s.toCharArray()){

        }
        return words.get(word) > 0;
    }


}