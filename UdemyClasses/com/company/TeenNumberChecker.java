package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue){
        return isTeen(firstValue) || isTeen(secondValue) || isTeen(thirdValue);
    }

    public static boolean isTeen(int firstValue){
        return firstValue >= 13 && firstValue <= 19;
    }
}
