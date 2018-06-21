package com.example.algorithms.chapter1;

import edu.princeton.cs.algs4.StdOut;

import java.util.HashMap;
import java.util.Map;

public class Ex1_1_15 {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 2};
        int M = 4;

        int[] result = histogram(array, M);
        for (int i = 0; i < result.length; i++) {
            StdOut.println(result[i]);
        }
    }

    private static int[] histogram(int[] array, int m) {
        int[] result = new int[m];
        if(array != null && array.length > 0) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < array.length; i++) {
                int k = array[i];
                if(map.containsKey(k)) {
                    map.put(k, map.get(k) + 1);
                }else{
                    map.put(k, 1);
                }
            }

            for (int i = 0; i < m; i++) {
                result[i] = map.containsKey(i)? map.get(i) : 0;
            }
        }

        return result;
    }
}
