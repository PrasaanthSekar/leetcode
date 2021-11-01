package com.leetcode.medium;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{0, 1, 2, 2}));
        System.out.println(totalFruit(new int[]{1, 2, 1}));
        System.out.println(totalFruit(new int[]{1, 2, 3, 2, 2}));
        System.out.println(totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
        System.out.println(totalFruit(new int[]{0, 1, 0, 2}));
    }

    public static int totalFruit(int[] fruits) {
        int count = 0;
        int maxCount = 0;
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();
        while (index != fruits.length) {
            count++;
            if (!queue.contains(fruits[index]))
                queue.add(fruits[index]);
            if (queue.size() > 2) {
                maxCount = Math.max(maxCount, count - 1);
                count = 0;
                index -= 2;
                queue.remove();
            }
            index++;
        }

        return Math.max(maxCount, count);
    }
}
