package com.example.algorithms.chapter1;

/**
 * Output:
 *    1   6  11
 *    2   7  12
 *    3   8  13
 *    4   9  14
 *    5  10  15
 */
public class Ex1_1_13 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        printTransposedMatrix(matrix);
    }

    private static void printTransposedMatrix(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

}