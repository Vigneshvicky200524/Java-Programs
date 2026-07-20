package com.example.main;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] a = {12, 5, 8, 2, 15};
        int min = a[0];

        for (int i : a)
            if (i < min)
                min = i;

        System.out.println("Smallest number: " + min);
    }
}