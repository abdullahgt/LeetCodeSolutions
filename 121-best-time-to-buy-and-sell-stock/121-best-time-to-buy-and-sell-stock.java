class Solution {
    public int maxProfit(int[] prices) {
        int lowest = 10000000;
        int highest = 0;
        int indexc = 0;
        int indexb = 0;
        int difference = -1000000000;
        for (int i = 0; i < prices.length; i++) {
            if ((highest - prices[i]) > difference) {
                if(prices[i] < lowest) {
                   lowest = prices[i];
                   indexc = i;
              }
            }
            if (((prices[i] - lowest) >= difference) && i > indexc) {
                //if(prices[i] >= highest) {
                    highest = prices[i];
                    difference = prices[i] - lowest;
               // }
            }
        }
        if (difference < 0) {
            return 0;
        }
        return difference;
    }
}