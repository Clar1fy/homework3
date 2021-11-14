package com.company;

public class Main {

    public static void main(String[] args) {
        double[] justDouble = {85.5, 123.1, 123.2, -12.1, 164.1, -53.3, 539.9, -123.9, 921.0, 121.1, -911.6, 317.3, 537.1, 538.6, 133.1};
        double sum = 0;
        int negativeNumbers = 0;
        boolean negative = false;
        for (double d : justDouble) {
            if (d < 0) {
                negative = true;
            } else {
                if (negative) {
                    negativeNumbers++;
                    sum += d;
                }
            }



        }
        System.out.println("Average " + sum / negativeNumbers);
        int[] metamorphosis = {-4, -7,1,5 ,8,2};
        int duration =0;
        for (int i = 0; i < metamorphosis.length; i++) {
            for (int j = i+1; j < metamorphosis.length; j++) {
                if(metamorphosis[i] > metamorphosis[j]) {
                    duration = metamorphosis[i];
                    metamorphosis[i] = metamorphosis[j];
                    metamorphosis[j] = duration;

                }
                
            }
            
        }
        System.out.println("Elements of the array sorted in the ascending order");
        for (int i = 0; i < metamorphosis.length; i++) {
            System.out.println(metamorphosis[i]);
            
        }
    }






}




