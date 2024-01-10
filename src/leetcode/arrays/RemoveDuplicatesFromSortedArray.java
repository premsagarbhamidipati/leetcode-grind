package leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }

    private static int[] removeDuplicates(int[] nums) {

        // initialize a variable for previous number
        int prev = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i]  != nums[prev]) {
                prev++;
                nums[prev] = nums[i];
            }
        }
        return nums;
    }
}
