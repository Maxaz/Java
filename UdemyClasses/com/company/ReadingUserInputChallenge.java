package com.company;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        printSumOfUserValidNumbers();
    }

    public static void printSumOfUserValidNumbers() {
        int countValidNumbers = 0;
        int sumUserValidNumbers = 0;
        Scanner scanner = new Scanner(System.in);
        while(countValidNumbers < 10){
            System.out.println("Enter number #" + (countValidNumbers + 1));
            if (scanner.hasNextInt()){
                sumUserValidNumbers += scanner.nextInt();
                countValidNumbers++;
            } else System.out.println("Invalid Number");
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("The sum is " + sumUserValidNumbers);
        scanner.close();
    }

}
