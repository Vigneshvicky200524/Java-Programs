package com.example.main;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] a = {12, 5, 8, 2, 15};
        int max = a[0];

        for (int i : a)
            if (i > max)
                max = i;

        System.out.println("Largest number: " + max);
    }
}