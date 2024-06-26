package leetcode.easy.staticarrays;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the array: ");
        int capacity = sc.nextInt();

        // allocating a memory
        int[] nums = new int[capacity];

        for (int i = 0; i < nums.length; i++) {
            Scanner scanner = new Scanner(System.in);
            nums[i] = scanner.nextInt();
        }
        System.out.println("Values in array nums are: " + Arrays.toString(nums));

        int[] arr = buildArray(nums);
        System.out.println("Values in array nums are: " + Arrays.toString(arr));
    }



    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Approach: Brute Force Approach
     * @param nums
     * @return result
     */
/*    private static int[] buildArray(int[] nums) {

        //creating new result array and storing it , extra space O(n)
        int[] result = new int[nums.length];

        // we are looping, so time complexity O(n)
        for (int i=0; i< nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }*/

    /**
     * Approach: O(1) Space complexity
     *
     */

    private static int[] buildArray(int[] nums) {
        int mask = 1023;

        for (int i = 0; i < nums.length; i++) {
            // using left shift operator, here we add 10 0's to the binary number to acquire the result and assigning
            nums[i] = nums[i] | (nums[nums[i]] & mask ) << 10;
        }
        for (int i = 0; i < nums.length; i++) {
            // using right shift operator
            nums[i] = nums[i] >> 10;
        }
        return nums;
    }
}
