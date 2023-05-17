package SortedArray.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int findMin(int[] array){
        int result = Integer.MAX_VALUE;
        for(int i : array){
            if (i < result) result = i;
        }
        return result;
    }

    public static int[] sortIntegers(int[] array) {
        int[] temp = new int[array.length];
        int[] sortedArray = new int[array.length];
        temp = array.clone();
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            sortedArray[i] = temp[temp.length - 1 - i];
        }
        return sortedArray;
    }
}
