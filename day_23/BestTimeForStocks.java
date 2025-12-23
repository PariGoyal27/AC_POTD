package day_23;

public class BestTimeForStocks {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0, minP = prices[0];
        for(int i = 1; i < n; i++){
            if(prices[i-1] < minP) minP = prices[i-1];
            profit = Math.max(profit, prices[i] - minP);//lowest price before this day
        }
        return profit;
    }
}
