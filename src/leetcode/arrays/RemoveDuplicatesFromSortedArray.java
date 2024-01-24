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

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }

    private static int[] removeDuplicates(int[] nums) {

        // initialize a variable for previous number
        int lftPntr = 0;

        for (int rtPntr = 1; rtPntr < nums.length; rtPntr++) {

            if (nums[rtPntr]  != nums[lftPntr]) {
                lftPntr++;
                nums[lftPntr] = nums[rtPntr];
            }
        }
        return nums;
    }



/*    class Solution {

//nums[insertIndex] is left pointer, nums[i] is right pointer which is scanning through the array
        public int removeDuplicates(int[] nums) {
            int insertIndex = 1;
            for(int i = 1; i < nums.length; i++){
                // We skip to next index if we see a duplicate element
                if(nums[i - 1] != nums[i]) {
                *//* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 *//*
                    nums[insertIndex] = nums[i];

                    // we increment the insertIndex after storing a unique element
                    insertIndex++;
                }
            }
            return insertIndex;
        }
    }*/
}
