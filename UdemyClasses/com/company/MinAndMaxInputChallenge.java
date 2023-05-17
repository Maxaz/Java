package com.company;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minValue = 0;
        int maxValue = 0;
        int readValue;
        boolean isFirstPass = true;
        while(true){
            System.out.println("Enter number : ");
            if (scanner.hasNextInt()){
                readValue = scanner.nextInt();
                if (readValue > maxValue){
                    maxValue = readValue;
                } else if (readValue < minValue) {
                    minValue = readValue;
                }
                if (isFirstPass) {
                    minValue = readValue;
                    maxValue = readValue;
                    isFirstPass = false;
                }
            } else {
                System.out.println("minValue : " + minValue + " maxValue : " + maxValue);
                break;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        //System.out.println("The sum is " + sumUserValidNumbers);
        scanner.close();
    }
}
