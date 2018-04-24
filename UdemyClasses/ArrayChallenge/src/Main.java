import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int arrayLen) {
        System.out.println("Provide " + arrayLen + " integers:");
        int[] array1 = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            array1[i] = scanner.nextInt();
        }
        return array1;
    }

    public static int[] sortIntegers(int[] array) {
        int[] array2 = new int[array.length];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            array2[array.length-1-i] = array[i];
        }
        return array2;
    }

    public static void printArray(int[] array) {
        System.out.println("The sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("The element " + i + " value is: " + array[i]);
        }

    }

    public static void main(String[] args) {

        System.out.println("How many integers you want to sort descending? ");
        int arrayLen = scanner.nextInt();
        printArray(sortIntegers(getIntegers(arrayLen)));
    }
}
