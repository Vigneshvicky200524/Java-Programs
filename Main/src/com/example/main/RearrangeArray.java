package com.example.main;

import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 3};
        Arrays.sort(a);

        for (int i = 0; i < a.length / 2; i++)
            System.out.print(a[i] + " ");

        for (int i = a.length - 1; i >= a.length / 2; i--)
            System.out.print(a[i] + " ");
    }
}