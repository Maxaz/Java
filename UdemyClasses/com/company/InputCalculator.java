package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        long avg = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
                avg = Math.round((double)sum/count);
            } else {
                break;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
