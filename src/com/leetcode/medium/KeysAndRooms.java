package com.leetcode.medium;

import java.util.*;

public class KeysAndRooms {
    public static void main(String[] args) {
//        List<List<Integer>> list = List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0));
        List<List<Integer>> list = List.of(List.of(2), List.of(), List.of(1));
//        List<List<Integer>> list = List.of(List.of(1), List.of(2), List.of(3), List.of());
        System.out.println(canVisitAllRooms(list));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Integer> initRoom = rooms.get(0);
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        Queue<Integer> queue = new LinkedList<>(initRoom);
        while (!queue.isEmpty()) {
            int currentRoom = queue.remove();
            if (!visited.contains(currentRoom))
                queue.addAll(rooms.get(currentRoom));
            visited.add(currentRoom);
        }
        return visited.size() == rooms.size();
    }
}
