package leetcode.easy.staticarrays;

import java.util.Arrays;
import java.util.Scanner;


/**
 * LeetCode #88
 * Time Complexity: O(m+n)
 * Space Complexity: O(1)
 */

public class MergeTwoSortedArrays {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for m: ");
        int m = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter value for n: ");
        int n = scanner1.nextInt();


        int[] nums1 = new int[m+n];
        System.out.println("Enter elements in nums1: ");
        fillArray(nums1);

        int[] nums2 = new int[n];
        System.out.println("Enter elements in nums2: ");
        fillArray(nums2);


        System.out.println(Arrays.toString(nums1) + " " + Arrays.toString(nums2));

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

    private static void fillArray(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            Scanner scanner2 = new Scanner(System.in);
            arr[index] = scanner2.nextInt();
        }
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (j>=0) {
            if (i>=0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;

            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}
