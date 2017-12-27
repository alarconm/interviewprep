package com.company;

public class RotateImage {

    int[][] rotateImage(int[][] a) {

        int length = a.length;
        int[][] rotated = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                rotated[i][j] = a[(length - 1) - j][i];
            }
        }
        return rotated;
    }
}
