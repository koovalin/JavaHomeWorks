package HomeWorks;

import java.util.Arrays;
import java.util.Scanner;

public class homeWork_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи число: ");
        int numToSort = Integer.parseInt(scan.next());
        int[] myArray = new int[]{3, 4, 6, 7, 5, 2, 1, 5, 4, 3, 2, 1, 4, 5, 4};
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Sorted array: " + Arrays.toString(arraySort(myArray, numToSort)));
    }

    private static int[] arraySort(int[] arr, int numToSort) {
        int len = arr.length;
        int[] intArray = new int[len];
        int i = 0;
        for(int number = 0; number < len; number++) {
            if (arr[number] != numToSort) {
                intArray[i] = arr[number];
                i++;
            }
            if (number + 1 == len) {
                for (int j = i; j < len; j++) {
                    intArray[j] = numToSort;
                }
            }
        }
        return intArray;
    }
}