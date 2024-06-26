package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Source: Study Tonight
 */

public class ArrayInsertionII {

    public static int[] addElement(int n, int arr[], int ele, int pos) {
        int i;

        // create a new array of size n+1
        int[] newArr = new int[n + 1];

        // insert the elements from the old array into the new array

        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1) {
                newArr[i] = arr[i]; // insert all elements till position
            } else if (i == pos - 1) {
                newArr[i] = ele; // then insert element at specific position
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n; // Array size declaration

        System.out.println("Enter the number of elements: ");
        n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the elements you want to insert: ");

        int ele = scanner.nextInt();

        // position to insert
        System.out.println("Enter the position where you want to insert: ");
        int pos = scanner.nextInt();

        arr = addElement(n, arr, ele, pos);
        System.out.println("Final elements in the array: " + Arrays.toString(arr));
    }

}
