package blind75;

/**
 * Approach: Kadane's algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 */

public class MaximumProductSubarray {

    public static void main(String[] args) {

        int[] nums = { 2, 3, -2, -5, 6, -1, 4 };
        int product = maxProduct(nums);
        System.out.println(product);
    }

    private static int maxProduct(int[] nums) {
        int n = nums.length;

        int leftProduct = 1;
        int rightProduct = 1;

        // initialize ans to first indexed value
        int ans = nums[0];

        for (int i = 0; i < nums.length; i++) {
            // if any of the leftProduct or rightProduct becomes 0 then update to 1
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            // prefix product
            leftProduct = leftProduct * nums[i];

            // suffix product
            rightProduct = rightProduct * nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }
}
