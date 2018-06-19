package com.example.algorithms.chapter1;

public class Ex1_1_08 {

    public static void main(String[] args) {
        System.out.println('b'); //b
        System.out.println('b' + 'c'); //197, explanation: when using + to sum 2 chars, the result type would be an integer(98 + 99)
        System.out.println((char) ('a' + 4)); //e (97 + 4 = 101 => 'e')
    }
}
