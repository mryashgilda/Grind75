package DynamicProgramming;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        //Initializing these values is an important baseline to have
        int buy = prices[0];
        int profit = 0;
        //Run through the current price
        for(int i = 1; i < prices.length; i++){
            //Condition 1: if price is less than buy then its a bad condition to sell here but a better condition to buy hence we update the buying price
            if(prices[i] < buy) {
                buy = prices[i];
            }
            //Condition 2: But, if current price minus buying price is greater than profit then we update profit which is a better condition
            else if(prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
