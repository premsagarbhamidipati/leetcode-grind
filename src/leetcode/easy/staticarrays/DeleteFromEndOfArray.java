package leetcode.easy.staticarrays;

import java.util.Arrays;

public class DeleteFromEndOfArray {

    // Time Complexity : O(1)

    public static void main(String[] args) {
        int[] arr = {4,5,6};
        int len = arr.length;
        int length = removeEnd(arr, len);
        System.out.println("Array: "+ Arrays.toString(arr) + " Length is: "+ length);
    }

    // Remove from the last position in the array if the array is not empty (i.e. length is non zero)
    private static int removeEnd(int[] arr, int len) {
        if (len > 0) {
            // Override last element with some default value, we would also consider the length to be decreased by 1
            arr[len-1] = 0;
            len--;
        }
        return len;
    }
}
