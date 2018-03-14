package com.maxnazarski;

public class Series {

    public static int nSum(int n) {
        int sum = n;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                sum += i;
            }
        } else if (n<0){
            return -1;
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            int factor = n;
            for (int i = 1; i < n; i++) {
                factor *= i;
            }
            return factor;
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
