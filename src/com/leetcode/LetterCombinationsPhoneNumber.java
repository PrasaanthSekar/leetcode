package com.leetcode;

import java.util.*;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        // write your code here
        List<String> result = singleNumber("6789");
        System.out.println(result);
        System.out.println(result.size());
    }

    public static List<String> singleNumber(String digits) {
        List<String> result = new ArrayList<>();

        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        if (digits.length() == 1) {
            Collections.addAll(result, map.get(digits).split(""));
            return result;
        }

        if (digits.length() == 0) {
            return result;
        }

        List<String> one = new ArrayList<>();
        Collections.addAll(one, map.get("" + digits.charAt(0)).split(""));
        List<String> two = new ArrayList<>();
        Collections.addAll(two, map.get("" + digits.charAt(1)).split(""));

        int index = 1;
        while (index <= digits.length() - 1) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < one.size(); i++) {
                for (int j = 0; j < two.size(); j++) {
                    temp.add(one.get(i) + two.get(j));
                }
            }
            index++;
            if ((index) > digits.length() - 1)
                return temp;
            one = temp;
            two.clear();
            Collections.addAll(two, map.get("" + digits.charAt(index)).split(""));
        }
        return result;
    }
}
