package leetcode.easy.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {
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
        boolean hasDuplicate = containsDuplicate(nums);
        System.out.println("Contains duplicate: "+hasDuplicate);
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        // when the pointer is at last second index, it compares with the next number which is i+1 and if match does not exist return false
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
