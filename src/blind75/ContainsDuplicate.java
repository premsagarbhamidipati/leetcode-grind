package blind75;

import java.util.HashSet;
import java.util.Set;

/**
 * ContainsDuplicate
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] intSet = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean containsDuplicate = containsDuplicate(intSet);
        System.out.println("The array contains duplicate : " + containsDuplicate);
    }

    private static boolean containsDuplicate(int[] nums) {

        // create a hashset to store integers
        Set<Integer> intSet = new HashSet<>();
        for (int num : nums) {
            if (intSet.contains(num)) {
                return true;
            } else {
                intSet.add(num);
            }
        }
        return false;
    }
}