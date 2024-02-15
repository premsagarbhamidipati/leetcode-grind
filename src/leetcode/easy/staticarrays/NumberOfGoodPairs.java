package leetcode.easy.staticarrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * LeetCode # 1512
 * Time Complexity:
 * Space Complexity:
 */
public class NumberOfGoodPairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the array: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        fillElementsinArray(nums);
        int res = numIdenticalPairs(nums);
        System.out.println("Number of good pairs are: " +res);
    }

    /**
     * Constraints:
     *
     * 1 <= nums.length <= 100
     * 1 <= nums[i] <= 100
     *
     * Approach 3 :
     * First we can count the frequency of each numbers using array.
     * If a number appears n times, then n * (n – 1) / 2 pairs can be made with this number.
     * @param nums
     * @return
     */
    private static int numIdenticalPairs(int[] nums) {

        int ans = 0;
        // we defined the size as 101, as the constraint is 1 to 100 only
        int[] count = new int[101];

        for (int n: nums)
            count[n]++;

        for (int n: count)
            ans = ans + (n * (n-1)) / 2;
        return ans;
    }

    /**
     * Approach 2
     * Count the number of occurrences of each number
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param nums
     * @return ans
     */
/*    private static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int ans = 0 ;

        for (int num: nums) {
            ans += counts.getOrDefault(num,0);

            //count the number of occurrences of each number
            counts.put(num, counts.getOrDefault(num,0)+1);
        }
        return ans;
    }*/

    /**
     * Approach 1
     * Method 1: Using two for loops, check all these pairs and count the number of pairs
     * If the numbers at the indices match, increment the answer.
     * Time Complexity: O(n2)
     * Space Complexity: O(1)
     * @param ans
     */
/*    private static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }*/

    private static void fillElementsinArray(int[] nums) {
        System.out.println("Enter the elements to fill the array: ");
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < nums.length; i++) {
            int val = scanner.nextInt();
            nums[i] = val;
        }
    }


}
