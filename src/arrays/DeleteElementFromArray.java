package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Time complexity: O(n) and Space complexity: O(1).
 */

public class DeleteElementFromArray {
    public static void main(String[] args) {

        int[] arr = new int[] { 10, 20, 30, 40 };

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the position of the element to be removed: ");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();

        // deleting logic
        for (int i = position; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
