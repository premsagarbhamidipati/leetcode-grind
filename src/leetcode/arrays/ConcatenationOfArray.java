package leetcode.arrays;

import java.util.Arrays;

public class ConcatenationOfArray {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] concatenation = getConcatenation(nums);
        System.out.println(Arrays.toString(concatenation));
    }

    public static int[] getConcatenation(int[] nums) {
        // Store length of the array into len
        int len = nums.length;

        // Create new array ans and double the length
        int[] ans = new int[2 * len];

        // Iterate over the length of the array
        for (int i = 0; i < len; i++) {
            // copy each value at index i , assign value at nums[i] to ans[i]
            ans[i] = nums[i];
            // append the element to the end of the array
            ans[i + len] = nums[i];
        }
        return ans;
    }
}
