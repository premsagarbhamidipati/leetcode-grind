package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Insertion in array having enough size
 * Source: Learn with Krishna Sandeep Youtube channel
 */
public class ArrayInsertion {
    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println("Enter the elements: ");
        Scanner sc = new Scanner(System.in);

        // insert elements in array
        // length means number of elements inside array not the size of the array
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing elements before insert: " + Arrays.toString(arr));

        System.out.println("Enter the location at which we want to insert: ");
        int location = sc.nextInt();

        System.out.println("Enter the value at which we want to insert: ");
        int value = sc.nextInt();

        // last position - array.length -1

        for (int i = arr.length - 1; i > location; i--) {
            arr[i] = arr[i - 1];
        }

        arr[location] = value;

        System.out.println("Final result of elements in array: " + Arrays.toString(arr));
    }
}
