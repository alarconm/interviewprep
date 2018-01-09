package com.company;

import java.text.DecimalFormat;

public class Histo {

    double[] histogram = {0,0,0,0,0,0,0,0,0,0};

    public Histo(int[] age) {

        for (int i = 0; i < age.length; i++) {

            if (age[i] < 10) {
                histogram[0] += 1;
            }
            if (age[i] > 9 && age[i] < 20) {
                histogram[1] +=1;
            }
            if (age[i] > 19 && age[i] < 30) {
                histogram[2] += 1;
            }
            if (age[i] > 29 && age[i] < 40) {
                histogram[3] +=1;
            }
            if (age[i] > 39 && age[i] < 50) {
                histogram[4] += 1;
            }
            if (age[i] > 49 && age[i] < 60) {
                histogram[5] +=1;
            }
            if (age[i] > 59 && age[i] < 70) {
                histogram[6] += 1;
            }
            if (age[i] > 69 && age[i] < 80) {
                histogram[7] +=1;
            }
            if (age[i] > 79 && age[i] < 90) {
                histogram[8] += 1;
            }
            if (age[i] > 89 && age[i] < 100){
                histogram[9] +=1;
            }
        }

        for (int i = 0; i < histogram.length; i++) {
            double temp = (double)histogram[i] / age.length;
            histogram[i] = Math.round(temp*100.0)/100.0;

        }

    }

    public double[] getHisto() {

        for (int i = 0; i < histogram.length; i++) {
            System.out.println(histogram[i]);
        }

        return histogram;
    }
}
