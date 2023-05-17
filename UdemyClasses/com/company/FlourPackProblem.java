package com.company;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            int sum = (5 * bigCount) + smallCount;
            if (sum >= goal){
                if (bigCount > 0){
                    return goal % 5 <= smallCount;
                } else {
                    return true;
                }
            } else {
                return false;
            }

        }
    }
}
