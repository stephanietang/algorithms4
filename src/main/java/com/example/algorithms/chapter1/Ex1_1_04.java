package com.example.algorithms.chapter1;

import edu.princeton.cs.algs4.StdIn;

public class Ex1_1_04 {

    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = -1;
        // a. if(a > b) then c = 0; //wrong, should be: if <boolean expression> {<block statement>}
        // b. if a > b { c = 0; } // wrong, should use {} to enclose a > b
        if(a > b) c = 0; // correct, if block statement is a single statement, we can omit {}
        // d. if(a > b) c = 0 else b = 0; // wrong, miss ';' after 'c = 0'

        System.out.println(c);
    }
}
