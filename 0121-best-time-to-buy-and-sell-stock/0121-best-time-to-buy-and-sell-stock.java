class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; int buy = prices[0]; int max =0;
        for(int price: prices){
            if(price<buy) buy = price;
            max = Math.max(max,price-buy);
        }
        return max;
    }
}