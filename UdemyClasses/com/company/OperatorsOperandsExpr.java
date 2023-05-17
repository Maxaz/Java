package com.company;

public class OperatorsOperandsExpr {

    public static void main(String[] args) {

        // OPERATOR PRECEDENCE TABLE
        // http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        boolean isAlien = false;

        if (isAlien)
            System.out.println("It is not an alien!");
        System.out.println("And I am scared of aliens");
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        // AND operator
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // OR operator
        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean newBool = false;
        if (newBool = false) {
            System.out.println("This is a mistake");
        }
        if (!newBool) {
            System.out.println("this is a negation test");
        }

        // Ternary Operator
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar : " + wasCar);
        wasCar = isCar ? false : true;
        System.out.println("wasCar : " + wasCar);

        // Operator challenge 1
        System.out.println("//////////////////////");
        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;

        double myTotalDouble = myDouble + mySecondDouble;
        myTotalDouble *= 100.00d;

        double myRemainderDouble = myTotalDouble % 40.00d;

        boolean myDoubleCheck = myRemainderDouble == 0;

        if (!myDoubleCheck) System.out.println("Got some remainder");

        System.out.println("the result of the challenge : " + myDoubleCheck);


    }
}
