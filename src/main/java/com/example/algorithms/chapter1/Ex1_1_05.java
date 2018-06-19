package com.example.algorithms.chapter1;

import edu.princeton.cs.algs4.StdIn;

public class Ex1_1_05 {

    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();

        System.out.println(0 <= x && x <= 1 && 0<= y && y <= 1);
    }
}
