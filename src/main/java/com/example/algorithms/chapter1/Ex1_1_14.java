package com.example.algorithms.chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_14 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int result = lg(n);
        StdOut.println(result);
    }

    private static int lg(int n) {

        int i = n;
        int c = 0;
        while(i > 1) {
            i /= 2;
            c ++;
        }
        return c;
    }
}
