//you are given an array prices where prices[i]is the price of a given stock on the 
//ith day. You want to maximize your profit by choosing a single day to buy one
//stock and choosing a different day in the future to sell that stock. Return the
//maximum possible profit.
//Example 1: Input: prices = [7,1,5,3,6,]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5
//(price = 6), profit = 6-1 = 5.
//Example 2: Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transaction is done, i.e., max profit = 0



package Arrays;

public class Buy_Sell_Stocks {
    public static int buyAndSellStocks(int prices[]){
        int maxProfit = 0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;//todays profit
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxProfit;
    }   
    

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println( buyAndSellStocks(prices));
    }
}
