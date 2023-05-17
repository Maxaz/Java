package com.company;

public class CodeBlockIfThenElse {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 5000;
//        int levelCompleted = 5;
//        int bonus = 100;

//        if (score < 5000 && score > 1000){
//            System.out.println("Your score was nearly 5000");
//            System.out.println("This was amazing");
//        } else if (score < 1000){
//            System.out.println("Score is less than 1000");
//        }
//        else {
//            System.out.println("Got Here");
//        }

//        if (gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        calculateScore(true,5000,5,100);
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
        calculateScore(true,10000,8,200);

//        if (gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
