package com.company;

public class PrimitiveTypesCourse {

    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////////
        // Primitive types
        int myValue = 1000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("int min value : " + myMinValue);
        System.out.println("int max value : " + myMaxValue);
        System.out.println("busted max value : " + (myMaxValue + 1));
        System.out.println("busted min value : " + (myMinValue - 1));

        // INT occupies 32 bits = int has a width of 32 ( 4 bytes )
        // Java 7++ accepts underscores in values of primitive types
        int myIntUnderscoreTest = 2_147_483_647;
        System.out.println("//////////////////////////////////////////////////////////////////////////////");

        // BYTE occupies 8 bits = byte has a width of 8 ( 1 byte )
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value : " + myMinByteValue);
        System.out.println("Byte max value : " + myMaxByteValue);
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        // SHORT occupies 16 bits = shorts has a width of 16 ( 2 bytes )
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value : " + myMinShortValue);
        System.out.println("Short max value : " + myMaxShortValue);
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        // LONG occupies 64 bits = long has a width of 64 ( 8 bytes )
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value :  " + myMinLongValue);
        System.out.println("Long max value : " + myMaxLongValue);
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        // Numerical values are by default casted into INT
        // an 'L' is needed at the end of the value to indicate it's a LONG value
        // long bigLongLiteralValue = 2_147_483_647_234;
        long bigLongValue = 2_147_483_647_234L;

        int myTotal = (myMinValue / 2);

        // Numerical values are by default casted into INT !!!
        //byte myNewByteValueLiteral =  (myMinByteValue / 2);
        // Casting into byte the new calculated value
        byte myNewByteValue = (byte) (myMinByteValue / 2);


        ///////////////////////////////////////
        // Challenge 1
        System.out.println("Challenge 1");
        byte myByteValue = 55;
        short myShortValue = 15000;
        int myIntValue = 130_000_000;
        long myLongTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println("myLongTotal : " + myLongTotal);

        ///////////////////////////////////////
        // Float & Double
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        // FLOAT has a width of 32 ( 4 bytes )
        // DOUBLE has a width of 64 ( 8 bytes )

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value :  " + myMinFloatValue);
        System.out.println("Float max value : " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value :  " + myMinDoubleValue);
        System.out.println("Double max value : " + myMaxDoubleValue);

        System.out.println("//////////////////////////////////////////////////////////////////////////////");

        // casting is not recommended for float
        float myFloatValue = (float) 5.25;
        int myIntFloatValue = 5 / 3;
        float myFloatSecondValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myFloatValue " + myFloatValue);
        System.out.println("myIntFloatValue " + myIntFloatValue);
        System.out.println("myFloatSecondValue " + myFloatSecondValue);
        System.out.println("myDoubleValue " + myDoubleValue);
        // Double > Float,
        // double is more precise and common in math calculations, libraries etc.
        System.out.println("//////////////////////////////////////////////////////////////////////////////");

        ///////////////////////////////////////
        // Challenge 2
        System.out.println("Challenge 2");

        double myPound = 200d;
        double myKilo = 1d;

        double myCalculatedPound = myKilo * (1d / 0.45359237d);
        double myCalculatedKilo = myPound * 0.45359237d;

        System.out.println("calculated pound : " + myCalculatedPound);
        System.out.println("calculated kilogram : " + myCalculatedKilo);

        // BIGDECIMAL IS THE BEST. don't use double :)

        System.out.println("//////////////////////////////////////////////////////////////////////////////");

        ///////////////////////////////////////
        ///////////////////////////////////////
        // char & boolean

        // Char is width of 16 bits ( 2 bytes )
        char myChar = 'ê';
        char myUnicodeChar = '\u00EA';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        boolean myTrueBool = true;
        boolean myFalseBool = false;
    }
}
