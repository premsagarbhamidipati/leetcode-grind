package sorting;

import java.util.Arrays;

/**
 * Insertion sort algorithm - after comparing the element to the left
 * shift elements to the right to make room to insert a value
 *
 * Quadratic time O(n^2)
 * small data set = decent
 * large data set = BAD
 *
 * Less steps in bubble sort
 * Best cae is O(n) compared to Selection sort O(n^2)
 */

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = { 9, 1, 8, 2, 7, 3, 6, 5, 4 };
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {

        // create for loop
        for (int i = 1; i < array.length; i++) {
            // take value from array and put in temp
            int temp = array[i];
            // this will keep track of what value we are comparing to the left of whatever i
            // is
            int j = i - 1;

            // create a while loop to compare the values to the left of i
            while (j >= 0 && array[j] > temp) {
                // shift an element to the right
                array[j + 1] = array[j];
                j--;

            }
            // insert the value of temp into the empty place after moving to right once while loop is completed
            // and no more elements exists to move towards right
            array[j + 1] = temp;
        }
    }

}
