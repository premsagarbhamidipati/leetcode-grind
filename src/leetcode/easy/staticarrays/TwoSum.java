package leetcode.easy.staticarrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Two pointer approach
 * Time Complexity: O(n)
 */
public class TwoSum {

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
        System.out.println("Enter the target: ");
        Scanner scTarget = new Scanner(System.in);
        int target = scTarget.nextInt();
        int[] result = twoSum(nums, target);
        System.out.println("Returned indices are: " +Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        // Create a map to store the numbers and their indices.
        Map<Integer, Integer> numsMap = new HashMap<>();

        // Iterate over the numbers in the array.
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number.
            int complement = target - nums[i];

            if (numsMap.containsKey(complement)) {
                // If the complement exists in the map, return the indices.
                return new int[] {numsMap.get(complement), i};
            } else {
                // Otherwise, add the current number and its index to the map.
                numsMap.put(nums[i],i);
            }
        }
        // If no two numbers sum up to the target, return No match found.
        throw new IllegalArgumentException("No match found!");
    }

    /*private static int[] twoSum(int[] nums, int target) {
        for (int i = 0 ; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int complement = target - nums[i];

                if (nums[j] == complement) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No match found");
    }*/


}
