package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * TwoSum
 * Time Complexity : O(n) as we are looping through the array once
 * Space Complexity: O(n) because a hashmap is used to store the array elements
 * and their indices
 */
public class TwoSum {

    public static void main(String[] args) {

        int len = 0, target = 9;
        System.out.println("Enter length of the array");
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();
        int[] nums = new int[len];
        System.out.println("Enter numbers to store in array");

        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }

        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));

    }

    private static int[] twoSum(int[] nums, int target) {

        // Create a map to store the numbers and their indices.
        Map<Integer, Integer> numsMap = new HashMap<>();

        // Iterate over the numbers in the array.
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number.
            int complement = target - nums[i];
            // If the complement exists in the map, return the indices.
            if (numsMap.containsKey(complement)) {
                // we are putting indices in the array
                return new int[] { numsMap.get(complement), i };
            } else {
                // if complement does not exist in numsMap, then put nums[i] (current number)
                // and index to map
                numsMap.put(nums[i], i);
            }
        }
        // If no two numbers sum up to the target, return No match found.
        throw new IllegalArgumentException("No match found");
    }
}