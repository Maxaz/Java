package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("You name is : " + name);
        System.out.println("Enter your year of birth : ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
            if (age <= Calendar.getInstance().get(Calendar.YEAR) && yearOfBirth > 0) {
                System.out.println("Your age is : " + age);
            } else System.out.println("Invalid year of birth");
        }
        scanner.close();
    }
}
