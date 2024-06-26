package leetcode.easy.staticarrays;

public class NeetCodeArrayInsertion {

    public static void main(String[] args) {

         int[] myArray = { 4, 5, 6, 0 };
        //int[] myArray = new int[5];
        myArray[0] = 4;
        myArray[1] = 5;
        myArray[2] = 6;

        int length = myArray.length;
        int indexPos = 1;
        int n = 8;
         insertMiddle(myArray, indexPos, n, length); // Pass indexPos instead of i
        //insertEnd(myArray, 50, length, 5);

        // Print the array after insertion
        for (int index = 0; index < myArray.length; index++) {
            System.out.println(myArray[index] + " ");
        }
    }

    private static void insertMiddle(int[] arr, int indexPos, int n, int length) {
        // Shift elements to the right starting from the end
        for (int index = length - 1; index > indexPos - 1; index--) {
            arr[index] = arr[index - 1];
        }
        // Insert at indexPos
        arr[indexPos] = n;
    }

    // Insert n into arr at the next open position.
    // Length is the number of 'real' values in arr, and capacity
    // is the size (aka memory allocated for the fixed size array).
    public static void insertEnd(int[] arr, int n, int length, int capacity) {
        arr[length - 1] = n;
    }

}
