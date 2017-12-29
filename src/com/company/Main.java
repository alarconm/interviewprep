package com.company;

public class Main {

    static String[] crypt = {"AAAAAAAAAAAAAA", "BBBBBBBBBBBBBB", "CCCCCCCCCCCCCC"};
    static char[][] solution = {
            {'A', '0'},
            {'B', '1'},
            {'C', '2'}};

    public static void main(String[] args) {


	// write your code here
        IsCryptSolution.isCryptSolution(crypt, solution);
      }


}
