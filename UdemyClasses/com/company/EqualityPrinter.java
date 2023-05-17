package com.company;

public class EqualityPrinter {

    public static void printEqual(int firstVal, int secondVal, int thirdVal){
        if (firstVal < 0 || secondVal < 0 || thirdVal < 0){
            System.out.println("Invalid Value");
        } else if(firstVal == secondVal && secondVal == thirdVal){
            System.out.println("All numbers are equal");
        } else if(firstVal != secondVal && firstVal != thirdVal && secondVal != thirdVal){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
