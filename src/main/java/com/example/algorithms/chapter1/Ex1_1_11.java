package com.example.algorithms.chapter1;

/**
 * Output:
 * * *
 *  * *
 * ****
 *    *
 */
public class Ex1_1_11 {

    public static void main(String[] args) {
        boolean[][] matrix = {
                {true, false, true, false},
                {false, true, false, true},
                {true, true, true, true},
                {false, false, false, true}
        };

        printMatrix(matrix);
    }

    private static void printMatrix(boolean[][] matrix) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] ? '*' : ' ');
            }
            System.out.println();
        }
    }
}
