package com.company;

public class WhileStatement {
    public static void main(String[] args) {
        boolean testCheck = false;
        int counter = 0;
        while (!testCheck){
//            System.out.println("it executes!");
            counter++;
            if (counter == 4) {
                System.out.println("skip at " + counter);
                continue;
            }
            if (counter == 5) {
                System.out.println("break at " + counter);
                break;
            }
            System.out.println("counter at " + counter);
            testCheck = counter == 8;
        }
        //
        // while checks the condition before executing the code block
        // do while checks the condition after executing the code block
        do {
            counter++;
            System.out.println("hello do-while, counter at " + counter);
        } while (counter <= 8);

    }
}
