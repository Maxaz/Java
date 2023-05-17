package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String findNumber(List<Integer> arr, int k){
        if (arr.contains(k)) return "YES";
        else return "NO";

    }

    public static List<Integer> oddNumbers(int l, int r){
        List<Integer> resultList = new ArrayList<>();
        for (int i = l; i <= r ; i++){
            if (i % 2 == 1) resultList.add(i);
        }
        return resultList;

    }

    public static int changeAds(int base10){
        String binString = Integer.toBinaryString(base10);
        System.out.println(binString);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : binString.toCharArray()){
            if (c == '1') stringBuilder.append('0');
            if (c == '0') stringBuilder.append('1');
        }
        String resultString = stringBuilder.toString();
        int result = Integer.parseInt(resultString,2);
        return result;
    }
    public static void increment(int[] i){
        i[i.length - 1]++;

    }

    public static void main(String[] args) {
//        System.out.println(changeAds());
//
//        System.out.println(changeAds(30));
        // 5A + 4B =  400 A + 1600/3 B
        /*int[] a = {1};
        System.out.println(a[a.length - 1]);
        increment(a);

        int [][] curPos = new int[0;0];

        double d = 10.0 / -0;
        if (d == Double.POSITIVE_INFINITY){
            System.out.println("Positive infinity");
        } else
            System.out.println("Negative infinity");

        List<Integer> arr = new ArrayList<>();
        //{3,2,3,1,5}
        arr.add(3);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(5);

        System.out.println(findNumber(arr,74));*/
       //arr.contains(5);

        /* Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());*/

        /*Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());*/

        /* ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());*/

        /*Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());*/

        /*Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());*/


        /* Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());*/


        /* Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());*/


        /*SumCalculator calculator = new SumCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());*/

        /*printSquareStar(3);
        printSquareStar(5);
        System.out.println();
        printSquareStar(8);*/
//
//        int myFirstNumber = (10 + 5) + (2 * 10);
//        int mySecondNumber = 12;
//        int myThirdNumber = myFirstNumber * 2;
//        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
//        int myLastOne = 1000 - myTotal;
//        System.out.println("This is my myLastOne number : " + myLastOne);

        //////////////////////////////////////////
        // SpeedConverter exercise

//        long miles = SpeedConverter.toMilesPerHour(10.5);
//        System.out.println("miles = " + miles);
//        //
//        SpeedConverter.printConversion(10.5);

        //////////////////////////////////////////
        // Decimal Comparator exercise

//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175));
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175,3.176));
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0,3.0));
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123,3.123));
//
        //////////////////////////////////////////
        // Equal Sum exercise

//        System.out.println(EqualSumChecker.hasEqualSum(1,1,1));
//        System.out.println(EqualSumChecker.hasEqualSum(1,1,2));
//        System.out.println(EqualSumChecker.hasEqualSum(1,-1,0));

        //////////////////////////////////////////
        // Equal Sum exercise

//        System.out.println(TeenNumberChecker.hasTeen(9,99,19));
//        System.out.println(TeenNumberChecker.hasTeen(23,15,42));
//        System.out.println(TeenNumberChecker.hasTeen(22,23,34));

        //////////////////////////////////////////
        // MinutesToYearsDaysCalculator exercise

//        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
//        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
//        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

        //////////////////////////////////////////
        // Greatest Common Divisor
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25,15));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,30));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9,18));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81,153));
////        inverted values
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(15,25));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(30,12));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(18,9));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(153,81));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(132,1573));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(1573,132));
//
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(10,35));

        //////////////////////////////////////////
        // FlourPack Problem

//        System.out.println(FlourPackProblem.canPack(1,0,4));
//        System.out.println(FlourPackProblem.canPack(1,0,5));
//        System.out.println(FlourPackProblem.canPack(0,5,4));
//        System.out.println(FlourPackProblem.canPack(2,2,11));
////        System.out.println(11 % 10);
////
//        System.out.println(FlourPackProblem.canPack(2,1,5));
//        System.out.println(FlourPackProblem.canPack(2,7,18));
//        System.out.println(FlourPackProblem.canPack(2,10,18));

        //////////////////////////////////////////
        // Largest Prime
/*
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(7));
*/

    }

    public static void printSquareStar(int number) {
        if (number > 4) {
            int rowNum = number;
            while (rowNum > 0) {
                int colNum = number;
                while (colNum > 0) {
                    if ((colNum == number) || (colNum == 1) || (rowNum == number) || (rowNum == 1) || (rowNum == colNum) || (colNum == (number - rowNum + 1))) {
                        System.out.print("*");
                    } else System.out.print(" ");
                    colNum--;
                }
                System.out.println();
                rowNum--;
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
