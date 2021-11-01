package com.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MakingFileNamesUnique {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFolderNames(new String[]{"gta", "gta(1)", "gta", "avalon"})));
        System.out.println(Arrays.toString(getFolderNames(new String[]{"onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece"})));
        System.out.println(Arrays.toString(getFolderNames(new String[]{"wano", "wano", "wano", "wano"})));
        System.out.println(Arrays.toString(getFolderNames(new String[]{"kaido","kaido(1)","kaido","kaido(1)"})));
        System.out.println(Arrays.toString(getFolderNames(new String[]{"kaido", "kaido(1)", "kaido", "kaido(1)", "kaido(2)"})));
    }

    public static String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        String[] result = new String[names.length];
        int i = 0;
        for (String word : names) {
            if (!map.containsKey(word)) {
                result[i] = word;
            } else {
                int lastValue = map.get(word);
                String newFileName = word + "(" + (lastValue) + ")";
                while (map.containsKey(newFileName)) {
                    lastValue++;
                    newFileName = word + "(" + (lastValue + 1) + ")";
                }
                newFileName = word + "(" + (lastValue + 1) + ")";
                result[i] = newFileName;
                word = newFileName;
            }
            i++;
            map.put(word, map.getOrDefault(word, 0) + 1);
        } 
        char[] temp = new char[2];
        return result;
    }
}
