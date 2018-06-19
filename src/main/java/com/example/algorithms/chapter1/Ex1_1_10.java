package com.example.algorithms.chapter1;

public class Ex1_1_10 {

    public static void main(String[] args) {
        // There are three steps involved to make an array
        // 1. Declare the array name and type
        // 2. Create the array
        // 3. Initialize the array values;
        int[] a;
        // in the exercise, there doesn't exist step 2(create the array)
        a = new int[10];
        for(int i = 0; i < 10; i++) {
            a[i] = i * i;
        }
    }
}
