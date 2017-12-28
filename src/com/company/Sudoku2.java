package com.company;

public class Sudoku2 {
    boolean sudoku2(char[][] grid) {

        char[][] columns = new char[9][];
        char[][] rows = new char[9][];

        for (int i = 0; i < 9; i++) {
            rows[i] = grid[i];

            for (int j = 0; j < 9; j++) {
                columns[i][j] = grid[j][i];
            }
        }

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j += 3) {

                for (int k = 0; k < 9; k += 3) {

                }
            }
        }
        return true;
    }
}
