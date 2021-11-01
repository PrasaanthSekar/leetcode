package com.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character character : s.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }
        PriorityQueue<Character> queue = new PriorityQueue<>(Comparator.comparingInt(map::get));
        queue.addAll(map.keySet());
        StringBuilder builder = new StringBuilder();
        int size = queue.size();
        char[] array = new char[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = queue.remove();
        }
        for (int i = array.length -1; i >=0 ; i--) {
            String letter = ""+array[i];
            String letterRepeat = letter.repeat(map.get(array[i]));
            builder.append(letterRepeat);
        }
        return builder.toString();
    }
}
