package leetcode.easy.staticarrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] arr = shuffleArr(nums, n);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] shuffleArr(int[] nums, int n) {
        int[] shuffled = new int[nums.length];

        // i< n ?? n is half of the array
        for (int i=0; i < n; i++) {
            /**
             * shuffled[2*i]: index position
             * nums[n+i] = value at that index
              */

            shuffled[2*i] = nums[i];
            shuffled[2*i + 1] = nums[n+i];
        }
        return shuffled;
    }
}
