package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number){
        if (number<=1){
            return -1;
        }
        int p = 2;
        int px2 = 1;
        while (number >= p * p){
            if (number % p == 0){
                px2 = px2 * p;
                number = number / p;
            }  else {
                p++;
            }
        }
        return number;
    }
}
