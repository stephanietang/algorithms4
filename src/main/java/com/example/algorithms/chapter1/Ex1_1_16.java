package com.example.algorithms.chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_16 {

    public static void main(String[] args) {
        final int N = 6;
        StdOut.println(exR1(N));
    }

    private static String exR1(final int n) {
        if(n <= 0){
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
