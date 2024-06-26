package leetcode.easy.staticarrays;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int num = singleNumber(nums);
        System.out.println(num);
    }


    /**
     * Approach: Bit Manipulation
     * @param nums
     * @return
     */
    private static int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}
