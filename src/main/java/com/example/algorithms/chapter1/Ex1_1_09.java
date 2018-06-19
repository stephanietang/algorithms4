package com.example.algorithms.chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_09 {

    public static void main(String[] args) {
        int n = StdIn.readInt();

        StdOut.println(Integer.toBinaryString(n));

        String s = "";
        for(int i = n; i > 0; i /= 2) {
            s = i % 2 + s;
        }

        StdOut.println(s);
    }
}
