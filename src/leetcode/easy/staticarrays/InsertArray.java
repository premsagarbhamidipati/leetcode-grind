package leetcode.easy.staticarrays;

import java.util.Arrays;

public class InsertArray {

    /**
     * Code taken from Coding Simplified YouTube channel
     */

    int count = 0;

    /**
     * Insertion of elements in Array
     * Concept: In Java, arrays are fixed in size, so you can't directly add
     * elements to them.
     * You can create a new, larger array and copy the old elements and the new
     * element into it.
     * 
     * @param args
     */

    public static void main(String[] args) {

        InsertArray insArr = new InsertArray();

        int[] arr = new int[5];

        for (int j = 0; j < arr.length; j++) {
            insArr.insert(arr, j + 1);
            System.out.println(Arrays.toString(arr));
        }

        // insertAtStart(arr, 50);
        insertAtPosition(arr, 0, 67);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    private void insert(int[] arr, int val) {
        arr[count++] = val;
    }

    private static void insertAtStart(int[] arr, int val) {
        // traverse backwards
        for (int index = arr.length - 1; index > 0; index--) {
            // shifting each element towards right of the array while inserting at the start
            // of the index
            arr[index] = arr[index - 1];
        }
        // insert at start so 0th index
        arr[0] = val;
    }

    // at any given position
    private static void insertAtPosition(int[] arr, int position, int val) {
        for (int index = arr.length - 1; index > position; index--) {
            arr[index] = arr[index - 1];
        }
        arr[position] = val;
    }

}
