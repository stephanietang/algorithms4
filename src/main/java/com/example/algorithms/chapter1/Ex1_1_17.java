package com.example.algorithms.chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_17 {

    public static void main(String[] args) {
        final int N = 6;
        StdOut.println(exR2(N));
    }

    private static String exR2(final int n) { // Throw Exception of StackOverFlowError

        String s = exR2(n - 3) + n + exR2(n - 2) + n;

        if(n <= 0){
            s = "";
        }
        return s;
    }
}
