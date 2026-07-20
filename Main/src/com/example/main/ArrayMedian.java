package com.example.main;

import java.util.*;

public class ArrayMedian {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 3};
        Arrays.sort(a);

        int n = a.length;
        double median = n % 2 == 0 ? (a[n/2-1] + a[n/2]) / 2.0 : a[n/2];

        System.out.println("Median: " + median);
    }
}