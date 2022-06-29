import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {

        int max_profit = 0;

        int min_buy = Arrays.stream(prices).max().getAsInt();

        for(int i = 0; i < prices.length; i++) {
            //find actual min buy
            if(prices[i] < min_buy)
                min_buy = prices[i];
            //calc max profit
            if(prices[i] - min_buy > max_profit)
                max_profit = prices[i] - min_buy;
        }

        return max_profit;
    }
}
