package com.company;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {
        long firstDoubleLong = (long) (firstDouble * 1000d);
        long secondDoubleLong = (long) (secondDouble * 1000d);
        return firstDoubleLong == secondDoubleLong;
    }
}
