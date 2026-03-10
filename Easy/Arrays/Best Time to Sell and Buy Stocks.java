//Problem : Best time to sell and buy stocks
//Difficulty : Easy 
//Approach : Greedy Algorithm
//Time complexity : o(n)
//Space complexity : o(1)

class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int price : prices){
            if (price < min_price){
                min_price = price;
            }
            else{
                int profit = price - min_price;
                maxprofit = Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
    }   
}
