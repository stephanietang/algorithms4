package com.example.algorithms.chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_07a {

    public static void main(String[] args) {
        double t = 9.0;
        while(Math.abs(t - 9.0/t) > .001) {
            t = (9.0 / t + t ) /2.0;
        }
        StdOut.printf("%.5f\n", t); //3.00009
    }
}
