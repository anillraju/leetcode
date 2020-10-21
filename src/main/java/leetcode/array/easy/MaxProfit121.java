package leetcode.array.easy;

public class MaxProfit121 {
    class Solution {
        public int maxProfit(int[] prices) {

            int maxProfit = 0;
            if(prices.length < 2){
                return 0;
            }
            int lowest = prices[0];

            for(int i = 1; i < prices.length; i++){
                int currentProfit = prices[i] - lowest;
                maxProfit = Math.max(currentProfit, maxProfit);

                lowest = Math.min(lowest, prices[i]);
            }

            return maxProfit;
        }
    }
}
