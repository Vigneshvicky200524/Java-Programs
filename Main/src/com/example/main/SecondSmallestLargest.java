package com.example.main;

import java.util.Arrays;

public class SecondSmallestLargest {
    public static void main(String[] args) {
        int[] a = {12, 5, 8, 2, 15};

        Arrays.sort(a);

        System.out.println("Second Smallest: " + a[1]);
        System.out.println("Second Largest: " + a[a.length - 2]);
    }
}