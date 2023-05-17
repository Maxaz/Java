package MinimumElement.exercise;

import java.util.Scanner;

public class MinimumElement {

    private static int getIntegers() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                scanner.nextLine();
            }
        return result;
    }

    private static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
                scanner.nextLine();
            }
        }
        return arr;
    }

    private static int findMin(int[] array){
        int result = Integer.MAX_VALUE;
        for(int i : array){
            if (i < result) result = i;
        }
        return result;
    }
}
