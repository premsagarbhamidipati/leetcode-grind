package blind75;

import static java.lang.Math.max;

/*
 * Time Complexity : O(n) linear complexity
 * Space Complexity: O(1) 
 * Approach : Kadane's Algorithm
 */
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int answer = maxSubArray(nums);
        System.out.println("Max sub array sum is: " + answer);
    }

    public static int maxSubArray(int[] nums) {
        // set answer to min value
        int answer = Integer.MIN_VALUE;

        // at the beginning sum is 0
        int sum = 0;

        // iterate over the array
        for (int num : nums) {
            // num is current element value at the index, sum + num is trying to calculate
            // max ; i.e. current element + prev summed value and updating the sum value
            sum = max(num, sum + num);
            // update answer with max value
            answer = max(answer, sum);
        }
        return answer;
    }
}
