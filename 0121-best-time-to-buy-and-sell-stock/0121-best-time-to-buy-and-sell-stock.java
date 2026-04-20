class Solution {
    public int maxProfit(int[] prices) {
        int buyprices = prices[0];
        int profit =0;
        for(int i =0;i<prices.length;i++){
            if(buyprices > prices[i]){
                buyprices = prices[i];
            }
            profit = Math.max(profit,prices[i]-buyprices);
        }
        return profit;
    }
}