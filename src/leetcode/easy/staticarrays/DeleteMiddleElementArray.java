package leetcode.easy.staticarrays;

import java.util.Arrays;

/**
 * Time Complexity: O(n)
 * worst case n-1 shifts may be required
 */
public class DeleteMiddleElementArray {
    public static void main(String[] args) {
        int[] arr = {12, 11, 23, 26};
        int i = 2;
        int length = arr.length;;
        removeMiddle(arr, i, length);
        System.out.println(Arrays.toString(arr));
    }

    private static void removeMiddle(int[] arr, int i, int length) {
        // Shift starting from i + 1 to end.
        for (int index = i + 1; index < length; index++) {
            arr[index-1] = arr[index];
        }
    }

}
