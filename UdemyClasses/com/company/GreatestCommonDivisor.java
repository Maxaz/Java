package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int result = -1;
        if (first > 9 && second > 9) {
            int smallerVal;
            int biggerVal;
            if (first % second == 0) {
                return second;
            } else if (first > second) {
                biggerVal = first;
                smallerVal = second;
            } else {
                biggerVal = second;
                smallerVal = first;
            }
            for (int i = 1; i < smallerVal; i++){
                if ((biggerVal % i == 0) && (smallerVal % i == 0)){
                    result = i;
                }
            }
        }
        return result;
    }

    //first solution
//    public static int getGreatestCommonDivisor(int first, int second) {
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//        int smallerVal;
//        int biggerVal;
//        if (first % second == 0) {
//            return second;
//        } else if (first % second > 0) {
//            biggerVal = first;
//            smallerVal = second;
//        } else {
//            biggerVal = second;
//            smallerVal = first;
//        }
//        for (int divisor = 1; divisor <= smallerVal; divisor += 1) {
//            if (biggerVal % (smallerVal / divisor) == 0) {
//                return smallerVal / divisor;
//            }
//        }
//        return -1;
//    }
}
