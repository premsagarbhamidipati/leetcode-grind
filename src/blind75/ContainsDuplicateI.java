package blind75;

import java.util.Arrays;

public class ContainsDuplicateI {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        boolean containsDuplicate = containsDuplicate(nums);
        System.out.println("The array contains duplicate : " + containsDuplicate);
    }

    private static boolean containsDuplicate(int[] nums) {
        // first sort the array
        Arrays.sort(nums);
        // why nums.length - 1 ?? if you do not check length - 1, then the condition in
        // "if" we are doing i+1 will increase the array length and check for last
        // element which does not exist in the array and will throw
        // ArrayIndexOutOfBoundsException
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

}
