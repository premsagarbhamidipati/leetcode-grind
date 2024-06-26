package blind75;

/**
 * BestTimeToBuyAndSellStock
 * Kadane's Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    private static int maxProfit(int[] prices) {

        // at the beginning the minimum price is the first price
        // [7,1,5,3,6,4]
        int buy_price = prices[0]; // 7

        // at the beginning the minimum profit is zero
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            // if the current price is less, update the buy_price
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            } else {
                // else check if we can get a better profit
                int current_profit = prices[i] - buy_price;
                profit = Math.max(current_profit, profit);
            }
        }

        return profit;
    }

}