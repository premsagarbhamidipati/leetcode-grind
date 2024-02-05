package leetcode.easy.staticarrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] nums = new int[size];

        for (int i=0; i < nums.length; i++) {
            Scanner scanner1 = new Scanner(System.in);
            int valAtIndex = scanner1.nextInt();
            nums[i] = valAtIndex;
        }

        System.out.println("Enter value to remove from the array: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int k = removeElement(nums, val);
        System.out.println("Output: " + k);
    }

    private static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println("Array contains: "+ Arrays.toString(nums));
        return i;
    }
}
