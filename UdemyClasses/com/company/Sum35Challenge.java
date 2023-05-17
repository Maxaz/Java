package com.company;

public class Sum35Challenge {
    public static void main(String[] args) {
        int resultValue = 0;
        int countResults = 0;
        for (int number = 1; number <= 1000; number++){
            if (countResults < 5){
                if (number % 3 == 0 && number % 5 == 0){
                    System.out.println(number);
                    resultValue += number;
                    countResults++;
                }
            } else {
                System.out.println("Result is : " + resultValue);
                break;
            }
        }
    }
}
