package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Sudoku2 {
    public static boolean sudoku2(char[][] grid) {

        char[][] columns = new char[9][9];
        char[][] rows = new char[9][9];
        ArrayList<ArrayList<Character>> subGrids = new ArrayList<>();
        HashMap<Character, Integer> columnCheck = new HashMap<>();
        HashMap<Character, Integer> rowCheck = new HashMap<>();
        HashMap<Character, Integer> subGridCheck = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            rows[i] = grid[i];

            for (int j = 0; j < 9; j++) {
                columns[i][j] = grid[j][i];
            }
        }

        for (int i = 0; i < 9; i+= 3) {

            for (int k = 0; k < 9; k += 3) {

                ArrayList<Character> temp = new ArrayList<>();
                for (int j = 0; j < 3; j ++) {
                    temp.add(grid[j + k][i]);
                    temp.add(grid[j + k][i+1]);
                    temp.add(grid[j + k][i+2]);
                }
                subGrids.add(temp);
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (columns[i][j] != '.') {
                    if (columnCheck.containsKey(columns[i][j])) {
                        System.out.println("FalseColumncheck");
                        return false;
                    } else {
                        columnCheck.put(columns[i][j], 0);
                    }
                }

                if (rows[i][j] != '.') {
                    if (rowCheck.containsKey(rows[i][j])) {
                        System.out.println("FalseRowcheck");
                        return false;
                    } else {
                        rowCheck.put(rows[i][j], 0);
                    }
                }

                if (!subGrids.get(i).get(j).equals('.')) {
                    if (subGridCheck.containsKey(subGrids.get(i).get(j))) {
                        System.out.println("Falsesubgrid");
                        return false;
                    } else {
                        subGridCheck.put(subGrids.get(i).get(j), 0);
                    }
                }
            }
            columnCheck.clear();
            rowCheck.clear();
            subGridCheck.clear();
        }

        System.out.println("True");
        return true;
    }
}

////Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid all contain all of the numbers from 1 to 9 one time.
//
//    Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku puzzle according to the layout rules described above. Note that the puzzle represented by grid does not have to be solvable.
//
//        Example
//
//        For
//
//        grid = [['.', '.', '.', '1', '4', '.', '.', '2', '.'],
//        ['.', '.', '6', '.', '.', '.', '.', '.', '.'],
//        ['.', '.', '.', '.', '.', '.', '.', '.', '.'],
//        ['.', '.', '1', '.', '.', '.', '.', '.', '.'],
//        ['.', '6', '7', '.', '.', '.', '.', '.', '9'],
//        ['.', '.', '.', '.', '.', '.', '8', '1', '.'],
//        ['.', '3', '.', '.', '.', '.', '.', '.', '6'],
//        ['.', '.', '.', '.', '.', '7', '.', '.', '.'],
//        ['.', '.', '.', '5', '.', '.', '.', '7', '.']]
//        the output should be
//        sudoku2(grid) = true;
//
//        For
//
//        grid = [['.', '.', '.', '.', '2', '.', '.', '9', '.'],
//        ['.', '.', '.', '.', '6', '.', '.', '.', '.'],
//        ['7', '1', '.', '.', '7', '5', '.', '.', '.'],
//        ['.', '7', '.', '.', '.', '.', '.', '.', '.'],
//        ['.', '.', '.', '.', '8', '3', '.', '.', '.'],
//        ['.', '.', '8', '.', '.', '7', '.', '6', '.'],
//        ['.', '.', '.', '.', '.', '2', '.', '.', '.'],
//        ['.', '1', '.', '2', '.', '.', '.', '.', '.'],
//        ['.', '2', '.', '.', '3', '.', '.', '.', '.']]
//        the output should be
//        sudoku2(grid) = false.
//
//        The given grid is not correct because there are two 1s in the second column. Each column, each row, and each 3 × 3 subgrid can only contain the numbers 1 through 9 one time.
//
//        Input/Output
//
//        [execution time limit] 3 seconds (java)
//
//        [input] array.array.char grid
//
//        A 9 × 9 array of characters, in which each character is either a digit from '1' to '9' or a period '.'.
//
//        [output] boolean
//
//        Return true if grid represents a valid Sudoku puzzle, otherwise return false.