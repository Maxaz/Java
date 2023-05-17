package SortedArray.exercise;

public class Main {
    public static void main(String[] args) {
        int[] arr = SortedArray.getIntegers(5);
        SortedArray.printArray(arr);
        System.out.println("*********************************************");
        int[] sortedArr = SortedArray.sortIntegers(arr);
        SortedArray.printArray(sortedArr);
    }
}
