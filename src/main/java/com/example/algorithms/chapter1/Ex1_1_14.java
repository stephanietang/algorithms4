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

        if(n < 1) {
            return -1;
        }
        int tmp = 1;
        for(int i = 1; i < n; i++) {
            tmp = tmp * 2;
            if(tmp < n) {
                continue;
            } else if(tmp == n){
                return i;
            } else {
                return i - 1;
            }
        }
        return 0;
    }
}
