package com.example.main;

import java.util.*;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 1, 4};
        Map<Integer, Integer> m = new HashMap<>();

        for (int i : a)
            m.put(i, m.getOrDefault(i, 0) + 1);

        System.out.println(m);
    }
}