package ReverseArray.challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        reverse(arr);
    }

    private static void reverse(int[] array) {
        System.out.println("Before reverse");
        System.out.println("Array = " + Arrays.toString(array));
        int[] temp = array.clone();
        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[temp.length - 1 - i];
        }
        System.out.println();
        System.out.println("*******************************");
        System.out.println("After reverse");
        System.out.println(Arrays.toString(array));
    }

    private static void reverse2(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }
}
