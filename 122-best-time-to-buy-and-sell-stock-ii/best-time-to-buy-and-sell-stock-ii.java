class Solution {
    public int maxProfit(int[] prices) {
        int i,n=prices.length;
        int bought=prices[0];
        int profit=0;
        for(i=1;i<n;i++){
            if(prices[i]>bought)
            {
                profit=profit+prices[i]-bought;
                bought=prices[i];
            }
            else{
                bought=prices[i];
            }

        }
    return profit;
    }
}