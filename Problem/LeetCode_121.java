package Problem;

public class LeetCode_121 {
    public int maxProfit(int[] prices) {
        int min = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }

        return profit;
    }
}
