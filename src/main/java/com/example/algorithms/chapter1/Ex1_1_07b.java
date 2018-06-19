package com.example.algorithms.chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_07b {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 1000; i++)
            for(int j = 0; j < i; j++)
                sum ++;

        StdOut.println(sum); // 499500
    }
}
