package leetcode.easy.staticarrays;

import java.util.Arrays;


/**
 * Time complexity: O(n)
 */
public class TwoSumII {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] indices = twoSum(nums,target);
        System.out.println(Arrays.toString(indices));
    }

    private static int[] twoSum(int[] nums, int target) {
        int start = 0; // start from 0th index
        int end = nums.length-1; // last accessible element in the array

        int[] result = new int[2]; // holds the indices

        // if sum of two numbers is greater than target, move end pointer towards left <-
        // if sum of the two number is less than the target, move the start pointer towards right ->

        // iterate over the array until start < end

        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum == target) {

                // as per the problem statement, index start from 1, so we are adding 1 to start and end indexes
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }

        }
        return result;
    }
}
